package Prepinsta;
import java.io.*;

public class linkedlist {
	Node head=null;
	Node tail=null;
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
		void Insert_at_end(int val) {
			Node temp= new Node(val);
			if(head==null) {
				head=temp;
		}
			else {
				tail.next=temp;
			}
			tail=temp;
	}
		void Insert_at_Start(int val) {
			Node temp=new Node(val);
			if(head==null) {
				head=temp;
				tail=temp;
			}
			else{
				temp.next=head;
				head=temp;
			}
		}
		int size() {
			Node temp=head;
			int count=0;
			while(temp!=null) {
                  count++;
				temp=temp.next;
		}
			return count;
	}
		void Insert_at_any_index(int index,int val) {
			if(index<0||index>size()) {
				System.out.println("Enter valid index");
			}
			else if(index==size()) {
				Insert_at_end(val);
			}
			else if(index==0) {
				Insert_at_Start(val);
			}
			else {
				Node t = new Node(val);
				Node temp=head;
				for(int i=0;i<=index-1;i++) {
					temp=temp.next;
				}
				t.next=temp.next;
				temp.next=t;
			}
		}
			public void display() {
				Node temp=head;
				while(temp!=null) {
					System.out.print(temp.data+" ");
					temp=temp.next;
				}
			}
		
			int get_index(int index) {
				Node temp= head;
				for(int i=0;i<=index;i++) {
					temp=temp.next;
				}
				return temp.data;
			}
			void Delete_at(int index) {
				if(index==0) {
					head=head.next;
				}
				Node temp=head;
				if(head==null) {
					System.out.println("List is empty");
				}
					else {
					for(int i=0;i<=index-1;i++) {
					temp=temp.next;
					}	
					temp.next=temp.next.next;
					tail=temp; 
					}
				}
	public static void main(String[] args) {
		linkedlist ll=new linkedlist();
		ll.Insert_at_end(5);
	    ll.Insert_at_end(10);
	    ll.Insert_at_end(15);
	    ll.Insert_at_end(20);
	    ll.Insert_at_Start(35);
	    ll.Insert_at_any_index(2, 40);
	    System.out.println(ll.get_index(3));
	    System.out.println(ll.size());
	    ll.display();
	    ll.Delete_at(0);

	}

}
