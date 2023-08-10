/*
https://school.programmers.co.kr/learn/courses/30/lessons/42587#

운영체제의 역할 중 하나는 컴퓨터 시스템의 자원을 효율적으로 관리하는 것입니다. 
이 문제에서는 운영체제가 다음 규칙에 따라 프로세스를 관리할 경우 
특정 프로세스가 몇 번째로 실행되는지 알아내면 됩니다.

현재 실행 대기 큐(Queue)에 있는 프로세스의 중요도가 순서대로 담긴 배열 priorities와, 
몇 번째로 실행되는지 알고싶은 프로세스의 위치를 알려주는 location이 매개변수로 주어질 때, 
해당 프로세스가 몇 번째로 실행되는지 return 하도록 solution 함수를 작성해주세요.
*/

import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : priorities){
            list.add(i);
        }
        Collections.sort(list);
        Collections.reverse(list);
        
        Stack<Integer> stack = new Stack<>();
        
        
        int find = priorities[location];
        int n = 0;
        for(int i = 0; i < priorities.length; i++){
            if(priorities[i] == list.get(0)){
                n = i;
                break;
            }
        }        
               
        while(true){
            
       //     System.out.println("현재 값 " +priorities[n] + " 횟수 : " + n);
            if(priorities[n] == find && n == location && list.get(0) == priorities[n]){
                stack.push(priorities[n]);
                break;
            }else if(priorities[n] == list.get(0)){
                stack.push(priorities[n]);
                list.remove(0);                
           //     System.out.println("스택 : " + priorities[n] + " , " + list.get(0));
            }
            n++;
            if(n == priorities.length){
                n = 0;
            }
        }
        
        return stack.size();
    }
}