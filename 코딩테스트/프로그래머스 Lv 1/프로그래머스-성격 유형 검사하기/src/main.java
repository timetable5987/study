/*
https://school.programmers.co.kr/learn/courses/30/lessons/118666

나만의 카카오 성격 유형 검사지를 만들려고 합니다.
성격 유형 검사는 다음과 같은 4개 지표로 성격 유형을 구분합니다. 성격은 각 지표에서 두 유형 중 하나로 결정됩니다.
...
*/

import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < survey.length; i++){
            
            String s = survey[i];
            
            if(choices[i] == 4){
                continue;
            }else if(choices[i] > 4){
                map.put(s.charAt(1), choices[i] - 4 + map.getOrDefault(s.charAt(1), 0));
            }else{
                map.put(s.charAt(0), 4-choices[i] + map.getOrDefault(s.charAt(0),0));
            }
        }       
        String[] s = {"RT", "CF", "JM", "AN"};         
        
        for(String s1 : s){
            if(map.getOrDefault(s1.charAt(0), 0) >= map.getOrDefault(s1.charAt(1), 0)){
                answer += s1.charAt(0);
             }else{
                answer += s1.charAt(1);
            }
        }    
            
        System.out.println(answer);
        return answer;
    }
}