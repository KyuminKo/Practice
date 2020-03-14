//*******************************************************************
// * Programmers
// * Level 2, 가장 큰 수
// * https://programmers.co.kr/learn/courses/30/lessons/42746
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
    int[] array = {6, 10, 2};
    
    System.out.print(sol.solution(array));
  }
}

// you can add other public classes to this editor in any order
class Solution {
    public String solution(int[] numbers) {
        // parsing int array to string array
        String[] nums = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
        	nums[i] = String.valueOf(numbers[i]);
        }
        // sorting string array decreasing number
        Arrays.sort(nums, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
      
        // converting sorted string array to string 
        StringBuilder result = new StringBuilder();
        for (String num : nums){
          result.append(num);
        }
        return result.toString();
    }
}