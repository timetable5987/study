/*
https://school.programmers.co.kr/learn/courses/30/lessons/12901#

2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT

입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.
*/

import java.util.*;

class Solution {
    public String solution(int a, int b) {
        HashMap<Integer, String> map = new HashMap<>();
        ArrayList<Integer> list = 
            new ArrayList<>(Arrays.asList(0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30));
        map.put(1,"FRI");
        map.put(2,"SAT");
        map.put(3,"SUN");
        map.put(4,"MON");
        map.put(5,"TUE");
        map.put(6,"WED");
        map.put(0,"THU");
        int sum = 0;
        for(int i = 0; i < a; i++){
            sum += list.get(i);
        }
        sum += b;
        String answer =map.get(sum%7);
        
        return answer;
    }
}