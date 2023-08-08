/*
https://school.programmers.co.kr/learn/courses/30/lessons/160586

휴대폰의 자판은 컴퓨터 키보드 자판과는 다르게 하나의 키에 여러 개의 문자가 할당될 수 있습니다. 
키 하나에 여러 문자가 할당된 경우, 동일한 키를 연속해서 빠르게 누르면 할당된 순서대로 문자가 바뀝니다.

예를 들어, 1번 키에 "A", "B", "C" 순서대로 문자가 할당되어 있다면 1번 키를 한 번 누르면 "A", 
두 번 누르면 "B", 세 번 누르면 "C"가 되는 식입니다.

이 휴대폰 자판을 이용해 특정 문자열을 작성할 때, 키를 최소 몇 번 눌러야 
그 문자열을 작성할 수 있는지 알아보고자 합니다.
*/

import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        
        int[] answer = new int[targets.length];
        
        for(int i = 0; i < targets.length; i++){
            answer[i] = check(keymap, targets[i]);
        }
        
        
        return answer;
    }
    
    public int check(String[] key , String s){
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        String[] s1 = s.split("");
        
        for(String immi : s1){
            
            for(String k : key){
                if(k.contains(immi)){
                    list.add(k.indexOf(immi));    
          //          System.out.println(k.indexOf(immi));
                }
            }
            if(list.size() == 0){
                return -1;
            }else{
                Collections.sort(list);
                sum += list.get(0) + 1;
         //       System.out.println(immi+ " , " + sum +" , " + (list.get(0) + 1));
                list.clear();
            }
        }        

        return sum;
    }
    
}