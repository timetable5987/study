/*

https://school.programmers.co.kr/learn/courses/30/lessons/12981

1부터 n까지 번호가 붙어있는 n명의 사람이 영어 끝말잇기를 하고 있습니다. 
...

끝말잇기를 계속 진행해 나가다 보면, 3번 사람이 자신의 세 번째 차례에 말한 tank 라는 단어는 
이전에 등장했던 단어이므로 탈락하게 됩니다.

사람의 수 n과 사람들이 순서대로 말한 단어 words 가 매개변수로 주어질 때, 가
장 먼저 탈락하는 사람의 번호와 그 사람이 자신의 몇 번째 차례에 탈락하는지를 구해서 return 하도록 
solution 함수를 완성해주세요.

*/

import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put(words[0], 0);
        int[] arr = new int[n];
        int num =0;
        
        
        for(int i = 1; i < words.length; i++){      
            
            num = i /n;          
            
            System.out.println(words[i-1].charAt(words[i-1].length()-1)+" , " 
                               +words[i].charAt(0));
            
            if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)
              || map.get(words[i]) != null){
                
                answer[0] = (i%n) + 1;
                answer[1] = num+1;                
                break;
                
            }else{
                map.put(words[i], 0);
            }
            
        }
    
        return answer;
    }
}