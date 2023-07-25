/*

https://school.programmers.co.kr/learn/courses/30/lessons/120956

머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다. 
조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 
최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다. 
문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 
단어의 개수를 return하도록 solution 함수를 완성해주세요.

*/

import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String s : babbling){
      //      System.out.println("주어진 단어 : " + s);
            String[] s1 = s.split("");
            int i = result(s1);
            answer += i;
        }
        
        return answer;
    }
    
    public int result(String[] s1){
        
        String sum = "";
        int a =0;
        int b =0;
        int c = 0;
        int d = 0;
        for(String s : s1){
            sum+=s;
         //   System.out.println(sum);
            if(sum.equals("aya")){
                a++;
                sum = "";
            } else if(sum.equals("ye")){
                b++;
                sum = "";
            }else if(sum.equals("woo")){
                c++;
                sum = "";
            }else if(sum.equals("ma")){
                d++;
                sum = "";
            }
                
        }
        
        if(sum.length() != 0 || a > 1 || b > 1|| c > 1|| d > 1){
            return 0;
        }else{
            return 1;
        }
    }
}