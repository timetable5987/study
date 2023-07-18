import java.util.HashMap;
import java.util.Map;

/*

https://school.programmers.co.kr/learn/courses/30/lessons/176963

그리워하는 사람의 이름을 담은 문자열 배열 name, 각 사람별 그리움 점수를 담은 정수 배열 yearning, 각 사진에 찍힌 인물의 이름을 담은 이차원 문자열 배열 photo가 매개변수로 주어질 때, 사진들의 추억 점수를 photo에 주어진 순서대로 배열에 담아 return하는 solution 함수를 완성해주세요.

*/

class Solution {
    
    
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> map = new HashMap<>();    
        for (int i = 0; i < name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        Integer sum;
        for(int i = 0; i < photo.length; i++){
            Integer value = 0;
            sum = 0;
            for(int j = 0; j < photo[i].length; j++){
                value = map.get(photo[i][j]);
                
                if(value != null){
                    sum+=value;
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}