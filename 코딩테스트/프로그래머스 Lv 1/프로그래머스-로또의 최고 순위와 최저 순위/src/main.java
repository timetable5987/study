/*
https://school.programmers.co.kr/learn/courses/30/lessons/77484

순서와 상관없이, 구매한 로또에 당첨 번호와 일치하는 번호가 있으면 맞힌 걸로 인정됩니다.
알아볼 수 없는 두 개의 번호를 각각 10, 6이라고 가정하면 3등에 당첨될 수 있습니다.
3등을 만드는 다른 방법들도 존재합니다. 하지만, 2등 이상으로 만드는 것은 불가능합니다.
알아볼 수 없는 두 개의 번호를 각각 11, 7이라고 가정하면 5등에 당첨될 수 있습니다.
5등을 만드는 다른 방법들도 존재합니다. 하지만, 6등(낙첨)으로 만드는 것은 불가능합니다.
*/

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        int num = 0;
        int zero = 0;
        for(int i = 0; i <6; i++){
            if(lottos[i] == 0){
                zero++;
                continue;
            }
            for(int n : win_nums){
                
                if(lottos[i] == n){
                    num++;
                }
            }
        }
        System.out.println("0 : " + zero + "당첨 : " + num);
        
        int[] answer = new int[2];
        if(zero == 0){
            answer[0] = check(num);            
        }else{
            answer[0] = check(num+zero);
        }
        answer[1] = check(num);
        
        return answer;
    }
    
    public int check(int num){
        switch(num){
            case 6:
                return 1;
                         
            case 5:
                return 2;
                             
            
            case 4:
                return 3;
                             
            
            case 3:
                return 4;
                           
            case 2:
                return 5;
                
            default:
                return 6;
        }
    }
}