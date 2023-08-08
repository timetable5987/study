import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 97; i <= 122; i++){
            String s1 = String.valueOf((char) i);
            if(!skip.contains(s1)){
                list.add(s1);    
                //System.out.println(s1);
            }
            
        }
        
        for(int i = 0; i < s.length(); i++){
            
            String immi =  String.valueOf(s.charAt(i));
            int n = list.indexOf(immi);
            
            //char(((n+1) % list.size())+97)
            answer += list.get((n+index)%list.size());
            
            System.out.println(n +" , "+ list.get((n+index)%list.size()));
        }
        
        return answer;
    }
}