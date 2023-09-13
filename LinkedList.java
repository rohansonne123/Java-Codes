public class LinkedList {
    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val=val;
            this.next=next;
        }
    }
    // public static ListNode reverseList(ListNode head) {
    //     ListNode curr=head;
    //     ListNode pre=null;
    //     ListNode Next;

    //     while(curr!=null){
    //         Next=curr.next;
    //         curr.next=pre;
    //         pre=curr;
    //         curr=Next;
            
    //     }

    //     return pre;
    // }
    // public static boolean isPalindrome(ListNode head1) {
       
    //     ListNode temp=head1;
    //     ListNode new1=null;
    //     int i=1;
    //     while(temp.next!=null){
    //         i++;
    //         temp=temp.next;
    //     }
    //     if(i==1 || head1==null){
    //         return true;
    //     }
    //     temp=head1;
    //     int j=1;
    //     if(i%2!=0){
    //         while(j<i/2){
    //           temp=temp.next;
    //            j++;
    //         }
    //        ListNode new6=reverseList(temp.next.next);
    //         temp.next=null;
    //        new1=head1;
    //        while(new1!=null || new6!=null){
    //          if(new1.val==new6.val){
    //             new1=new1.next;
    //             new6=new6.next;
    //         }else{
    //             return false;
    //         }
    //     }
    //  }else{
    //     while(j<i/2){
    //           temp=temp.next;
    //            j++;
    //         }
    //        ListNode new6=reverseList(temp.next);
    //         temp.next=null;
    //        new1=head1;
    //        while(new1!=null || new6!=null){
    //          if(new1.val==new6.val){
    //             new1=new1.next;
    //             new6=new6.next;
    //         }else{
    //             return false;
    //         }
    //     }
    //  }
        

    //     return true;
    // }
    // public static ListNode reverseList(ListNode head1,ListNode new2) {
    //     ListNode curr=head1;
    //     ListNode pre=null;
    //     ListNode Next;

    //     while(curr!=new2){
    //         Next=curr.next;
    //         curr.next=pre;
    //         pre=curr;
    //         curr=Next;
            
    //     }

    //     return pre;
    // }
    // public static ListNode reverseBetween(ListNode head1, int left, int right) {
    //     ListNode temp=head1;
    //     int i=1;
    //     while(i!=left-1){
    //         temp=temp.next;
    //         i++;
    //     }
    //     ListNode new1=temp;
    //     temp=temp.next;
    //     System.out.println(temp.val);
    //    while(i!=right-1){
    //        temp=temp.next;
    //        i++;
    //    }
    //    ListNode new2=temp.next;
    //    ListNode rev=reverseList(new1.next,new2);
    //    new1.next=rev;
    //    temp=rev;
    //    while(temp.next!=null){
    //        temp=temp.next;
    //    }
    //    temp.next=new2;
        
    //    return head1;

    // }
    
    
    public static void addFirst(int data){
        ListNode newnode=new ListNode(data);
        if(head==null){
            head=newnode;
        }else{
            newnode.next=head;
            head=newnode;
        }
    }
    public static void addFirst1(int data){
        ListNode newnode=new ListNode(data);
        if(head1==null){
            head1=newnode;
        }else{
            newnode.next=head1;
            head1=newnode;
        }
    }
    public static ListNode head;
     public static ListNode head1;
    public static void main(String args[]){
        LinkedList ll=new LinkedList();
        ll.addFirst1(9);
        // ll.addFirst(4);
        // ll.addFirst(3);
        // ll.addFirst(2);
        // ll.addFirst(1);
        LinkedList ll2=new LinkedList();
        ll2.addFirst(9);
        ll2.addFirst(9);
        ll2.addFirst(9);
        ll2.addFirst(9);
        ll2.addFirst(9);
        ll2.addFirst(9);
        ll2.addFirst(1);
       // System.out.println(addTwoNumbers(ll.head,ll2.head).val);
       ListNode temp1=addTwoNumbers(head1,head);
       ListNode temp=temp1;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
        
       // ListNode new7=reverseBetween(head, 2, 4);
        // while(new7.next!=null){
        //     System.out.println(new7.val);
        //     new7=new7.next;
        // }
        
        
    }
}
