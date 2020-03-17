/* package whatever; // don't place package name! */
/* L Company Coding Test - 5 */
/* Make original logics following question */

import java.io.*;
import java.util.*;

class myCode
{
  public static void main (String[] args) throws java.lang.Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    
    String input = "";
    HashMap<String, String> tempMap = new HashMap<String, String>();
    // for evict
    HashMap<String, Integer> timeMap = new HashMap<String, Integer>();
    int timeIndex = 0;
      
    // exit command will break
    while (!input.equals("exit")){
      input = br.readLine();
      timeIndex++;
      String[] inputArray = input.split(" ");
      // add 
      if (inputArray[0].equals("add")){
        tempMap.put(inputArray[1], inputArray[2]);
        timeMap.put(inputArray[1], timeIndex);
      } 
      // get
      else if (inputArray[0].equals("get")){
        if(tempMap.get(inputArray[1]) == null){
          System.out.println("-1");
        } else {
          timeMap.put(inputArray[1], timeIndex);
          System.out.println(tempMap.get(inputArray[1]));
        }
      }
      // remove
      else if (inputArray[0].equals("remove")){
        System.out.println(tempMap.get(inputArray[1]));
        tempMap.remove(inputArray[1]);
        timeMap.remove(inputArray[1]);
      }
      // evict
      else if (input.equals("evict")){
        Iterator<String> keyIter = timeMap.keySet().iterator();
        String oldkey = "";
		int oldval = timeIndex;  // it will much better
        while(keyIter.hasNext()){
          String key = keyIter.next();
          int value = timeMap.get(key);
          if(value < oldval){
            oldkey = key;
            oldval = value;
          }
        }
        tempMap.remove(oldkey);
        timeMap.remove(oldkey);
      }
      // exit
      else if (input.equals("exit")){
        break;
      }
    }
  }
}