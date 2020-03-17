/* package whatever; // don't place package name! */
/* L Company Coding Test - 4 */
/* insert , into number in 3-index, without minus or decimal(?) */

import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

class myCode
{
  public static void main (String[] args) throws java.lang.Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    
    // check input is double, integer or no one
    String[] inputArray = input.split("[.]");
        
    // init result
    String result = "";
  
    // double case
    if(inputArray.length == 2){
      double doubnum = Double.parseDouble(input);
      int part1 = (int)doubnum;
      
      // make format
      DecimalFormat df = new DecimalFormat("###,###");
      result = df.format(part1);
      result = result + "." + inputArray[1];
    }
    
    // integer case
    else if(inputArray.length == 1){
      int intnum = Integer.parseInt(input);
      
      // make format
      DecimalFormat df = new DecimalFormat("###,###");
      result = df.format(intnum);
    }
    
    // not invalidate case
    else{
      throw new Exception();
    }
    
    System.out.println(result);
  }
}
