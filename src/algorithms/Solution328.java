package algorithms;

public class Solution328 {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null||head.next.next==null){
            return head;
        }else{
            ListNode initial2=head.next;
            ListNode run1=head;
            ListNode run2=head.next;
            
            while(true){
                if(run2.next!=null){
                    run1.next=run2.next;
                    run1=run1.next;
                }else{
                    run1.next=null;
                    break;
                }
                
                if(run1.next!=null){
                    run2.next=run1.next;
                    run2=run2.next;
                }else{
                    run2.next=null;
                    break;
                }
            }
            if(run1.next==null){
                run1.next=initial2;
            }else{
                run1.next.next=initial2;
            }
            return head;
        }
    }
}