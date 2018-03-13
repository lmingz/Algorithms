public class Main {

    public static void main(String[] args) {
	// write your code here
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
    }
}
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return new ListNode(l1.val);

    }
    public int convertLinkedList2Int(ListNode l){
        int exp = 1, valDec = 0;
        ListNode a = new ListNode(0);
        a = l;
        for (exp = 1;a.val != null; exp *= 10){
            valDec += exp * a.val;
            a = a.next;
        }
        return valDec;
    }
}