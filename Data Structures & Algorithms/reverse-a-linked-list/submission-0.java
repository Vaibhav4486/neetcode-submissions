
class Solution 
{
    ListNode dummy=new ListNode(0);
    public ListNode reverseList(ListNode head) 
    {
        if(head == null) return null;  
        h(head);
       return dummy.next;
    }
    public ListNode h(ListNode head)
    {
          if(head.next==null)
        {
            dummy.next=head;
            return head;
        }
        ListNode curr=h(head.next);
        curr.next=head;
        head.next=null;
        return head;
    }
}