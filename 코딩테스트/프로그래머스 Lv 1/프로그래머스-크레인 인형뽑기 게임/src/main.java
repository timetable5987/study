/*

https://school.programmers.co.kr/learn/courses/30/lessons/64061

만약 같은 모양의 인형 두 개가 바구니에 연속해서 쌓이게 되면 두 인형은 터뜨려지면서 
바구니에서 사라지게 됩니다. 
위 상태에서 이어서 [5번] 위치에서 인형을 집어 바구니에 쌓으면 같은 모양 인형 두 개가 없어집니다.

게임 화면의 격자의 상태가 담긴 2차원 배열 board와 인형을 집기 위해 
크레인을 작동시킨 위치가 담긴 배열 moves가 매개변수로 주어질 때, 
크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수를 return 하도록 solution 함수를 완성해주세요.

*/

import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int a = 0;
        
        for(int i : moves){
            int cat = 0;
            for(int j = 0; j < board[i-1].length; j++){
                if(board[j][i-1] != 0){
                    cat = board[j][i-1];
                    board[j][i-1] = 0;
                    
                    list.add(cat);
                    
                    System.out.print("현재숫자 : "+list.get(list.size()-1) 
                                 + " 리스트 크기 " + list.size());
                    
                    if(list.size() == 1){                        
                        break;
                    }
                    
                    if(list.get(list.size()-2) == list.get(list.size()-1)){
                        a++;
                        list.remove(list.size()-1);
                        list.remove(list.size()-1);
                        System.out.println(cat + " 펑! ");
                    }
                    
                    break;
                }
            }
        }
        System.out.println(a);
        int answer = a*2;
        return answer;
    }
}