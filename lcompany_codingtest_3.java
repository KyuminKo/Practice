/* package whatever; // don't place package name! */
/* L Company Coding Test - 3 */
/* Find Maximum value of multiple 3 number in array */

import java.io.*;
import java.util.*;

class myCode
{
  public static void main (String[] args) throws java.lang.Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    
    // put number into array
    String[] stringArray = input.split(",");
    
    // return -1 when numbers less than 3
    if(stringArray.length < 3){
      System.out.println(-1);
    }
    
    // main calculating
    else {
      int[] intArray = new int[stringArray.length];
      for (int i=0; i<stringArray.length; i++){
        intArray[i] = Integer.parseInt(stringArray[i]);
      }
      // sorting array to asc
      Arrays.sort(intArray);
      
      // init result
      long result;
      
      // three case of maximum value
      int n = intArray.length-1;
      // n * n-1 * n-2
      long max1 = Long.valueOf(intArray[n] * intArray[n-1] * intArray[n-2]);
      // n * n-1 * 0
      long max2 = Long.valueOf(intArray[n] * intArray[n-1] * intArray[0]);
      // n * 0 * 1
      long max3 = Long.valueOf(intArray[n] * intArray[0] * intArray[1]);
      
      result = Math.max(max1,max2);
      result = Math.max(result, max3);
      
      System.out.println(result);
    }
  }
}