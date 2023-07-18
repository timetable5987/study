/*
https://school.programmers.co.kr/learn/courses/30/lessons/12982
부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때, 
최대 몇 개의 부서에 물품을 지원할 수 있는지 return 하도록 solution 함수를 완성해주세요.
*/

import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int sum = 0;
        int answer = 0;
        int[] arr = d;
        Arrays.sort(arr);
        for(int i : arr){
            
            if((budget-sum) < i ){
                break;
            }else{
                System.out.println(i);
                sum += i;
            }
            answer++;
        }
        
        return answer;
    }
    
    
}