/*
https://school.programmers.co.kr/learn/courses/30/lessons/150370

고객의 약관 동의를 얻어서 수집된 1~n번으로 분류되는 개인정보 n개가 있습니다. 
약관 종류는 여러 가지 있으며 각 약관마다 개인정보 보관 유효기간이 정해져 있습니다. 
당신은 각 개인정보가 어떤 약관으로 수집됐는지 알고 있습니다. 수집된 개인정보는 유효기간 전까지만 보관 가능하며, 
유효기간이 지났다면 반드시 파기해야 합니다.

예를 들어, A라는 약관의 유효기간이 12 달이고, 
2021년 1월 5일에 수집된 개인정보가 A약관으로 수집되었다면 해당 개인정보는 2022년 1월 4일까지 보관 가능하며 
2022년 1월 5일부터 파기해야 할 개인정보입니다.

당신은 오늘 날짜로 파기해야 할 개인정보 번호들을 구하려 합니다.
*/


import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        HashMap<String, Integer> term = new HashMap<>();
        ArrayList<Integer> num = new ArrayList<>();
        
        String[] s_today = today.split("[.]");
        
        //현재 날짜 총 일수 
        int tSum = 
            Integer.parseInt(s_today[0]) * 336 
            + (Integer.parseInt(s_today[1])-1) * 28
            +Integer.parseInt(s_today[2]);
        
        
        System.out.println("today : " + today + " : " + tSum);
        
        //보관 길이
        for(String s : terms){
            
            String[] t = s.split("\\s");

            term.put(t[0], Integer.parseInt(t[1]));
        }
        
        int n = 0;
        // 유효기간 계산
        for(String s : privacies){
            n++;
            String[] day = s.split("\\s");
            
            if(change(tSum, day[0], term.get(day[1]))){
                num.add(n);
            }
            
            
        }
        
        int[] answer = new int[num.size()];
        int m = 0;
        for(int i : num){
            answer[m] = i;
            System.out.println(i);
            m++;
        }
    
        return answer;
    }
    
    private boolean change(int tSum, String day, int type){
        
        String[] list = day.split("[.]");           
        
        int tYear = Integer.parseInt(list[0]);
        int tMon = Integer.parseInt(list[1]);
        int tDay = Integer.parseInt(list[2]);
        
        int sum = tYear * 336 + (tMon -1)*28 + tDay + type*28;
       // System.out.println(day + " 일수 : " + sum);
        if(tSum >= sum){
            return true;
        }else{
            return false;
        }
        
        
    }
    
}