/*
https://school.programmers.co.kr/learn/courses/30/lessons/12926

어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 
시저 암호라고 합니다. 
예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. 
"z"는 1만큼 밀면 "a"가 됩니다. 
문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
*/

import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++){
            int num= (int) s.charAt(i);
            if(num == 32){
                answer += " ";
            }else if(num >= 97){
                num += n;
                if(num > 122){
                    num -= 26;                 
                }
                answer += String.valueOf((char) num);
            }else{
                num+=n;
                if(num > 90){
                    num -= 26;                 
                }
                answer += String.valueOf((char) num);
            }
        }
        System.out.println(answer);
        return answer;
    }
}