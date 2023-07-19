/*

https://school.programmers.co.kr/learn/courses/30/lessons/42842

Leo는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만, 
전체 카펫의 크기는 기억하지 못했습니다.

Leo가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때 
카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.

*/

import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        
        int size = brown + yellow;
        int y;
        int[] answer = new int[2];
        
        for(int i = 1; i < (brown + 4)/2; i++){
            y = (brown + 4)/2 - i;
            System.out.println(y + " , " +i);
            if(i * y == size){              
                answer[0] = y;
                answer[1] = i;
                System.out.println(answer[0] + " , " + answer[1]);
                break;
            }
        }
           
        return answer;
    }
}