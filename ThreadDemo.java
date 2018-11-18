package thread;

public class ThreadDemo implements Runnable{  
public void run(){  
System.out.println("Thread started");  
}  
  
public static void main(String args[]){  
ThreadDemo obj=new ThreadDemo();  
Thread t1 =new Thread(obj);  
t1.start();  
 }  
}  