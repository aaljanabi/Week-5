
public class writeNums {
	 public static void main(String[] args)
	   {
	      
	       //call method with 5
	       writeSequence(5);
	       System.out.println();
	       //call method with 12
	       writeSequence(12);
	       System.out.println();
	       //call method with -9
	       writeSequence(-9);
	       System.out.println();
	   }
	  
	   public static void writeSequence(int num)
	   {
	       try
	       {
	           //check number is negative or not
	           if (num < 0)
	               throw new IllegalArgumentException();
	           else if(num == 1)
	               System.out.print("1");
	           else
	           {
	               //recursive call to display the number sequence
	               writeSequence(num-1);
	               System.out.print(", "+ num);
	           }
	          
	       }
	       //catch block to handle exception
	       catch(IllegalArgumentException e)
	       {
	           //display error message
	           System.out.println("Number should not be negative.");
	       }      
	   }
	}
