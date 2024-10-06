/**
 * Given two list of numbers [1,2,3],[4,5], return all pairs of numbers
 * o/p - (1,4),(1,5),(2,4),(2,5),(3,4),(3,5)
 */
package Streams;

import java.util.Arrays;
import java.util.List;

public class AllPairsMappingExample {
    public static void main(String[] args) {
        List<Integer> nums1 = Arrays.asList(1, 2, 3);
        List<Integer> nums2 = Arrays.asList(4, 5);
        //we can't use map twice here because in this cas map returns Stream<Stream<int[]>>
        List<int[]> pairs = nums1.stream()
                .flatMap(x -> nums2.stream().map(y -> new int[]{x, y})).toList();

        pairs.forEach(pair->System.out.println(pair[0]+","+pair[1]));
    }
}
