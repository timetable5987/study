/*
https://school.programmers.co.kr/learn/courses/30/lessons/138477

명예의 전당 목록의 점수의 개수 k, 1일부터 마지막 날까지 출연한 가수들의 점수인 score가 주어졌을 때, 
매일 발표된 명예의 전당의 최하위 점수를 return하는 solution 함수를 완성해주세요.
*/

import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < score.length; i++){
            list.add(score[i]);
            Collections.sort(list);
            
            if(list.size() > k){
            //System.out.println(list.get(0) + "<- 지울값, ");    
                list.remove(0);   
            }
            answer[i] = list.get(0);
            //System.out.println(answer[i]);
            
        }
        
        return answer;
    }
}