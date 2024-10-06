/**
 * Problems to be solved are mentioned against each solution
 */

package Streams.TraderTransactionUsingStream;

import java.util.*;
import java.util.stream.Collectors;

public class TraderTransactionUsingStreams {
    public static void main(String[] args) {
        TraderModel jhon = new TraderModel("Jhon","India");
        TraderModel mathew = new TraderModel("Mathew","USA");
        TraderModel luke = new TraderModel("Luke","India");
        TraderModel bro = new TraderModel("Bro","India");

        List<TransactionModel> transactions = Arrays.asList(
                new TransactionModel(bro, 2011, 300),
                new TransactionModel(jhon, 2012, 1000),
                new TransactionModel(jhon, 2011, 400),
                new TransactionModel(mathew, 2012, 710),
                new TransactionModel(mathew, 2012, 700),
                new TransactionModel(luke, 2012, 900)
        );

        /**
         * Find all transactions in the year 2011 and sort them by value small to high
         */
        List<TransactionModel> transactionsIn2011 = transactions.parallelStream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(TransactionModel::getValue))
                .toList();
        System.out.println(transactionsIn2011);

        /**
         * What are all unique countries where the traders work
         */
        Set<String> uniqueCities = transactions.parallelStream()
                .map((transactionModel) -> transactionModel.getTrader().getCity())
             //   .distinct().toList() //or toSet without using distinct
                .collect(Collectors.toSet());
        System.out.println(uniqueCities);

        /**
         * Find all traders from India and sort them by name
         */

        List<TraderModel> traders = transactions.parallelStream()
                .map(TransactionModel::getTrader)
                .filter(trader -> trader.getCity().equals("India"))
                .distinct()
                .sorted(Comparator.comparing(TraderModel::getName))
                .toList();
        System.out.println(traders);

        /**
         * Return a stream of all trader names sorted alphabetically
         */
        String traderNames = transactions.parallelStream()
                .map(transactionModel -> transactionModel.getTrader().getName())
                .distinct()
                .sorted()
               // .reduce("",(s1,s2)->s1+s2); //reduce is inefficient as it is creating new object in each concatenation
                .collect(Collectors.joining(", "));
        System.out.println(traderNames);

        /**
         * Are any traders based in USA
         */
//        Boolean isPresent = transactions.parallelStream()
//                .filter(transactionModel -> transactionModel.getTrader().getCity().equals("USA"))
//                .findAny()
//                .isPresent();
        Boolean isPresent = transactions.parallelStream()
                .anyMatch(transactionModel -> transactionModel.getTrader().getCity().equals("USA"));
        System.out.println(isPresent);

        /**
         * Print all transaction values from the traders living in India
         */

        transactions.parallelStream()
                .filter(transactionModel -> transactionModel.getTrader().getCity().equals("India"))
                .map(TransactionModel::getValue)
                .forEach((val)->System.out.print(val+" "));
            System.out.println();
        /**
         * Highest value of all the transactions
         */
        Optional<Integer> max = transactions.parallelStream()
                .map(TransactionModel::getValue)
                .distinct()
                .reduce(Integer::max);
        max.ifPresent(System.out::println);

        /**
         * find Transaction with smallest value
         */
        Optional<TransactionModel> minTransactionWithReduce  = transactions.parallelStream()
                .reduce((t1,t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
        minTransactionWithReduce.ifPresent(System.out::println);
        Optional<TransactionModel> minTransaction  = transactions.parallelStream()
                .min(Comparator.comparing(TransactionModel::getValue));
        minTransaction.ifPresent(System.out::println);
        
    }

}
