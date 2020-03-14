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
        int[] result = new int[commands.length];
        int[] temp = {};
        // running all commands
        for (int i=0; i<commands.length; i++){
          temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
          Arrays.sort(temp);
          result[i] = temp[commands[i][2]-1];
        }
        return result;
    }
}