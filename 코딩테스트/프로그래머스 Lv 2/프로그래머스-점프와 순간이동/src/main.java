/*
https://school.programmers.co.kr/learn/courses/30/lessons/12980

... 
아이언 슈트 구매자가 이동하려는 거리 N이 주어졌을 때, 
사용해야 하는 건전지 사용량의 최솟값을 return하는 solution 함수를 만들어 주세요.
*/

import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        int i = 0;
        while(true){
            if(n % 2 == 0){
                n = n/2;
            }else{
                i++;
                n = n - 1;
            }
            
            if(n == 0){
                break;
            }
        }
        
        return i;
    }
}