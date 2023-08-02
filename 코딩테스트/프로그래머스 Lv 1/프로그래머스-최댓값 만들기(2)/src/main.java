import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        
        Arrays.sort(numbers);
        
        int x = numbers[0] * numbers[1];
        int y = numbers[numbers.length-2] * numbers[numbers.length-1];
        int answer = 0;
        if(x > y){
            answer = x;
        }else if(y >= x){
            answer = y;
        }
        
        
        return answer;
    }
}