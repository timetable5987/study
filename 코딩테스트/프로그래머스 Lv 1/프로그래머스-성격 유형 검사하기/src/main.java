import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);
        
        for(int i = 0; i < survey.length; i++){
            
            String s = survey[i];
            
            if(choices[i] == 4){
                continue;
            }else if(choices[i] > 4){
                map.put(s.charAt(1), choices[i] - 4 + map.get(s.charAt(1)));
            }else{
                map.put(s.charAt(0), 4-choices[i] + map.get(s.charAt(0)));
            }
        }       
        
        
        if(map.get('R') >= map.get('T')){
            answer += 'R';
        }else{
            answer += 'T';
        }
        
        if(map.get('C') >= map.get('F')){
            answer += 'C';
        }else{
            answer += 'F';
        }
        
        if(map.get('J') >= map.get('M')){
            answer += 'J';
        }else{
            answer += 'M';
        }
        
        if(map.get('A') >= map.get('N')){
            answer += 'A';
        }else{
            answer += 'N';
        }
        
        System.out.println(answer);
        return answer;
    }
}