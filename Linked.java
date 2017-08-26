
public class Linked {

		public static Node Method1(Node head)
		{
			if(head==null) return null;
			//if(head.nextNode==null)
			Node fast=head,low=head;
			while(fast.nextNode!=null)
			{
				low=low.nextNode;
				if(fast.nextNode.nextNode!=null)
				fast=fast.nextNode.nextNode;
				else fast=fast.nextNode;
			}
			return low;		
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	     Node head=new Node(1);  //1
	          head.nextNode=new Node(2);//2
	          head.nextNode.nextNode=new Node(3);//2
	          head.nextNode.nextNode.nextNode=new Node(4);//3
	          head.nextNode.nextNode.nextNode.nextNode=new Node(5);//3
	          head.nextNode.nextNode.nextNode.nextNode.nextNode=new Node(6);//4
	           
	          System.out.println(Method1(head).nodevalue);
		}
		}
	 