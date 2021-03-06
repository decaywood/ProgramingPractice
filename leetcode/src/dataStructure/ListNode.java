package dataStructure; /**
 * @author: decaywood
 * @date: 2015/8/15 11:24
 */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode(int x, ListNode next) {
        val = x;
        this.next = next;
    }

    public static ListNode generateTestCase(int... testcase) {
        ListNode head = new ListNode(0);
        ListNode res = head;
        for (int i : testcase) {
            head.next = new ListNode(i);
            head = head.next;
        }
        return res.next;
    }




}
