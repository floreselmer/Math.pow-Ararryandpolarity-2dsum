import java.util.Scanner;
public class Elmer1b
{




public static void main( String[] args )
   {  
      
   bar(3);
   }
   
   
   
   
   
   
   
   
   
   
  public void bar (int n)   {
   
    if(n==1)
    {
    System.out.println("Hello");
    }
  
     else {
     bar(n-1);
     System.out.println(n);
     bar(n-1);
     }
     
    }
 }
