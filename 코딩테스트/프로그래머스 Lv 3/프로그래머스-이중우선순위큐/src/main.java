/*
https://school.programmers.co.kr/learn/courses/30/lessons/42628

이중 우선순위 큐가 할 연산 operations가 매개변수로 주어질 때, 
모든 연산을 처리한 후 큐가 비어있으면 [0,0] 비어있지 않으면 [최댓값, 최솟값]을 return 하도록 
solution 함수를 구현해주세요.
*/

import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(String s : operations){
            String[] s1 = s.split(" ");
            if(s1[0].equals("I")){
          //      System.out.println("값 삽입 : " + s1[1]);
                list.add(Integer.parseInt(s1[1]));
            }else{
                int i;
                if(list.size() == 0){
                    continue;
                }
                if(s1[1].equals("1")){
                    i = list.indexOf(Collections.max(list));
                }else{
                    i = list.indexOf(Collections.min(list));
                }
 //               System.out.println("값 삭제 : " + list.get(i));
                list.remove(i);                
            } 
        }
        
        int[] answer = new int[2];
        if(list.size() != 0){
            answer[0] = Collections.max(list);
            answer[1] = Collections.min(list);
        }       
        
        return answer;
    }
}