
public class RemoveDuplicate {

	static Node removeDuplicates(Node head)
    {
	  if(head==null||head.nextNode==null) return head;
	  Node temp=head.nextNode,h=head;
	  while(temp!=null)
	  {
	      if(h.nodevalue!=temp.nodevalue)
	      {
	          h.nextNode=temp;
	          h=h.nextNode;
	      }
	      else { temp=temp.nextNode;h.nextNode=null;}
	  }
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
        head.nextNode.nextNode=new Node(2);
        head.nextNode.nextNode.nextNode=new Node(4);
        head.nextNode.nextNode.nextNode.nextNode=new Node(5);
        head.nextNode.nextNode.nextNode.nextNode.nextNode=new Node(5);
        
        Display(removeDuplicates(head));
	}

}