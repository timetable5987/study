/*
https://school.programmers.co.kr/learn/courses/30/lessons/49993

선행 스킬 순서 skill과 유저들이 만든 스킬트리1를 담은 배열 skill_trees가 매개변수로 주어질 때, 
가능한 스킬트리 개수를 return 하는 solution 함수를 작성해주세요.

*/

import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        
        String[] tree = skill.split("");
        List<String> list = Arrays.asList(tree);
        
        int p = 0;
        for(String s : skill_trees){
            ArrayList<String> stack = new ArrayList<>();
            int cnum = 0;
            int i = 0;
            String[] t1 = s.split("");
            
            for(String t : t1){
                if(skill.contains(t)){
                    if(stack.size() == 0 && list.get(0).equals(t)){
                        stack.add(t);
                        cnum++;
                    }else if(stack.size() != 0 && t.equals(list.get(cnum))){
                        stack.add(t);
                        cnum++;
                    }else{
                        break;
                    }
                }
                i++;
            }
            if(i == t1.length){
                p++;
            }
        }
        
        return p;
    }
}