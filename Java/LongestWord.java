/**
 * Using the Java language, have the function LongestWord(sen) take the sen parameter 
 * being passed and return the largest word in the string. If there are two or more words that are
 * the same length, return the first word from the string with that length. Ignore punctuation and assume sen will not be empty.\
 */

import java.util.*; 
import java.io.*;

class LongestWord {  
  public static String LongestWord(String sen) { 
String array[] = sen.split(" ");
String currentString,longestWord = null;
int length,longest = 0;
for (int i = 0; i < array.length; i++)
{
  currentString = array[i];
  length = currentString.length();
  if (length > longest){
    longest = length;
    longestWord = currentString;
  }
}
  
  

       
    return longestWord;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }   
  
}

