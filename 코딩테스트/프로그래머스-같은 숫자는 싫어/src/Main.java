/*
    https://school.programmers.co.kr/learn/courses/30/lessons/12906
    배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 
    완성해 주세요.
*/


import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        Integer num = null;
        
        for (int i : arr){
            
            if(num == null){
                num = i;
                list.add(i);
            }else if(num != i){
                num = i;
                list.add(i);
            }

        }
        
        if(list.size() > 1000000){
            return null;
        }
        int[] answer = new int[list.size()];
        
        int j = 0;
        
        for(Integer i : list){
            if(i >= 0 && i < 10){              
                answer[j] = i;
                j++;
            }else{
                return null;
            }

        }
        
        return answer;
    }
    
    
}