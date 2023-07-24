/*
https://school.programmers.co.kr/learn/courses/30/lessons/136798#

숫자나라 기사단의 각 기사에게는 1번부터 number까지 번호가 지정되어 있습니다. 
기사들은 무기점에서 무기를 구매하려고 합니다.

각 기사는 자신의 기사 번호의 약수 개수에 해당하는 공격력을 가진 무기를 구매하려 합니다. 
단, 이웃나라와의 협약에 의해 공격력의 제한수치를 정하고, 
제한수치보다 큰 공격력을 가진 무기를 구매해야 하는 기사는 협약기관에서 정한 공격력을 가지는 무기를 구매해야 합니다.

기사단원의 수를 나타내는 정수 number와 이웃나라와 협약으로 정해진 공격력의 제한수치를 나타내는 정수 limit와 제한수치를 초과한 기사가 사용할 무기의 공격력을 나타내는 정수 power가 주어졌을 때, 
무기점의 주인이 무기를 모두 만들기 위해 필요한 철의 무게를 return 하는 solution 함수를 완성하시오.
*/

import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= number; i++ ){
            int n = atk(i);
            //System.out.println(i + "의 약수의 수는 " + n);
            if(n > limit){
                answer += power;
            }else{
                answer += n;
            }
        }     
        
        return answer;
    }
    
    public int atk(int num){
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        for (int i = 2; i <= num; i++ ){           
        
            if(num % i == 0){
              //  System.out.println(i);
                if(i*i == num){
                    int n = arr1.size() * 2 + 1;
                
                     return n;
                }else if(i > num/i){
                    int n = arr1.size()*2;
                    return n;
                }else{
                    arr1.add(i);
                }
                
            }
            
        }
        
        return arr1.size();
    }
}