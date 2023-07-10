/*
https://school.programmers.co.kr/learn/courses/30/lessons/147355#

숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서, 
이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 
return하는 함수 solution을 완성하세요.
*/

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long p1 =  Long.parseLong(p);       
        
        
        for(int i = 0; i < t.length()-p.length()+1; i++){
            
            String t1;
            if(p.length() != 1){
                t1= t.substring(i,i+p.length());    
            }else{
                t1 = String.valueOf(t.charAt(i));
            }
            //System.out.println(t1);
            
            if(Long.parseLong(t1)<=p1){
                answer++;
            }           
                        
        }
        
        return answer;
    }
}