public class Exchange
{
  int number;
  Exchange parent;
  ExchangeList h=new ExchangeList();
  //Exchange children[]=new Exchange[10];
  int noofchildren;
  MobilePhoneSet m=new MobilePhoneSet();
  public Exchange(int a)
  {
    number=a;
	parent=null; //System.out.println("parent of exchange with id "+a+"is setting to be null");
	noofchildren=0;
	MobilePhoneSet m=new MobilePhoneSet();
	
  }
  public int level()
  {  
     if(parent==null){return 0;}
	 return parent.level()+1;
	 
  }
  public void setparent(Exchange a){  parent=a; }
  public void setid(int a)
  { 
   number=a;
  }
  public int id() {return number;}
  public Exchange parent()
  { return parent;}
  public int numChildren()
  { return noofchildren;}
  
  public Exchange child(int i)
  { ExchangeList temp=h; if(i>=noofchildren){System.out.println("Child doesn't exist"); }
    for(int j=0;j<i;j++)
	{temp=temp.next;}
    return temp.root;
  }
  public boolean isRoot()
  { if(parent==null){return true;}
    else {return false;}
  }
  public void addchild(Exchange child)
  { //System.out.println("in fn");
  if(noofchildren==0)
     { noofchildren++; h.root=child;h.next=null;  //System.out.println("first child added");
	 }
	 else
    {noofchildren++;//System.out.println("in fn");
	ExchangeList l=new ExchangeList();
	l.root=child;
	ExchangeList temp=h;
	while(temp.next!=null){temp=temp.next;}
	temp.next=l;
	l.next=null;
	}
	
  }
  public RoutingMapTree Subtree(int i)
  { 
    RoutingMapTree l=new RoutingMapTree();
	ExchangeList temp=h;
    for(int j=1;j<i;j++)
	{temp=temp.next;}
	l.root=temp.root;
	return l;
  }	
  public MobilePhoneSet residentSet()
  {return m;}
  public MobilePhone MobilePhonewithid(int a)
  {
     Node Temp=m.s.Head;
	 while(Temp!=null)
	{ if(Temp.m.id()==a){return Temp.m;}
	 else
	 { Temp=Temp.next;}
	 }
	 System.out.println("Mobilephone not found");
	 return null;
	 
  }
  
}
