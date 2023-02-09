
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.LinkedList;
import java.util.Queue;

class Solution {
  public boolean isPalindrome(ListNode head) {
    Queue<Integer> s = new LinkedList<>();
    return pal(head, s);
  }

  private boolean pal(ListNode cur, Queue<Integer> s) {
    if (cur == null)
      return true;
    s.offer(cur.val);
    return (pal(cur.next, s) && cur.val == s.poll());
  }
}