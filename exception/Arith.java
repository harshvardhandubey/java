package java.exception;

public class Arith
{
   
  public static void main(String args[])
  {
   try{
      int data=50/0;
  
   }catch(ArithmeticException e){
	System.out.println(e);
}
	
   System.out.println("This is printed as exception is handled");
}
  
}

