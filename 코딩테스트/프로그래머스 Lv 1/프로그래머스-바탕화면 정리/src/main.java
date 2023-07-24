/*
https://school.programmers.co.kr/learn/courses/30/lessons/161990

머쓱이의 컴퓨터 바탕화면의 상태를 나타내는 문자열 배열 wallpaper가 매개변수로 주어질 때 
바탕화면의 파일들을 한 번에 삭제하기 위해 최소한의 이동거리를 갖는 드래그의 시작점과 끝점을 담은 정수 배열을 
return하는 solution 함수를 작성해 주세요. 
드래그의 시작점이 (lux, luy), 끝점이 (rdx, rdy)라면 정수 배열 [lux, luy, rdx, rdy]를 return하면 됩니다.
*/


import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {-1,-1,-1,-1};      
        
        
        for(int i = 0; i < wallpaper.length; i++){
            for(int j = 0; j < wallpaper[i].length(); j++){
                if(wallpaper[i].charAt(j) == '#'){
                    
                    
                    if(answer[0] >= i || answer[0] == -1){
                        answer[0] = i;
                    }
                    if(answer[1] >= j|| answer[1] == -1){
                        answer[1] = j;
                    }
                    
                    if(answer[2] <= i+1 || answer[2] == -1){
                        answer[2] = i+1;
                    }
                    if(answer[3] <= j+1|| answer[3] == -1){
                        answer[3] = j+1;
                    }                    
                   // System.out.println(answer[0] +" , " +answer[1] +" , " +
                     //                  answer[2] +" , " +answer[3] +" , ");
                }
            }
        }
        
        return answer;
    }
}