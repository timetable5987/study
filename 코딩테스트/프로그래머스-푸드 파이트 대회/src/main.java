/*
https://school.programmers.co.kr/learn/courses/30/lessons/134240#

예를 들어, 3가지의 음식이 준비되어 있으며, 
칼로리가 적은 순서대로 1번 음식을 3개, 2번 음식을 4개, 3번 음식을 6개 준비했으며, 
물을 편의상 0번 음식이라고 칭한다면, 
두 선수는 1번 음식 1개, 2번 음식 2개, 3번 음식 3개씩을 먹게 되므로 
음식의 배치는 "1223330333221"이 됩니다. 따라서 1번 음식 1개는 대회에 사용하지 못합니다.

수웅이가 준비한 음식의 양을 칼로리가 적은 순서대로 나타내는 정수 배열 food가 주어졌을 때, 대회를 위한 음식의 배치를 나타내는 문자열을 return 하는 solution 함수를 완성해주세요.
*/

import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "0";
                
        for(int i = food.length-1; i>=0;i--){
            int n = food[i];
            for(int j = 0; j < n/2; j++){
                answer = i + answer + i;
            }
        }

        return answer;
    }
}