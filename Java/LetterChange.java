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
    char[] string= str.toLowerCase().toCharArray();
    for (int i = 0; i <string.length; i++)
    {
      char d = alphabet.charAt(((alphabet.toLowerCase().indexOf(string[i]))+1) % 26);
      string[i] = d;
    }
    return new String(string);
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterChanges(s.nextLine())); 
  }   
  
}