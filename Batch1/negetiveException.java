package Batch1;

import java.util.Scanner;

//class representing custom negative exception  
class negativeNumberException  extends Exception  
{  
 public negativeNumberException (String str)  
 {  
     // calling the constructor of parent Exception  
     super(str);  
 }  
}  
 
//class that uses custom exception negetiveException  
public class negetiveException 
{  

 // method to check the number 
 static void validate (int num) throws negativeNumberException{    
    if(num < 0){  

     // throw an object of user defined exception  
     throw new negativeNumberException("negativeNumberException Occured");    
    }  
    else {   
     System.out.println("Number is not negative");   
     }   
  }    

 // main method  
 public static void main(String args[])  
 {  
	 Scanner sc = new Scanner(System.in);
     try  
     {  
         // calling the method 
         System.out.print("Enter a number : ");
         int num = sc.nextInt();
         validate(num);
     }  
     catch (negativeNumberException ex)  
     {  
         System.out.println("Caught the exception");  
 
         // printing the message from negetiveException object  
         System.err.println("Exception occured: " + ex);  
     }  

     System.out.println("rest of the code...");    
 }  
}
