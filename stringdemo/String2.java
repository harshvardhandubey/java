package java.stringdemo;

public class String2 
{
     public static void main(String a[])
     {
        char ch[] = {'M','y',' ','J','a','v','a',' ','e','x','a','m','p','l','e'};
       
        String charStr = String.copyValueOf(ch);
        System.out.println(charStr);
       
        String subStr = String.copyValueOf(ch,3,4);
        System.out.println(subStr);
    }

}
