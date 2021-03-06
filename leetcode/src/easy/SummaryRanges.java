package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: decaywood
 * @date: 2015/7/29 20:52
 *
 *
 * Given a sorted integer array without duplicates, return the summary of its ranges.
 * For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 *
 */
public class SummaryRanges {


    public static List<String> summaryRanges(int... nums) {

        List<String> list = new ArrayList<>();
        if(nums.length == 0) return list;
        if(nums.length == 1) {
            list.add(String.valueOf(nums[0]));
        }

        int[] tuple = new int[2];
        tuple[0] = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            tuple[1] = nums[i];
            int next = nums[i + 1];
            count(list, tuple, next);
            if (i + 1 == nums.length - 1) {
                tuple[1] = next;
                list.add(tuple[0] == tuple[1] ? String.valueOf(next) : tuple[0] + "->" + tuple[1]);
            }
        }
        return list;
    }

    private static void count(List<String> list, int[] tuple, int next) {
        if (tuple[1] + 1 != next) {
            String str = tuple[0] == tuple[1] ? String.valueOf(tuple[0]) : tuple[0] + "->" + tuple[1];
            list.add(str);
            tuple[0] = next;
            tuple[1] = next;
        }
    }



   /* public static List<String> summaryRanges(int... nums) {

        if(nums.length == 0) return new ArrayList<>();

        StringBuilder builder = new StringBuilder();
        builder.append(String.valueOf(nums[0]) + ",");
        int sequence = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            sequence++;
            int next = nums[i + 1];

            if (sequence != next) {
                sequence = next;
                builder.deleteCharAt(builder.length() - 1);
                builder.append("##");
            }
            builder.append(String.valueOf(next) + ",");
        }
        builder.deleteCharAt(builder.length() - 1);
        return Stream.of(builder.toString().split("##")).map(str -> {
            String[] strs = str.split(",");
            return strs.length == 1 ? strs[0] : strs[0] + "->" + strs[strs.length - 1];
        }).collect(Collectors.toList());
    }*/

    public static void main(String[] args) {
        List<String> list = summaryRanges( 0, 1, 2);
        for (String s : list) {
            System.out.println(s);
        }
    }

}
