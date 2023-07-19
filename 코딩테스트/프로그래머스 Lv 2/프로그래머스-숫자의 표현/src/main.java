/*

https://school.programmers.co.kr/learn/courses/30/lessons/12924

자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수를 return하는 solution를 완성해주세요.

*/

class Solution {
    public int solution(int n) {
        
        int sum = 0;
        
        int answer = 0;
        int next = 1;
        int num = next;
        while(num != n){
            
            sum+=num;
            
            if(sum == n){
          //      System.out.println(sum + " - " + next + " 성공");
                answer++;
                next++;                
                num = next;   
                sum = 0;
                
            }
                                  
            else if(sum > n){
            //    System.out.println(sum + " - " + next + " 실패");
                next++;
                num = next;
                sum = 0;
            }
            num++;
            if( next> n/2 ){
                break;
            }
           // System.out.println(sum + " - " + num);
        }     
        
        return answer+1;
    }
}