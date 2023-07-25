import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        
        for(String s : babbling){
       //     System.out.println("주어진 단어 : " + s);
            String[] s1 = s.split("");
            int i = result(s1);
            answer += i;
        }
        
        return answer;
    }
    
    public int result(String[] s1){
        
        ArrayList<String> list = new ArrayList<>();
        String sum = "";
        
        for(String s : s1){
            sum+=s;
            
            if(list.size() > 0&&list.get(list.size()-1).equals(sum)){
                return 0;
            }
            
            if(
                sum.equals("aya") || 
                sum.equals("ye") || 
                sum.equals("ma") || 
                sum.equals("woo"))
            {    
                list.add(sum);
                sum = "";
            }            
          //  System.out.println(sum);
           
        }
        
        if(sum.length() != 0){
            return 0;
        }else{
            return 1;
        }
    }
}