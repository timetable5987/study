/*
https://school.programmers.co.kr/learn/courses/30/lessons/120812

최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 
정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 
최빈값이 여러 개면 -1을 return 합니다.
*/

import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        
        for(int i : array){
            if(map.get(i) != null){
                map.put(i, map.get(i)+1);                
            }else{
                map.put(i, 0);                
            }
        }
        
        int large = 0;
        int num = 0;
        
        for(int i : map.keySet()){
                      
            if(map.get(i) > large){
                large = map.get(i);
                num = i;
            }            
            
        }
        int m = 0;
        for(int i : map.keySet()){
            if(map.get(i) == large){
                m++;
            }
        }
        
        answer = num;
        if(m > 1){
            answer = -1;
        }else if(array.length == 1){
            answer = array[0];
        }
        
        return answer;
    }
}