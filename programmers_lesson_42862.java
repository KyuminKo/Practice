//*******************************************************************
// * Programmers
// * Level 1, 체육복
// * https://programmers.co.kr/learn/courses/30/lessons/42862
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
    int n = 5;
    int[] lost = {2,4};
    int[] result = {1,3,5};
    
    System.out.print(sol.solution(n, lost, result));
  }
}

// you can add other public classes to this editor in any order
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int result = 0;
        // sorting
        Arrays.sort(lost);
        Arrays.sort(reserve);
        int tempj = 0;
      
        // 
      	for(int i = 0; i<lost.length; i++){
          for(int j = tempj; j<reserve.length; j++){
            if(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j] || lost[i] == reserve[j]){
              result++;
              tempj=j;
              break;
            }
          }
        }
        return n-lost.length+result;
    }
}