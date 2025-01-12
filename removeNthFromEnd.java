public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(slow!=null && n!=0){
            n--;
            slow=slow.next;
            }
        if(n!=0){
            return head;
            }
        if(slow==null){
            ListNode temp=head;
            head=head.next;
            temp.next=null;
            return head;
            }
        while(slow!=null){
            slow=slow.next;
            prev=fast;
            fast=fast.next;
            }
            prev.next=fast.next;
            fast.next=null;
        return head;
    }