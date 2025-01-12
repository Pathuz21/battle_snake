public ListNode LinkListsort012(ListNode head) {
       ListNode zerohead=new ListNode (-1);
       ListNode zerotail=zerohead;
       
       ListNode onehead=new ListNode (-1);
       ListNode onetail=onehead;
       ListNode twohead=new ListNode (-1);
       ListNode twotail=twohead;
       
       ListNode temp=head;
       
       while(temp!=null){
           ListNode nn = temp.next;
           if(temp.val==0){
               temp.next=null;
               zerotail.next=temp;
               zerotail=zerotail.next;
               }
           else if(temp.val==1){
               temp.next=null;
               onetail.next=temp;
               onetail=onetail.next;
               }
           else{
               temp.next=null;
               twotail.next=temp;
               twotail=twotail.next;
               }
           temp=nn;
           
           }
           
       if(onehead.next==null){
           zerotail.next=twohead.next;
           }
       else{
           zerotail.next=onehead.next;
           onetail.next=twohead.next;
           
           }
       onehead.next=null;
       twohead.next=null;
       ListNode l1=zerohead;
       zerohead=zerohead.next;
       l1.next=null;
       return zerohead;
        }
    