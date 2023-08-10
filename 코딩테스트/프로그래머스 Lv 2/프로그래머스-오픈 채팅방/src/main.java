/*
https://school.programmers.co.kr/learn/courses/30/lessons/42888

채팅방에 들어오고 나가거나, 
닉네임을 변경한 기록이 담긴 문자열 배열 record가 매개변수로 주어질 때, 모든 기록이 처리된 후, 
최종적으로 방을 개설한 사람이 보게 되는 메시지를 문자열 배열 형태로 return 하도록 solution 함수를 완성하라.
*/

import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<>();
        for(String s : record){
            String[] s1 = s.split(" ");
            
            if(!s1[0].equals("Leave")){
                map.put(s1[1], s1[2]);
            }    
        }
        
        ArrayList<String> list = new ArrayList<>();
        
        for(String s : record){
            String[] s1 = s.split(" ");
            
            String log = "";
            
            if(s1[0].equals("Enter")){
                log = map.get(s1[1]) + "님이 들어왔습니다.";
                list.add(log);
            }
            
            if(s1[0].equals("Leave")){
                log = map.get(s1[1]) + "님이 나갔습니다.";
                list.add(log);
            }
            
            //
            
        }       
        
        String[] answer = new String[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
            //System.out.println(answer[i]);
        }
        
        
        return answer;
    }
}