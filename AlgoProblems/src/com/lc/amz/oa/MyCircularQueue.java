package com.lc.amz.oa;

class MyCircularQueue {
    
    class ListNode{
        int val;
        ListNode next;
        ListNode prev;
        ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;
        }
        
        ListNode(int val,ListNode next,ListNode prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }

    ListNode head;
    ListNode tail;
    int size=0;
    int currSize=0;
    
    public MyCircularQueue(int k) {
        this.size=k;
        head=new ListNode(-1,null);
        tail=new ListNode(-1,null,head);
        head.next=tail;
        this.currSize=0;
    }
    
    public boolean enQueue(int value) {
        if(currSize<size){
            ListNode t = new ListNode(value,tail);
            tail.prev.next=t;
            currSize++;
            return true;
        }else{
            return false;
        } 
        
    }
    
    public boolean deQueue() {
        if(currSize==0){
            return false;
        }else{
            head.next.next.prev=head;
            currSize--;
            return true;
        }
    }
    
    public int Front() {
        return tail.prev.val;
    }
    
    public int Rear() {
        return head.next.val;
    }
    
    public boolean isEmpty() {
        return currSize==0;
    }
    
    public boolean isFull() {
        return currSize==size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
