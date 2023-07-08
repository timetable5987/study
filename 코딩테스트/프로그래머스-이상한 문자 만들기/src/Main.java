/*
    https://school.programmers.co.kr/learn/courses/30/lessons/12930#
    
    문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 
    각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
    각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, 
    solution을 완성하세요.
*/

import java.util.*;

class Solution {
    public String solution(String s) {
        
        int len = s.length();
        int large[] = new int[len]; 
        //문자열 소문자로 변환
        String small = s.toLowerCase();
        
        //문자열을 아스키코드로 변환
        for (int i = 0; i < len; i++){
            large[i] = (int)small.charAt(i);        
        }
        
        int isEven = 0;
        String answer = "";

        for (int i : large){
            
            //만약 공백이라면 is를 -1으로 변경
            if(i == 32){
                isEven = -1;
            }
            //만약 짝수번째 알파벳이라면 대문자로 변환
            else if(isEven % 2 == 0){
                i -= 32;
            }
            //잘 변환됬는지 확인
            System.out.println(String.valueOf((char) i));
            //변환한 문자를 문자열에 저장
            String c = String.valueOf((char) i);
            answer = answer + c;           
            
            isEven++;             
        }       
        
        return answer;
    }
}