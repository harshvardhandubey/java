package java.exception;

public class Multi{
    

 public static void main(String args[]){  
  try{  
    	try{  
     		System.out.println("Divide by zero");  
     		int b =51/0;  
    	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}  
   
    	try{  
    		int a[]=new int[5];  
    		a[5]=4;  
    	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}  
     
    System.out.println("Other Statement");  
  }catch(Exception e){System.out.println("Exception is handled");}  
  
  System.out.println("Code's usual flow continued");  
 }  
}