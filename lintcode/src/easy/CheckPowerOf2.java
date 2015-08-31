package easy;

/**
 * @author: decaywood
 * @date: 2015/8/28 11:20
 *
 * Using O(1) time to check whether an integer n is a power of 2.
 *
 * Example
 * For n=4, return true;
 *
 * For n=5, return false;
 *
 * Challenge
 * O(1) time
 *
 */
public class CheckPowerOf2 {

    public boolean checkPowerOf2(int n) {
            return n > 0 && (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
    }
}