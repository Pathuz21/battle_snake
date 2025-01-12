class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode ans=null;
        ListNode Currhead=head;
        ListNode Prevhead=null;
        int sum=sum(head);
        int groups=sum/k;
        for(int i=0;i<groups;i++){
            ListNode curr=Currhead;
            ListNode nn=null;
            ListNode prev=null;
            for(int j=0;j<k;j++){
                nn=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nn;
                }
                if(Prevhead ==null){
                    ans=prev;
                    }
                else{
                    Prevhead.next=prev;
                    }
                Prevhead=Currhead;
                Currhead =curr;
            }
        Prevhead.next=Currhead;
        return ans;
    }
