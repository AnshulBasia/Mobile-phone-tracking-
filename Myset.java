public class Myset
{
  Node Head=new Node();
   public Myset()
   {  // System.out.println("C11ALLED");
   Head=null;
   }

  public boolean IsEmpty()
  {   
    if(Head==null){return true;}
    else {return false;}
  }
  public boolean IsMember(int a)
  {
    Node temp=Head;
    while(temp!=null)
     {
          if(temp.m.id()==a){return true;}
          else {temp=temp.next;}
    }
    return false;
  }
  public void Insert(MobilePhone a)
  {   //Inserting at top
     Node ins=new Node();  Node temp=new Node(); temp=Head;
	 MobilePhone k=new MobilePhone(a.id());
	 ins.m=k; //System.out.println("insert being called");
	 if(Head==null){ins.next=null; Head=ins;}//System.out.println("First insertion...inserted-"+ins.m.id());}
	 else
	 {
	 
	 //System.out.println("after first..inserted-"+ins.m.id());
	   //ins.next=Head; Head=ins;
	    while(temp.next!=null){temp=temp.next;}
		temp.next=ins;ins.next=null;
		
	 
	 }
	 
  }
  public void Delete(MobilePhone a)
  {
      if(Head==null){System.out.print("EMPTY"); return;}
	  Node temp=Head; //System.out.println("deletion1");
	  if(temp.m.id()==a.id())
	  {
	  //System.out.println("deletion2 "+temp.m.id());
	  temp=temp.next; Head=temp; return;
	  }
	  while(temp.next!=null)
	  {//System.out.println("deletion3 "+temp.next.m.id());
	     if(temp.next.m.id()==a.id())
		    {  
	            temp.next=temp.next.next; return;
		    }
		temp=temp.next;
	  
	  }
	  System.out.println("Object not found");return;
  }
  
  public Myset Union(Myset a)
  {  
    
	Myset un=new Myset();
	Node temp=Head;
	while(temp!=null)
	{
	   un.Insert(temp.m);
	   temp=temp.next;
	
	}
	temp=a.Head;
	while(temp!=null)
	{
	   un.Insert(temp.m);
	   temp=temp.next;
	
	}
	return un;
  
  
  }
  
  public Myset Intersection(Myset a)
  {
  
    Myset in=new Myset();
	Node temp=Head;
	while(temp!=null)
	{
	  if(a.IsMember(temp.m.no)==true)
	  {
	    in.Insert(temp.m);
	  }
	  temp=temp.next;
	}
	return in;
 }







}
