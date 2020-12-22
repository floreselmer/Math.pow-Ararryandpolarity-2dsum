public class Elmer1c
{
   public static void main( String[] args )
   {
      int[][] table = {{7, 10, 3, 0},
                       {6, 2, -6, 4},
                       {23, 7, 1, -6},
                       {10, 9, 8, 5}};
                       
     int result = getXSum(table);
     
     System.out.print(result);
   }
   
   public static int getXSum(int[][] array)
   {
     int sum = 0;
     int left = 0;
     int right = 0;
     
     for(int row = 0; row < array.length; row++)
     {
         
        for(int col = 0; col < array[row].length; col++)
        {
        
         if(row==col)
         {
        left=left+array[row][col];
         }
         
         if(row+col==array.length-1)
         {
         right=right+array[row][col];
         }
        
        
        
        
                
        }
        
    }
  
       sum=left+right;
        return sum;      
  }
     
 }