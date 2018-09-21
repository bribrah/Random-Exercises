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
    String stringArray[] = str.split("");
    String currentstr;
    int sum,nums;
    for (int i = 0;  i < stringArray.length; i++)
    {
      currentstr = stringArray[i];
      if (currentstr == "0" || "1" || "2" || "3"|| "4"||"5"||"6"||"7"||"8"||"9"){
        sum = sum + Integer.parseInt(currentStr);
        nums ++;
          if (sum % 10 == 0){
          str = "true";
        }
        else if (sum > 10){
          sum = 0;
        }
        else if (nums > 1)
        {
          sum = 0;
            nums = 0;
        }
      }
      
      
      return str;
      
    }
  }
    
    public static void main (String[] args) {  
      // keep this function call here     
      Scanner s = new Scanner(System.in);
      System.out.print(QuestionsMarks(s.nextLine())); 
    }   
    
  }