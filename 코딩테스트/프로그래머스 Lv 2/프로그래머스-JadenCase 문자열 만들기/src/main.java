/*

https://school.programmers.co.kr/learn/courses/30/lessons/12951#

JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 
단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.

*/

import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = s.toLowerCase();
       // System.out.println(answer);
        
        String[] arr = answer.split(" ");
        answer = "";
        for(String s1 : arr){            
            
            if(s1.length() == 0){
                answer += " ";
            }else if(String.valueOf(s1.charAt(0)) != " "){
                String c = String.valueOf(Character.toUpperCase(s1.charAt(0)));
                
                s1 = s1.substring(1, s1.length());
                
                answer = answer + c+ s1 + " ";
            //    System.out.println(s1 + ", " + answer);
            }else{
                answer += s1 + " ";
            //    System.out.println(s1 + ", " + answer);
            }
        }
        
        answer = answer.trim();
        
        if((int)s.charAt(s.length()-1) == 32){
            answer = answer + " ";
        }
        if((int)s.charAt(0) == 32){
            answer = " " + answer;
        }       
        
        return answer;
    }
    

}