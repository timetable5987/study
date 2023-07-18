/*
https://school.programmers.co.kr/learn/courses/30/lessons/68644#

정수 배열 numbers가 주어집니다. 
numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 
모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
*/

import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                
                int num = numbers[i] + numbers[j];
                list.add(num);
            }
        }
        
        Set<Integer> numSet = new HashSet<>(list);
        ArrayList<Integer> nList = new ArrayList<>(numSet);
        Collections.sort(nList);        
        
        int[] answer = new int[nList.size()];
        int n = 0;
        for(int i : nList){
           // System.out.println(i);
            answer[n] = i;            
            n++;
        }        
        return answer;
    }
}