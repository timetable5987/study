/*
https://school.programmers.co.kr/learn/courses/30/lessons/92341

주차장의 요금표와 차량이 들어오고(입차) 나간(출차) 기록이 주어졌을 때, 
차량별로 주차 요금을 계산하려고 합니다. 아래는 하나의 예시를 나타냅니다.

...

주차 요금을 나타내는 정수 배열 fees, 자동차의 입/출차 내역을 나타내는 
문자열 배열 records가 매개변수로 주어집니다. 
차량 번호가 작은 자동차부터 청구할 주차 요금을 차례대로 정수 배열에 담아서 return 하도록 
solution 함수를 완성해주세요.
*/


import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
    
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, Integer> charge = new HashMap<>();       
        
        // 주차 기록을 보고 누적 주차시간을 계산
        
        for(String s : records){
            String[] s1 = s.split(" ");            
            
            //입차기록이 있을 경우, map에 추가
            if(s1[2].equals("IN")){                
                map.put(s1[1], s1[0]);
                
            //출차 기록이 있을 경우, 주차 시간을 계산 후 해당 차량 번호를 map에서 제거    
            }else if(s1[2].equals("OUT")){
                
                int num = check(map.get(s1[1]), s1[0]);
                map.remove(s1[1]);               
                //누적주차시간을 charge에 저장
                charge.put(s1[1], charge.getOrDefault(s1[1], 0) + num);
            }
                        
        }     
        
        //입차 시간은 있으나, 출차 시간은 없는 경우를 계산
        for(String k : map.keySet()){
            int num = check(map.get(k), "23:59");        
            charge.put(k, charge.getOrDefault(k, 0) + num);
        }
        
        //차량번호를 작은 순으로 정렬
        List<String> keySet = new ArrayList<>(charge.keySet());
        Collections.sort(keySet);
               
        int[] answer = new int[charge.size()];
        int i = 0;
        //주차요금 계산후 배열에 삽입
        for(String s : keySet){
            answer[i] = count(charge.get(s), fees);
            i++;
        }       
        
        return answer;
    }
    
    //누적 주차시간 계산 메소드
    public int check(String s1, String s2){

        //String -> Int 자료형으로 변환
        int in = Integer.valueOf(s1.replace(":", ""));
        int out = Integer.valueOf(s2.replace(":", ""));
                
        //x는 시간, y는 분
        int x = out/100 - in/100;
        int y = out%100 - in % 100;
        
        //분 계산 로직
        if(y < 0){
            x = x-1;
            y = 60- in % 100 + out%100;
        }
        
        int time = x * 60 + y;               
        return time;
        
    }
    
    //주차 요금을 계산하는 메소드
    public int count(int num , int[] fee){
         
        if(num <= fee[0]){
            return fee[1];
        }else{
            int i= ((num-fee[0]) / fee[2])*fee[3];
            if((num-fee[0]) % fee[2] != 0){
                i += fee[3];
            }
            return i + fee[1];
        }        
    }
}