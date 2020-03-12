//*******************************************************************
// * Programmers
// * Level 1, K번째수
// * https://programmers.co.kr/learn/courses/30/lessons/42748
//*******************************************************************

import java.lang.Math; // headers MUST be above the first class
import java.util.*;

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    Solution sol = new Solution();
    int[] array = {1, 5, 2, 6, 3, 7, 4};
    int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
    
    System.out.print(Arrays.toString(sol.solution(array, commands)));
  }
}

// you can add other public classes to this editor in any order
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands[0].length];
      	
        // running all commands
        for (int i=0; i<commands[0].length; i++){
        	result[i] = getNumber(array, commands[i][0], commands[i][1], commands[i][2]);
        }
        return result;
    }
    public int getNumber(int[] array, int i, int j, int k){
      int[] temp = new int[j-i+1];
      for(int m=0; m<temp.length; m++){
         temp[m] = array[i-1];
         i++;
      }
      Arrays.sort(temp);
      return temp[k-1];
    }
}