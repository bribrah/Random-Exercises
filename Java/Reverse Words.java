/**Using the Java language, have the function FirstReverse(str) take the 
  * str parameter being passed and return the string in reversed order. For example: 
  * if the input string is "Hello World and Coders" then your program should return the 
  * string sredoC dna dlroW olleH. 
  */

import java.util.*; 
import java.io.*;

class Main {  
  public static String FirstReverse(String str) { 
  String stringArray[] = str.split("");
  str = "";
  String reverseArray[] = null;
  int length = stringArray.length;
  for (int i = length - 1; i >= 0;  i--)
  {
    str = str + stringArray[i];
  }
    return str;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }   
  
}
