/*
https://school.programmers.co.kr/learn/courses/30/lessons/131128

두 정수 X, Y의 임의의 자리에서 공통으로 나타나는 정수 k(0 ≤ k ≤ 9)들을 이용하여 만들 수 있는 가장 큰 정수를 두 수의 짝꿍이라 합니다(단, 공통으로 나타나는 정수 중 서로 짝지을 수 있는 숫자만 사용합니다). X, Y의 짝꿍이 존재하지 않으면, 짝꿍은 -1입니다. X, Y의 짝꿍이 0으로만 구성되어 있다면, 짝꿍은 0입니다.

예를 들어, X = 3403이고 Y = 13203이라면, X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 3, 0, 3으로 만들 수 있는 가장 큰 정수인 330입니다. 다른 예시로 X = 5525이고 Y = 1255이면 X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 2, 5, 5로 만들 수 있는 가장 큰 정수인 552입니다(X에는 5가 3개, Y에는 5가 2개 나타나므로 남는 5 한 개는 짝 지을 수 없습니다.)
두 정수 X, Y가 주어졌을 때, X, Y의 짝꿍을 return하는 solution 함수를 완성해주세요.
*/


import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        //String answer = "";
        
        ArrayList<String> list = new ArrayList<>();
        int[] arr1 = new int[10];
        String[] s1 = X.split("");
        String[] s2 = Y.split("");
        for(String s : s1){
            
            int n = Integer.parseInt(s);
            if(arr1[n] == 0){
                arr1[n] = 1;    
            }else{
                arr1[n] = arr1[n] + 1;    
            }
            
          
        }
        
        int[] arr2 = new int[10];
        
        for(String s : s2){
            
            int n = Integer.parseInt(s);
            if(arr2[n] == 0){
                arr2[n] = 1;    
            }else{
                arr2[n] = arr2[n]+1;    
            }            
            
            
        }
        for(int i = 0; i < 10; i++){
            
            String mm = String.valueOf(i);
            
            if(arr1[i] != 0 && arr2[i] != 0 && arr1[i] >= arr2[i]){
                for(int j = 0; j < arr2[i]; j++){
                    list.add(mm);
                }
                
            }else if(arr1[i] != 0 && arr2[i] != 0 && arr1[i] < arr2[i]){
                for(int j = 0; j < arr1[i]; j++){
                    list.add(mm);
                }
            }
            
        }
        
        
        
        if(list.size() == 0){
            return "-1";
        }
        Collections.sort(list);
        
        if(list.get(list.size()-1).equals("0")){
            return "0";
        }
        
        StringBuilder answer = new StringBuilder();
        
        for(int i = list.size() - 1; i >= 0; i--){
            answer.append(list.get(i));
          //  answer += list.get(i);
      //      System.out.println("[" + answer);
        }
        
        return answer.toString();
    }
}