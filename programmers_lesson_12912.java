//*******************************************************************
// * Programmers
// * Level 1, 두 정수 사이의 합
// * https://programmers.co.kr/learn/courses/30/lessons/12912
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
    int a = 5;
    int b = 3;
    
    System.out.print(sol.solution(a, b));
  }
}

// you can add other public classes to this editor in any order
class Solution {
  public long solution(int a, int b) {
      long result = 0;
      int max = Math.max(a,b);
      int min = Math.min(a,b);
      if(max == min){
      	return (long)a;
      }
      for(int i = min; i <= max; i++){
      	result = result+(long)i;
      }
      return result;
  }
}