/**
 * Using the Java language, have the function LetterCapitalize(str) take the str parameter being passed and
 * capitalize the first letter of each word. Words will be separated by only one space. 
 */

import java.util.*; 
import java.io.*;

class Capitalize {  
  public static String LetterCapitalize(String str) {
      String stringArray[] = str.split(" ", 0);
      String subString, capSub;
      String finalString = "";
      
      for (int i = 0; i < stringArray.length; i++)
      {
          subString = stringArray[i];
          capSub = subString.substring(0,1).toUpperCase() + subString.substring(1);
          finalString = finalString + capSub + " ";
      }
      
      
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
    return finalString;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterCapitalize(s.nextLine())); 
  }   
  
} 