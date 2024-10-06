package Streams;

import java.util.Arrays;
import java.util.List;

public class BasicMapFilterExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("One","Two", "Three", "One");
        //returning the length of each word
        List<Integer> wordLength = words.stream().map(String::length).toList();
        System.out.println(wordLength);

        //convert to char array
        /**
         * The problem converting the list to char array is that
         * we con not convert only using map as lambda passed to the map method returns String[] for each word
         * the stream returned by the map method in this case is of type Stream<String[]>
         */
       List<String> charList =  words.stream().
               map(s->s.split(""))
               .flatMap(Arrays::stream)
               .distinct()
               .toList();
        System.out.println(charList);
    }
}
