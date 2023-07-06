/*
https://school.programmers.co.kr/learn/courses/30/lessons/12917

문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.

*/

class Solution {
    public String solution(String a) {
        String s = a;
        String answer = sort(s);
        System.out.println(answer);
        return answer;
    }
    
    public String sort(String len){
        String s = len;
        char[] str = new char[s.length()];
        
        for(int i = 0; i < s.length(); i++){
            str[i] = s.charAt(i);    
        }
        
        char temp;
        
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j >=1; j--){
                
                if((int)str[j] > (int)str[j-1]){
                    temp = str[j];
                    str[j] = str[j-1];
                    str[j-1] = temp;
                }
            }   
        }

        String sum = "";
        for(int i = 0; i < s.length(); i++){
            sum = sum + str[i];   
        }
        
        return sum;
        
    }
}