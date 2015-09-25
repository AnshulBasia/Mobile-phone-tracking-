public class MobilePhone
{

  int no;
  boolean isswitchedon;
  Exchange loc;
  public int id(){return no;}
  MobilePhone(int a)
  {
    no=a;
	isswitchedon=true;   //when no. created-starting with switched on mode
  }
  public int number()
  {
    return no;
  }
  public boolean status()
  {
    if(isswitchedon==true){return true;}
	else{return false;}
  }
  public void switchOn()
  {
    isswitchedon=true;
  }
  public void switchOff()
  {
    isswitchedon=false;
  }
  public Exchange location()
  {
      if(isswitchedon==true){return loc;}
	  else{System.out.println("Phone Switched off"); return loc;}
  }
  
  
  
}
