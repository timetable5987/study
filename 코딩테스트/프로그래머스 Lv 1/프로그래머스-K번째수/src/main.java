/*
https://school.programmers.co.kr/learn/courses/30/lessons/42748

배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, 
commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 
배열에 담아 return 하도록 solution 함수를 작성해주세요.
*/

import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> list = new ArrayList<>();        
        
        for(int i = 0; i < commands.length; i++){
            int n1 = commands[i][0] - 1;
            int n2 = commands[i][1] - 1;
            int n3 = commands[i][2] - 1;
            
            for(int j = n1; j <= n2; j++){
                //System.out.println("list : " + array[j]);
                list.add(array[j]);
            }
            Collections.sort(list);
            answer[i] = list.get(n3);
            //System.out.println(answer[i]);
            list.clear();
            
        }
        
        
        return answer;
    }
}