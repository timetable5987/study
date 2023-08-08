/*
    https://school.programmers.co.kr/learn/courses/30/lessons/76502#
    
    다음 규칙을 지키는 문자열을 올바른 괄호 문자열이라고 정의합니다.

(), [], {} 는 모두 올바른 괄호 문자열입니다.
만약 A가 올바른 괄호 문자열이라면, (A), [A], {A} 도 올바른 괄호 문자열입니다. 예를 들어, [] 가 올바른 괄호 문자열이므로, ([]) 도 올바른 괄호 문자열입니다.
만약 A, B가 올바른 괄호 문자열이라면, AB 도 올바른 괄호 문자열입니다. 예를 들어, {} 와 ([]) 가 올바른 괄호 문자열이므로, {}([]) 도 올바른 괄호 문자열입니다.

대괄호, 중괄호, 그리고 소괄호로 이루어진 문자열 s가 매개변수로 주어집니다. 
이 s를 왼쪽으로 x (0 ≤ x < (s의 길이)) 칸만큼 회전시켰을 때 
s가 올바른 괄호 문자열이 되게 하는 x의 개수를 return 하도록 solution 함수를 완성해주세요.


*/

import java.util.*;

class Solution {
    public int solution(String s) {
        
        int answer = 0;
                
        
        for(int i = 0; i < s.length(); i++){
            String f = String.valueOf(s.charAt(0));
            String b = s.substring(1);
            s = b +f;
            
            answer+=check(s);
            //System.out.println("결론 : "+s + " , " + check(s));
        }
        
        return answer;
    }
    
    public int check(String s){
        Stack<String> stack = new Stack<>();
        int n = 0;
        String[] s1 = s.split("");
        for(String immi : s1){
            if(
                immi.equals("{") ||
                immi.equals("(") ||
                immi.equals("["))
            {
                stack.push(immi);
                n++;
            }
            
            if(immi.equals("}") && stack.contains("{") ){
                stack.pop();
            }
            if(immi.equals("]") && stack.contains("[") ){
                stack.pop();
            }
            if(immi.equals(")") && stack.contains("(") ){
                stack.pop();
            }

        }
        
        if(n != 0 && stack.size() == 0){
            return 1;
        }else{
            return 0;
        }
    }
}