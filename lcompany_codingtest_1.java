/* package whatever; // don't place package name! */
/* L Company Coding Test - 1 */
/* Count duplicated characters from String */

import java.io.*;
import java.util.*;

class myCode
{
  public static void main (String[] args) throws java.lang.Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    
    // init result
    int result = 0;
    
    // make an array
    char[] tempArray = input.toCharArray();
    HashMap<Character, Integer> tempMap = new HashMap<Character, Integer>();
    
    // counting
    for (int i = 0; i < tempArray.length; i++){
      if(!tempMap.containsKey(tempArray[i])){
        tempMap.put(tempArray[i], 0);
      }
      else{
        tempMap.put(tempArray[i], tempMap.get(tempArray[i])+1);
      }
    }
    
    // calculate result
    for (Character j : tempMap.keySet()){
      if(tempMap.get(j) != 0){
        result++;
      }
    }
    
    System.out.println(result);
  }
}
