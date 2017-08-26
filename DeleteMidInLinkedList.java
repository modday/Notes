
public class DeleteMidInLinkedList {
	
	public static Node Delete(Node head)
	   { 	if(head==null) return null;
				 
				Node fast=head,low=head;
				while(fast.nextNode !=null)
				{
					low=low.nextNode ;
					if(fast.nextNode.nextNode !=null)
					fast=fast.nextNode.nextNode;
					else fast=fast.nextNode ;
				}
				if(low.nextNode!=null)
				  {  low.nodevalue=low.nextNode.nodevalue;
				    low.nextNode=low.nextNode.nextNode;
				  }
				  else head.nextNode=null;
				return head;		
		}
	public static void Display(Node head)
	{
		while(head!=null) 
		{
			System.out.println(head.nodevalue);
			head=head.nextNode;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(1);
        head.nextNode=new Node(2);
        head.nextNode.nextNode=new Node(3);
        head.nextNode.nextNode.nextNode=new Node(4);
        head.nextNode.nextNode.nextNode.nextNode=new Node(5);
        head.nextNode.nextNode.nextNode.nextNode.nextNode=new Node(6);
        
        Display(Delete(head));
	}

}
