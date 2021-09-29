package java.stringdemo;

public class String3 {
     public static void main(String a[]){
        String x = "DUMP";
        String y = "dump";
        
        if(x.equals(y)){
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }
        
        if(x.equalsIgnoreCase(y)){
            System.out.println("Both strings are equal. Ignored case");
        } else {
            System.out.println("Both strings are not equal. Ignored case");
        }
    }

}
