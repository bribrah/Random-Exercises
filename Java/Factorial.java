/**Using the Java language, have the function FirstFactorial(num) take the num parameter being passed and return
  * the factorial of it (e.g. if num = 4, return (4 * 3 * 2 * 1)). For the test cases, the range will be between 1 and 18
  * and the input will always be an integer. 
  */

import java.util.*; 
import java.io.*;

class factorial {  
  public static int FirstFactorial(int num) { 
    int factorial = num;
    int newNum = num -1;
    while (newNum > 0)
    {
      factorial  = factorial  * newNum;
      newNum = newNum - 1;
    }
    num = factorial;
    
    
    return num;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstFactorial(s.nextInt()));  
  }   
  
}

