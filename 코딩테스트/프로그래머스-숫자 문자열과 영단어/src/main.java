/*
https://school.programmers.co.kr/learn/courses/30/lessons/81301

1478 → "one4seveneight"
234567 → "23four5six7"
10203 → "1zerotwozero3"
이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 
혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. 
s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
*/

import java.util.*;

class Solution {
    public long solution(String s) {
        HashMap<String, Long> map = new HashMap<>();
        map.put("zero",0L);
        map.put("one",1L);
        map.put("two",2L);
        map.put("three",3L);
        map.put("four",4L);
        map.put("five",5L);
        map.put("six",6L);
        map.put("seven",7L);
        map.put("eight",8L);
        map.put("nine",9L);
        
        String s1 = "";
        String temp = "";
        for(int i = 0; i < s.length(); i++){
            
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                s1 +=  Character.getNumericValue(c);
            }else{
                temp += String.valueOf(c);
           //     System.out.println("temp : " + temp);
                if(map.containsKey(temp)){
                    s1 += map.get(temp);
                    temp = "";
                }
            }
           // System.out.println(s1);
        }
        long answer = Long.parseLong(s1);
        return answer;
    }
}