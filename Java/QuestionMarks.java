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
    int currentNum, nums, sum, firstIndex, secondIndex, ?count, falseNum, trueNum;
    String stringSplit[] = str.split("");
    for (int i = 0; i < stringSplit.length; i++)
    {
      currentNum = Integer.parseInt(stringSplit[i]);
      if (currentNum != 0 && nums = 0){
        firstIndex = i
          sum = currentNum;
        nums++}
      else if (currentNum != 0 && nums = 1){
        secondIndex = i
          sum = currentNum + sum;
      }
      if ( sum = 10)
      {
        for (int x = firstIndex; x =< secondIndex; x++){
          if (stringSplit[x] == "?"){
            ?count++
          }
          if (i == secondIndex)
          {
            sum = 0;
            nums = 0;
            if {?count != 3) {
              falseNum++
            }
            }
        }
        
        if {?count != 3) {
          falseNum++
        }
        
        
        
        
        
        
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