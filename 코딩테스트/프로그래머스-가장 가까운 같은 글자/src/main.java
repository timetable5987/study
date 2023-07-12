/*
https://school.programmers.co.kr/learn/courses/30/lessons/142086

문자열 s가 주어졌을 때, s의 각 위치마다 자신보다 앞에 나왔으면서, 
자신과 가장 가까운 곳에 있는 같은 글자가 어디 있는지 알고 싶습니다.
*/

import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            String s1 = String.valueOf(s.charAt(i));
            if(map.get(s1) == null){
                map.put(s1, i);
                answer[i] = -1;
            }else{
                answer[i] = i - map.get(s1);
                map.put(s1, i);
            }
            //System.out.println(answer[i]);
            
        }
        
        return answer;
    }
}