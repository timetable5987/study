/*
https://school.programmers.co.kr/learn/courses/30/lessons/42889

오렐리를 위해 실패율을 구하는 코드를 완성하라.

실패율은 다음과 같이 정의한다.
스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수

전체 스테이지의 개수 N, 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages가 매개변수로 주어질 때, 
실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return 하도록 solution 함수를 완성하라.
*/

import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        
        int x = stages.length;
        int count=0;
        HashMap<Integer, Float> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            x-=count;
            count = 0;        
            
            for(int j : stages){
                
                if(i+1 == j){
                    count++;    
                }                
            }
            System.out.println(i+1 +" , "+(float)count/x);
            map.put(i+1, (float)count/x);
            
        }
        
        int[] answer = new int[N];
        float[] answer1 = new float[N];
        int n1 = 0;
        for(int i : map.keySet()){
            answer[n1] = i;
            answer1[n1] = map.get(i);
            n1++;
        }
        
        for (int i = 0; i < answer1.length - 1; i++) {
            for (int j = 0; j < answer1.length - i - 1; j++) {
                if (answer1[j] < answer1[j + 1]) {
                    
                    float temp1 = answer1[j];
                    answer1[j] = answer1[j + 1];
                    answer1[j+1] = temp1;
                    
                    
                    int temp = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j+1] = temp;
                    
                }
            }
        }
        
        
        return answer;
    }
}