/**
 * Using the Java language, have the function LetterChanges(str) take the str parameter being passed and
 * modify it using the following algorithm. Replace every letter in the string with the letter following it in the
 * alphabet (ie. c becomes d, z becomes a). Then capitalize every vowel in this new string (a, e, i, o, u) 
 * and finally return this modified string. 
 */

import java.util.*; 
import java.io.*;

class LetterChange {  
  public static String LetterChanges(String str) {
    String alphabet = "AbcdEfghIjklmnOpqrstUvwxyz";
    char currentChar,letter;
    int i = 0;
    while (i < str.length())
    {
      currentChar = str.charAt(i);
      for(int x = 0; x < alphabet.length(); x++)
      {
        letter = alphabet.charAt(x);
        if (currentChar == letter){
          str  = str.replace(currentChar,alphabet.charAt(x+1));
          i++;
        }
      }
    }
    
    
    
    return str;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterChanges(s.nextLine())); 
  }   
  
}