//*******************************************************************
// * Programmers
// * Level 1, 완주하지 못한 선수
// * https://programmers.co.kr/learn/courses/30/lessons/42576
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
    String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
    String[] completion = {"marina", "josipa", "vinko", "filipa"};
    
    System.out.print(sol.solution(participant, completion));
  }
}

// you can add other public classes to this editor in any order
class Solution {
    public String solution(String[] participant, String[] completion) {
        String result = "";
      	Arrays.sort(participant);
      	Arrays.sort(completion);
      
      for (int i = 0; i < participant.length-1; i++){
        if(!participant[i].equals(completion[i])){
        	return participant[i];
        }
      }
      return participant[participant.length-1];
    }
}