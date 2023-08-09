/*
https://school.programmers.co.kr/learn/courses/30/lessons/70129

0과 1로 이루어진 문자열 s가 매개변수로 주어집니다. 
s가 "1"이 될 때까지 계속해서 s에 이진 변환을 가했을 때, 
이진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수를 각각 배열에 담아 return 하도록 
solution 함수를 완성해주세요.
*/

import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        int[] answer = new int[2];
        int n = 0;
        int m = 0;
        while(true){
            
            if(s.equals("1")){
                break;
            }
            
            while(s.contains("0")){                
                s=s.replaceFirst("0", "");   
                m++;                
            }
        
            int sum = s.length();
            s = Integer.toBinaryString(sum);
            n++;
        }
        
        answer[0] = n;
        answer[1] = m;
        
        return answer;
    }

}