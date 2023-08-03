/*
https://school.programmers.co.kr/learn/courses/30/lessons/120840#

머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다. 
머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때, 
balls개의 구슬 중 share개의 구슬을 고르는 가능한 
모든 경우의 수를 return 하는 solution 함수를 완성해주세요.
*/

import java.util.*;

class Solution {
    public double solution(int balls, int share) {
        int answer = 0;
        
        if(balls == share){
            return 1;
        }
        
        double x = 1;
        
        
        for(int i = 1; i <= balls; i++){
         //   System.out.println("x : " + i);
            x *= i;
        }
        double z = 1;
        for(int i = 1; i <= balls-share; i++){
         //   System.out.println("x : " + i);
            z *= i;
        }
        
        double y = 1;
        for(int i = 1; i <= share; i++){
          //  System.out.println("y : " + i);
            y *= i;
        }
              
        //System.out.println(s/z);
        
        return Math.round(x/(y*z));
    }
}