/*
https://school.programmers.co.kr/learn/courses/30/lessons/49994

게임 캐릭터를 4가지 명령어를 통해 움직이려 합니다. 명령어는 다음과 같습니다.

U: 위쪽으로 한 칸 가기

D: 아래쪽으로 한 칸 가기

R: 오른쪽으로 한 칸 가기

L: 왼쪽으로 한 칸 가기

캐릭터는 좌표평면의 (0, 0) 위치에서 시작합니다. 
좌표평면의 경계는 왼쪽 위(-5, 5), 왼쪽 아래(-5, -5), 
오른쪽 위(5, 5), 오른쪽 아래(5, -5)로 이루어져 있습니다.

이때, 우리는 게임 캐릭터가 지나간 길 중 캐릭터가 처음 걸어본 길의 길이를 구하려고 합니다.
*/

import java.util.*;

class Solution {
    public int solution(String dirs) {
        
        int[] location = new int[2];
        HashSet<String> list = new HashSet<>();
        String[] s1 = dirs.split("");
        String x = "00";
        String y = "";
        
        for(String s : s1){
            location = togo(location, s);
            y = location[0] +"" + location[1];
            
            if(x.equals(y)){
                y = "";
                continue;
            }
            
            if(!list.contains(y+x)){
                list.add(x+y);    
            }

            x = y;
            y = "";
        }        
        
        return list.size();
    }
    
    public int[] togo(int[] location, String s){
        if(s.equals("U")){
            if(location[1] + 1 > 5){
                return location;
            }
            location[1] = location[1] + 1; 
        }
        if(s.equals("D")){
            if(location[1] - 1 < -5){
                return location;
            }
            location[1] = location[1] - 1; 
        }
        if(s.equals("R")){
            if(location[0] + 1 > 5){
                return location;
            }
            location[0] = location[0] + 1; 
        }
        if(s.equals("L")){
            if(location[0] - 1 < -5){
                return location;
            }
            location[0] = location[0] - 1; 
        }
        return location;
    }
    
    
}