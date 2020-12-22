import java.util.Scanner;
public class Elmer1a
{




public static void main( String[] args )
   {  
     Scanner input = new Scanner(System.in);
      
  System.out.print("Enter c: ");
  int c=input.nextInt();
      
    boolean answer= isSquareSum (c); 
   
      
      
   }
   
   public static boolean isSquareSum ( int c )
   {
     
     boolean answer=false;
     int count =1;
     int counter=1;
     double sum=0;
     
     while(count< c)
     {
     
      double num= Math.pow(count,2);
      double num2=Math.pow(counter,2);
       sum= num+num2;
      
      if(sum==c)
      {
      answer=true;
      System.out.println("Return Value is:"+answer); 
      System.out.print("Can find two numbers "+ count + " and "+ counter + " such that "+ count+ "^2 + " + counter + "^2 ="+ c);
      }
       
     counter++;
     count++;
     sum=0;
     
     }
     
     
    
    
    
    
    
     count=1;
     counter=2;
     sum=0;
     
     
     while(counter< c)
     {
     
      double num= Math.pow(count,2);
      double num2=Math.pow(counter,2);
       sum= num+num2;

      
      if(sum==c)
      {
      answer=true;
      System.out.println("Return Value is:"+answer); 
      System.out.print("Can find two numbers "+ count + " and "+ counter + " such that "+ count+ "^2 + " + counter + "^2 ="+ c);
      }
       
     counter++;
     count++;
     sum=0;
     
     }
     
     if(answer==false)
     {
     System.out.println("Return Value is:"+answer); 
      System.out.print("Cannot find two numbers that when squared and added together gives " + c);

     
     }
     
     
     
     
     return answer;
     
     
     
     
     
     
     }
 }
