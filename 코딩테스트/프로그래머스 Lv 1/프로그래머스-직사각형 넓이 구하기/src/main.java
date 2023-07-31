import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        for(int i = 0; i < 4; i++){
            list1.add(dots[i][0]);
            list2.add(dots[i][1]);
        }
        
        Collections.sort(list1);
        Collections.sort(list2);
        
        int x = list1.get(3) - list1.get(0);
        int y = list2.get(3) - list2.get(0);
        
       
        int sum = x * y;
        
        if(sum < 0){
            sum = sum * -1;
        }
        
        
        return sum;
    }
}