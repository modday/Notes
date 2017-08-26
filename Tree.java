import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Tree {
	public static void LevelUsingNull(tNode root)
	{System.out.println("Null");
		if(root==null) return ;
		Queue q=new LinkedList<tNode>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty())
		{
			tNode t=(tNode) q.poll();
			if(t==null) 
				{System.out.println();
				if(!q.isEmpty())
				q.add(null);}
			else
			{   System.out.print(t.nodeValue);
				if(t.lChild!=null) q.add(t.lChild);
				if(t.rChild!=null) q.add(t.rChild);
			}
		}
	}
	public static void LevelUsing2Q(tNode root)
	{System.out.println("2Q");
		if(root==null) return ;
		Queue q=new LinkedList<tNode>();
		Queue q1=new LinkedList<tNode>();
		q.add(root);
		tNode t=null;
		while(!q.isEmpty())
		{
			
			if(!q.isEmpty()) 
			{    t=(tNode) q.poll();
				 System.out.print(t.nodeValue);
				 if(t.lChild!=null) q1.add(t.lChild);
				 if(t.rChild!=null) q1.add(t.rChild);
		     }
			if(q.isEmpty())
			{   System.out.println();
			while(!q1.isEmpty())
			{
				  t=(tNode) q1.poll();
				  System.out.print(t.nodeValue);
				if(t.lChild!=null) q.add(t.lChild);
				 if(t.rChild!=null) q.add(t.rChild);
			}
			System.out.println();
			}
		}
	}
	public static void LevelUsingCounter(tNode root)
	{System.out.println("Counter");
		if(root==null) return ;
		Queue q=new LinkedList<tNode>();
		q.add(root);
		int cnt=1,newcnt=0;;
		while(!q.isEmpty())
		{
			tNode t=(tNode) q.poll();
			cnt--;
		       System.out.print(t.nodeValue);
				if(t.lChild!=null) {q.add(t.lChild);newcnt++;}
				if(t.rChild!=null) {q.add(t.rChild);newcnt++;}
			if(cnt==0)
			{System.out.println();
			 cnt=newcnt;
			 newcnt=0;
			}                                
		}
	}
	public static void SpiralOrder(tNode root)
	{System.out.println("Spiral");
		if(root==null) return ;
	     Stack<tNode> s1=new Stack<tNode>();
	     Stack<tNode> s2=new Stack<tNode>();
	     s1.push(root);
	     while(!s1.isEmpty())
	     {
	    	 root=s1.pop();
	    	 System.out.print(root.nodeValue);
	    	 if(root.lChild!=null)  s2.push(root.lChild);
	    	 if(root.rChild!=null)  s2.push(root.rChild);    	 
	    	 if(s1.isEmpty())
	    	 {   System.out.println();
	    		 while(!s2.isEmpty())
	    		 {
	    		 root=s2.pop();
	    		 System.out.print(root.nodeValue);
	    		 if(root.rChild!=null)  s1.push(root.rChild);
	    		 if(root.lChild!=null)  s1.push(root.lChild);
		    	 }
	    		 System.out.println();
	    	 }
	      }
	   }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
tNode root=new tNode(5);
  root.lChild=new tNode(6);
  root.rChild=new tNode(7);
  root.lChild.rChild=new tNode(4);	
  root.rChild.lChild=new tNode(3);	
  
   LevelUsing2Q(root);
   LevelUsingNull(root);
   LevelUsingCounter(root);
   SpiralOrder(root);
	}

}

class tNode
{
	public int nodeValue;
	  tNode lChild;
	  tNode rChild;
	tNode(int a)
	{
		nodeValue=a;
	}
}