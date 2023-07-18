/*
https://school.programmers.co.kr/learn/courses/30/lessons/135808
사과 한 상자의 가격은 다음과 같이 결정됩니다.

한 상자에 사과를 m개씩 담아 포장합니다.
상자에 담긴 사과 중 가장 낮은 점수가 p (1 ≤ p ≤ k)점인 경우, 사과 한 상자의 가격은 p * m 입니다.
과일 장수가 가능한 많은 사과를 팔았을 때, 얻을 수 있는 최대 이익을 계산하고자 합니다.
(사과는 상자 단위로만 판매하며, 남는 사과는 버립니다)

사과의 최대 점수 k, 한 상자에 들어가는 사과의 수 m, 사과들의 점수 score가 주어졌을 때, 
과일 장수가 얻을 수 있는 최대 이익을 return하는 solution 함수를 완성해주세요.
*/

import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < score.length; i++){
            list.add(score[i]);
        }
        Collections.sort(list);
        
        int answer = 0;
        int n = score.length;
        while(n >= m){
            
            n -= m;
            answer += list.get(n) * m;
            //System.out.println(list.get(n)+" , 점수"+answer);
            
        }
        return answer;
    }
}