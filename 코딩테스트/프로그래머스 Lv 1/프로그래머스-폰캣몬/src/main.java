import java.util.*;

class Solution {
    public int solution(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : nums){
            if(list.contains(i)){
                continue;
            }else{
                list.add(i);
                System.out.println(i + " 삽입 ");
            }
        }
        
        if(list.size() > nums.length/2){
            return nums.length/2;
        }else{
            return list.size();
        }
     
    }
}