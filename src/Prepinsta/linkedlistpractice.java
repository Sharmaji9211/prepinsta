package Prepinsta;

public class linkedlistpractice {
	Nodes head = null;
	Nodes tails = null;
	public static class  Nodes {
		int  data ;
		Nodes next;
		Nodes(int  data){
			this.data=data;	
			}
		
	}
	
	void Insert_at_end(int data) {
		Nodes temp=new Nodes(data);
		if(head==null) {
			head=temp;
		}
		else {
			tails.next=temp;
		}
		tails=temp;
		
	}
 
}
