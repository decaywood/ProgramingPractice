package medium;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: decaywood
 * @date: 2015/7/26 13:33
 *
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ? n/2 ? times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 */
public class MajorityElementII {


    public static List<Integer> majorityElement(int... nums) {

        HashMap<Integer, Integer> result = new HashMap<>();
        Arrays.stream(nums).forEach(x -> result.put(x, result.containsKey(x) ? result.get(x) + 1 : 1));
        return result.entrySet().stream().filter(entry -> entry.getValue() > nums.length / 3).map(Map.Entry::getKey).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(1, 1, 1, 1, 24, 4, 4, 4, 2, 3, 2));
    }
}
