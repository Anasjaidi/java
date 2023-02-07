/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public ListNode reverseList(ListNode head) {
    ListNode cur = null, prev = null, next = null;
    cur = head;
    while (cur != null) {
      next = cur.next;
      cur.next = prev;
      prev = cur;
      cur = next;
    }
    return prev;
  }

  ListNode revList(ListNode cur, ListNode prev) {
    if (cur == null)
      return null;
    if (cur.next == null) {
      cur.next = prev;
      return (cur);
    }
    ListNode tmp = cur.next;
    cur.next = prev;
    System.out.println(tmp.val);
    return (revList(tmp, cur));
  }
}