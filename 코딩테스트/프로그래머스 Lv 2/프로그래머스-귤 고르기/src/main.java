/*
https://school.programmers.co.kr/learn/courses/30/lessons/138476

예를 들어, 경화가 수확한 귤 8개의 크기가 [1, 3, 2, 5, 4, 5, 2, 3] 이라고 합시다. 
경화가 귤 6개를 판매하고 싶다면, 크기가 1, 4인 귤을 제외한 여섯 개의 귤을 상자에 담으면, 
귤의 크기의 종류가 2, 3, 5로 총 3가지가 되며 이때가 서로 다른 종류가 최소일 때입니다.

경화가 한 상자에 담으려는 귤의 개수 k와 귤의 크기를 담은 배열 tangerine이 매개변수로 주어집니다. 
경화가 귤 k개를 고를 때 크기가 서로 다른 종류의 수의 최솟값을 return 하도록 solution 함수를 작성해주세요.
*/

import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : tangerine){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : map.keySet()){
            list.add(map.get(i));
        }
        
        Collections.sort(list);
        Collections.reverse(list);
        
        int sum = 0;
        int n = 1;
        for(int i : list){
            sum += i;
            
            if(sum >= k){
                return n;
            }else{
                n++;
            }
        }
        
        int answer = 0;
        return answer;
    }
}