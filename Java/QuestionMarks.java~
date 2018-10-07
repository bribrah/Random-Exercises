/**
 * Using the Java language, have the function QuestionsMarks(str) take the str string parameter,
 * which will contain single digit numbers, letters, and question marks, and check if there are 
 * exactly 3 question marks between every pair of two numbers that add up to 10. If so, then your 
 * program should return the string true, otherwise it should return the string false. If there aren't 
 * any two numbers that add up to 10 in the string, then your program should return false as well.
 */
import java.util.*; 
import java.io.*;

class Main {  
  public static String QuestionsMarks(String str) 
  { 
    int numsExtract = Integer.parseInt(str);
    String numTemp = Integer.toString(numsExtract);
    int nums[] = new int[numTemp.length()];
    int sum = 0;
    int numsAdded = 0;
    for (int i = 0; i<numTemp.length(); i++)
    {
      nums[i] = numTemp.charAt(i);
    }
    for (int i = 0; i<nums.length; i++)
    {
      sum = sum + nums[i];
      numsAdded = numsAdded + 1;
      if (sum % 10 == 0){
        str = "true";
        return str;
        
      }
      else if (numsAdded > 2){
        sum = 0;
        numsAdded = 0;
        str = "false";
        return str;
      }
    }
return str;
      
  }
    
    public static void main (String[] args) {  
      // keep this function call here     
      Scanner s = new Scanner(System.in);
      System.out.print(QuestionsMarks(s.nextLine())); 
    }   
    
  }