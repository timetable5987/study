/*
https://school.programmers.co.kr/learn/courses/30/lessons/92334#

신입사원 무지는 게시판 불량 이용자를 신고하고 처리 결과를 메일로 발송하는 시스템을 개발하려 합니다. 
무지가 개발하려는 시스템은 다음과 같습니다.

각 유저는 한 번에 한 명의 유저를 신고할 수 있습니다.
신고 횟수에 제한은 없습니다. 서로 다른 유저를 계속해서 신고할 수 있습니다.
한 유저를 여러 번 신고할 수도 있지만, 동일한 유저에 대한 신고 횟수는 1회로 처리됩니다.
k번 이상 신고된 유저는 게시판 이용이 정지되며, 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송합니다.
유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용 정지를 시키면서 정지 메일을 발송합니다.
*/


import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        
        HashMap<String, HashSet<String>> map = new HashMap<>();
        
        for(int i = 0; i < report.length; i++){
             
            String[] s1 = report[i].split(" ");
            
            if(map.get(s1[0]) == null){
                HashSet<String> set = new HashSet<>();   
                set.add(s1[1]);    
                map.put(s1[0], set);
            }else{
                map.get(s1[0]).add(s1[1]);
            }
            
     //       System.out.println(s1[0] + " 횟수: " + map.get(s1[0]).size());           
            
        }
        
        HashSet<String> repot = new HashSet<>();  
        HashMap<String, Integer> count = new HashMap<>();
               
        for(String s : map.keySet()){
            for(String ss : map.get(s)){
                if(count.get(ss) == null){
                    count.put(ss, 1);
                }else{
                    count.put(ss, count.get(ss) + 1);
                }
                
                if(count.get(ss) >= k){
               //     System.out.println(ss + " 신고 수 : " + count.get(ss));
                    repot.add(ss);                    
                }
            }            
        }     
        
        int[] answer = new int[id_list.length];
        
        for(int i = 0; i < id_list.length; i++){
            
            try{
                for(String s : map.get(id_list[i])){
                
                    if(repot.contains(s)){
                        answer[i] = answer[i] + 1;
                    }
                
                 //   System.out.println("최종 체크" + id_list[i] + " " + answer[i]);
                }
            }catch(NullPointerException e){
                continue;
            }
        }
        
       
        return answer;
    }
}