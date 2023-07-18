/*
https://school.programmers.co.kr/learn/courses/30/lessons/86491
모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다. 
모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 
지갑의 크기를 return 하도록 solution 함수를 완성해주세요.
*/


class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[][] size = sizes;
        for(int i = 0; i < size.length; i++){
            int temp = 0;
            if(size[i][0] < size[i][1]){
                temp = size[i][0];
                size[i][0] = size[i][1];
                size[i][1] = temp;
            }
            
            //System.out.println("배열 크기 -> " + size[i][0] + " , "+ size[i][1]);
        }
        return sorting(size);
        
    
    }
    
    public int sorting(int[][] arr){
        int n = 0;
        int m = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i][0] > n ){
                n = arr[i][0];
            }
            
            if(arr[i][1] > m ){
                m = arr[i][1];
            }
            //System.out.println(n + " : " + m);
        }
        
        return n*m;
    }
}