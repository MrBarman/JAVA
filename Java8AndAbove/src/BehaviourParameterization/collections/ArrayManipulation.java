package BehaviourParameterization.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class ArrayManipulation {
    public static void main(String[] args) {
        //find duplicates
        int[] arr = {1,2,3,3,4,5,5};
        List<Integer> res = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),counting()))
                .entrySet().stream()
                .filter(k -> k.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(res);

        //find unique
        Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),counting()))
                .entrySet().stream().filter(i->i.getValue()==1)
                .map(Map.Entry::getKey).forEach(System.out::println);

        //reverse sorting
        Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
