public class RoutingMapTree
{  //Exchange root;
 Exchange root=new Exchange(0);
 Exchange k,ps,ps2,ps3;
 boolean exchange_found;
 int ro;
   public RoutingMapTree()
   {  Exchange root=new Exchange(0);
  // System.out.println("ex"+root.id());
     
   }
   public Exchange root()
   {return root;
   }
   public int rootid()
   {
       return root.id();
   }
   
   public boolean containsNode(Exchange a, Exchange root)
   {
     if(root.id()==a.id()){return true; }
	 else 
	    for(int i=0;i<root.numChildren();i++)
		   { 
		       if(containsNode(a,root.child(i))==true)
			      {return true;}
				  
		   }
		   
    return false;
   }
   
   public void switchON(MobilePhone a,Exchange b)
   {
     if(a.status()==false)
	 { 
	    a.switchOn();
		b.m.reg(a);
     } return;
	 
   }
   
   public boolean containsmobile(MobilePhone a,Exchange root)
   {
     if(root.m.s.IsMember(a.id())==true){return true;}
	 else
	    for(int i=0;i<root.numChildren();i++)
		   {
		      if(containsmobile(a,root.child(i))==true)
			  {return true; }
		   }
     return false;		   
   }
   
   public void switchOFF(MobilePhone a,Exchange root)
   {
      if(a.status()==true)
	  {
     	  a.switchOff();
		  if(root.m.s.IsMember(a.id())==true){root.m.dreg(a);}
		  else
		    { 
			  for(int i=0;i<root.numChildren();i++)
			   {switchOFF(a,root.child(i));}
			}
		  
	  }
	  return;
   }
   public void findPhone(MobilePhone m,Exchange root)
   {
       if(root.m.s.IsMember(m.id())==true&&m.status()==true)
	   {
	   ps2=root;ro=1;//System.out.print("found"+ps2.id()); 
	   return;
	   }
	   else
	   {
	   for(int i=0;i<root.numChildren();i++)
	   {findPhone(m,root.child(i));}
	   }
	   
	   return;
	   
	   
   }
   public void lowestRouter(Exchange a,Exchange b)
   { if(a.id()==b.id()){ps3=a;return;}  
     if(a.parent()==null){ps3=a; return;} if(b.parent()==null){ps3=b;return;}
     if(a.parent.id()==b.parent.id()){ ps3=a.parent();return;}
	 if(a.level()==b.level()){lowestRouter(a.parent(),b.parent());}
	 if(a.level()<b.level()){lowestRouter(a,b.parent());}
	 if(a.level()>b.level()){lowestRouter(a.parent(),b);}
	    //System.out.println("WHATTT");return a;
		return;
	 
	  
   }
   public ExchangeList routeCall(MobilePhone a, MobilePhone b)
   {    if(a.status()==false){System.out.print("Error - Mobile phone with identifier "+a.id()+" is currently switched off"); return null;}
        if(b.status()==false){System.out.print("Error - Mobile phone with identifier "+b.id()+" is currently switched off"); return null;}
       
      ExchangeList head=new ExchangeList();
	  findPhone(a,root);
	  Exchange e=ps2;
	  findPhone(b,root);
	  Exchange f=ps2; 
	  lowestRouter(e,f);
	  Exchange g=ps3;//System.out.println(g.id());
	  head.root=e;head.next=null;
	  if(e.id()==f.id()){return head;}
	  
	  Exchange temp=e.parent();
	  ExchangeList t=head;
	  if(temp!=null)
	  {while(temp!=g)
	  {
	    ExchangeList l=new ExchangeList();
		l.root=temp;
	    l.next=null;
		t.next=l;
		t=t.next;
		temp=temp.parent();
	  }
	  ExchangeList l=new ExchangeList();
		l.root=temp;
	    l.next=null;
		t.next=l;
		t=t.next;
		}

		ExchangeList q=new ExchangeList(); 
		q.root=f;q.next=null;
		temp=f.parent();
		ExchangeList y=q;
		if(temp!=null)
		
		{
		while(temp!=g)
		{
		ExchangeList r=new ExchangeList();
		r.root=temp;
		r.next=y;
		y=r;
		temp=temp.parent();
		
		
		}
		
		t.next=y;}
		return head;
		
	  
	  
	  
	  
   } 
   public void se(MobilePhone a,Exchange root)
   {
       if(root.m.s.IsMember(a.id())==true){ k=root;return;}
	   else
	   {
	     for(int j=0;j<root.numChildren();j++)
		 { 
		     se(a,root.child(j));
		 }
	   }
	   return;
   
   }
   public void movePhone(MobilePhone a,Exchange b)
   {
      if(a.status()==true)
	  {    se(a,root);
	    b.m.s.Insert(a);
		//System.out.println(k.id()+"del");
	    k.m.s.Delete(a);
		//System.out.println(k.id()+"del2");
		findPhone(a,root);
		//System.out.println("now "+a.id()+" is at "+ps2.id());
	  }
	  
	  
	  
	  else
	  {System.out.println("switch on the mobile phone");}
   }
   
   
   boolean done;
   public void search(int a, Exchange root,Exchange e)
    {
     if(root.id()==a)
	 {
	 root.addchild(e); e.setparent(root); //System.out.println(e.parent.id());
	 //System.out.println("parent of "+e.id()+" is "+e.parent.id()); System.out.println("level of "+e.id()+" is "+e.level());
	 done=true; return;
	 }
	 else 
	    { for(int i=0;i<root.numChildren();i++)
		    { 
		      search(a,root.child(i),e);
			}
		}	
    }
	Exchange p; boolean done1;
	public void sw(int a, Exchange root,int b)
    { //System.out.println("create11");
     if(root.id()==b)
	   {  //System.out.println("create");
	      p=root; done1=true;
	      if(root.m.s.IsMember(a)==true)
		    {   //System.out.println("in if");
			     Node temp=root.m.s.Head;
                 while(temp!=null)
                    {
					   if(temp.m.id()==a){temp.m.switchOn();done=true;return;}
					   temp=temp.next;
                    }					
			}
			else{done=false;return;}
	   }	
	 else 
	    { for(int i=0;i<root.numChildren();i++)
		    {  
		      sw(a,root.child(i),b);
			}
		}	
    }
	public void sw2(int a, Exchange root)
    {
     if(root.m.s.IsMember(a)==true)
	   
	    {  //System.out.println(root.id());
			     Node temp=root.m.s.Head;
				// System.out.println(temp.m.id());
                 while(temp!=null)
                    {
					   if(temp.m.id()==a){temp.m.switchOff();done=true;return;}
					   temp=temp.next;
                    }					
	    }
	   	
	 else 
	    { for(int i=0;i<root.numChildren();i++)
		    { 
		      sw2(a,root.child(i));
			}
		}	
    }
	int o=5;
	public void qu(int a,Exchange root,int b)
	{
	  if(root.number==a)
	    {
		   Exchange w=root.child(b);
		   int q=w.id();
		    System.out.println(q);o=10;return;
		}
	  else
	    { 
		  for(int i=0;i<root.numChildren();i++)
		     {qu(a,root.child(i),b);}
		}
		//System.out.println("Parent you entered identifier of not found");
	}
	int t=0;int l;
	public void qu2(int a,Exchange root)
	{ //System.out.println("in qu2 "+root.id()+" "+a);
	  if(root.id()==a||t==5)
	     {//System.out.println("in if"+root.id());
		 t=5;
		    Node temp=root.m.s.Head;
			while(temp!=null)
			    {  if(temp.m.status()==true)
				  { if(l==0){System.out.print(", ");  } l=0; System.out.print(temp.m.id());    }
				  temp=temp.next;
				}         
				for(int i=0;i<root.numChildren();i++)
		     { qu2(a,root.child(i));}
		 }
	   else
	     {
		   for(int i=0;i<root.numChildren();i++)
		     { qu2(a,root.child(i));}
		 }
	}
   public void performAction(String actionMessage)
    {  
     switch(actionMessage.substring(0,10))
	   
       {  case "addExchang":
	                     
	                    String s="";
						  
						  int x=12;
						  while((int)actionMessage.charAt(x)!=32)
						  {
						    
							s+=actionMessage.charAt(x);
							x++;
						  }
						  x++; int a=Integer.parseInt(s);
						  s=actionMessage.substring(x,actionMessage.length());
						 
                        
		                 int b=Integer.parseInt(s);
		                Exchange e=new Exchange(b);
		               
						search(a,root,e);
						//Exchange y=root.child(0);
						//int z=y.id();
						//System.out.println("Exchange with id"+b+"is just added");
		               
		                if(done!=true)
		                { System.out.println("Exchange with id a NOT FOUND");}
						break;
						
		 case "switchOnMo":
		                   
						   
						   s="";
						  
						   x=15;
						  while((int)actionMessage.charAt(x)!=32)
						  {
						    
							s+=actionMessage.charAt(x);
							x++;
						  }
						  x++; a=Integer.parseInt(s);
						  s=actionMessage.substring(x,actionMessage.length());
						 
                        
		                 b=Integer.parseInt(s);
						 MobilePhone pw=new MobilePhone(a);ro=0;
						 findPhone(pw,root); 
						 if(ro==1){System.out.println("Mobile with this id already exists");}
						 else{
						 //System.out.println(a+" "+b);
						 exchange_found=false;
						 exchangewithid(b,root);
						 if(exchange_found!=true){System.out.println("Wrong id inserted. No such exchange with id exists");}
						 else
						 {if(ps.numChildren()!=0)
						 System.out.println("The Exchange you gave is not base station");
						 else
						{sw(a,root,b);
						if(done1!=true){System.out.println("Exchange not FOUND");}
						else
						  {if(done!=true)
						   { MobilePhone t=new MobilePhone(a); p.m.s.Insert(t);  }
						  }
						  }
						  }
						  }
						break;
		 case "switchOffM":
                         a=Integer.parseInt(actionMessage.substring(16,actionMessage.length()));
						 
						sw2(a,root);
						//System.out.println("out of fn");
						if(done!=true)
						 {System.out.println("Mobile not found");}
						break;
						 
		 case "queryNthCh":
		                 //System.out.println("entered");
						 System.out.print(actionMessage+": ");
		                s="";
						  
						   x=14;//System.out.println(actionMessage);
						  while((int)actionMessage.charAt(x)!=32)
						  {
						    
							s+=actionMessage.charAt(x);
							x++;
						  }
						  x++; a=Integer.parseInt(s);//System.out.println(a);
						  s=actionMessage.substring(x,actionMessage.length());
						  
						 
                        
		                 b=Integer.parseInt(s);//System.out.println(b);
						qu(a,root,b); if(o==5){System.out.println("parent not found");} o=5;
						break;
         case "queryMobil":
		                 System.out.print(actionMessage+": ");
		                 s=actionMessage.substring(20,actionMessage.length());
		                a=Integer.parseInt(s); l=1; exchangewithid(a,root);
						qu2(a,ps); System.out.println(""); t=0;if(l==1){System.out.print(" No mobiles Whatsover ");}l=1;
						break;
         case "queryfindP":
                        System.out.print(actionMessage+": ");
						s=actionMessage.substring(15,actionMessage.length());
		                a=Integer.parseInt(s); MobilePhone i=new MobilePhone(a);ro=0;
						findPhone(i,root); 
						 if(ro==1){System.out.println(ps2.id());}else{System.out.println("Error - No mobile phone with identifier "+a+" found in the network");}
                          ro=0;
						break;
		 case "querylowes":	
                        System.out.print(actionMessage+": ");	
                        s="";
						  
						   x=18;
						  while((int)actionMessage.charAt(x)!=32)
						  {
						    
							s+=actionMessage.charAt(x);
							x++;
						  }
						  x++; a=Integer.parseInt(s);
						  s=actionMessage.substring(x,actionMessage.length());
			              b=Integer.parseInt(s);exchange_found=false;
						  exchangewithid(a,root);
						  if(exchange_found==false){System.out.println("Exchange with given id "+a+" not found");}
						  else
						  {
						  Exchange aa=ps;exchange_found=false;
						  exchangewithid(b,root);
						  if(exchange_found==false){System.out.println("Exchange with given id "+b+" not found");}
						  else
						  {
						  Exchange ab=ps;
						  if(exchange_found!=false)
						  {
						  lowestRouter(aa,ab);
						  Exchange ac=ps3;
						  System.out.println(ac.id());}
						  }
						  }
						  break;
		 case "queryfindC":	
		                   System.out.print(actionMessage+": ");
						   s="";
						  
						   x=18;
						  while((int)actionMessage.charAt(x)!=32)
						  {
						    
							s+=actionMessage.charAt(x);
							x++;
						  }
						  x++; a=Integer.parseInt(s);
						  s=actionMessage.substring(x,actionMessage.length());
			              b=Integer.parseInt(s);
						  MobilePhone m=new MobilePhone(a);
						  findPhone(m,root);
						  Exchange fir=ps2;
						  MobilePhone d=new MobilePhone(b);
						  findPhone(d,root);
						  Exchange sec=ps2;
						  try{
						  MobilePhone m1=fir.MobilePhonewithid(a);
						  MobilePhone m2=sec.MobilePhonewithid(b);
						  ExchangeList y=routeCall(m1,m2);
						  
						  while(y!=null)
						  { 
						    System.out.print(y.root.id()); if(y.next!=null){System.out.print(", ");}
							y=y.next;
						  }
						  System.out.println("");}
						  catch(NullPointerException ew){
						  System.err.println("NullPointerException: " + ew.getMessage());
						  }
						  break;
         case "movePhone ":		
                         //System.out.print("query"+actionMessage+": ");
						   s="";
						  
						   x=10;
						  while((int)actionMessage.charAt(x)!=32)
						  {
						    
							s+=actionMessage.charAt(x);
							x++;
						  }
						  x++; a=Integer.parseInt(s);
						  s=actionMessage.substring(x,actionMessage.length());
			              b=Integer.parseInt(s);
						  exchange_found=false;
						  exchangewithid(b,root);
						  if(exchange_found!=true){System.out.println("wrong id inserted since no such exchange");}
						  else
						 { if(ps.numChildren()!=0){System.out.println("The station you are moving phone to is not base station");}
						  else
						 { MobilePhone as=new MobilePhone(a);
						  exchange_found=false;
						  exchangewithid(b,root);
						   if(exchange_found==false){System.out.println("Exchange with given id "+b+" not found");}
						   else
						  {
						  Exchange h=ps;ro=0;
						  findPhone(as,root);
						  if(ro!=1){System.out.println("Error - No mobile phone with identifier "+a+" found in the network");ro=0;}
                          else
						  {
						  Exchange thi=ps2;
						  MobilePhone tu=thi.MobilePhonewithid(a);
						  movePhone(tu,h);
						  }
						  }
						  }
						  }
						  break;
						  
		default:				
						System.out.println("ERROR MESSAGE "+actionMessage);
						
    }
	
}

public void exchangewithid(int a,Exchange root)
{
  if(root.id()==a){ ps=root; exchange_found=true;return;}
  else
  {
     for(int i=0;i<root.numChildren();i++)
	 {
	     exchangewithid(a,root.child(i));
	 }
  }
 
}
}
					
   
   
   

