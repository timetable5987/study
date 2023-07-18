/*
https://school.programmers.co.kr/learn/courses/30/lessons/42840

수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 
수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 
가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
*/

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(2, 1, 2, 3, 2, 4, 2, 5));
        ArrayList<Integer> a3 = new ArrayList<>(Arrays.asList(3, 3, 1, 1, 2, 2, 4, 4, 5, 5));
        
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        for(int i = 0; i < answers.length; i++){

            if(answers[i] == a1.get(i%a1.size())){                
                n1++;
                System.out.println("n1 " +n1);
            }
            if(answers[i] == a2.get(i%a2.size())){
                n2++;
                System.out.println("n2 " +n2);
            }
            if(answers[i] == a3.get(i%a3.size())){
                n3++;
                System.out.println("n3 " +n3);
            }
        }
        
        //가장 높은 점수 찾기
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(n1,n2,n3));
        Collections.sort(list);
        int num = list.get(2);
        
        
        list.clear();
        
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(n1,n2,n3));
        System.out.println("num : " + num);
        
        //가장 높은 점수 받은 사람 찾아 배열에 넣기

        int n = 0;
        for (int j = 0; j < 3; j++){
            if(num == list1.get(j)){
                System.out.println(list1.get(j) + ", " + (j+1));
                list.add(j+1);
                n++;
            }
        }
        int[] answer = new int[n];
        
        for(int k =0; k < n; k++){
            answer[k] = list.get(k);
        }
        
        
        
        return answer;
    }
}