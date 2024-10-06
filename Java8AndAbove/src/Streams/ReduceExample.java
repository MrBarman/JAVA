package Streams;

import java.util.stream.IntStream;

public class ReduceExample {
    public static void main(String[] args) {
        Integer sum = IntStream.range(0,100)
                .reduce(0, Integer::sum); //first param is initial value in streams
        System.out.println(sum);
    }
}
