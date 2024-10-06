package Streams.TraderTransactionUsingStream;

public class TransactionModel {
    private final TraderModel trader;
    private final int year;
    private final int value;

    public TransactionModel(TraderModel trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public TraderModel getTrader() {
        return trader;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "\nTransaction: {\n" +
                "trader: " + trader +
                ",\n year: " + year +
                ", value: " + value + '\n' +
                '}'+'\n';
    }
}
