/*
https://school.programmers.co.kr/learn/courses/30/lessons/12945?itm_content=course14743

2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, 
solution을 완성해 주세요.
*/
class Solution {
    public int solution(int n) {

        
        int arr[] = new int[n+1];
        arr[0]=0;
        arr[1]=1;
        
        for(int i = 2; i <= n; i++){
            arr[i] = (arr[i-2] + arr[i-1])%1234567;
                        
        }
        arr[n-1] = arr[n-2]+arr[n-1];
        
		int answer = arr[n];
        
        return answer;
    }
}