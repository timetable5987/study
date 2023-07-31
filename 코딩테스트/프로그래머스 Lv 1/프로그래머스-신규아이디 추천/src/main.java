import java.util.*;

class Solution {
    public String solution(String new_id) {
        
        //1번
        new_id = new_id.toLowerCase();
        String newId = "";
        //2번
        for(int i = 0; i < new_id.length(); i++){
            if((int)new_id.charAt(i) >= 97 && (int)new_id.charAt(i) <= 122){
                newId += new_id.charAt(i);
            }else if((int)new_id.charAt(i) >= 48 && (int)new_id.charAt(i) <= 57){
                newId += new_id.charAt(i);
            }else if(new_id.charAt(i) == '-' || new_id.charAt(i) == '.' || 
                     new_id.charAt(i) == '_' ){
                newId += new_id.charAt(i);
            }
        }
        
        System.out.println("2번 " +newId);
        
        //3번
        while(true){
            if(!newId.contains("..")){
                break;
            }else{
                newId=newId.replace("..", ".");
            }           
        }
        System.out.println("3번 " +newId);
        
        //4번
                    
        if(newId.charAt(0) == '.'){
            newId = newId.substring(1);
        }        
        if(newId.length() == 0){
            newId = "a";
        }       
        if(newId.length() > 1 && newId.charAt(newId.length()-1) == '.'){
            newId = newId.substring(0, newId.length()-1);
        }
        
        System.out.println("4번 " +newId);
        
        //6번
        if(newId.length() >= 16){
            newId=newId.substring(0, 15);
            
        }else if(newId.length() == 0){
            newId = "a";
        }
        //6-1번
        if(newId.length() > 1 && newId.charAt(newId.length()-1) == '.'){
            newId = newId.substring(0, newId.length()-1);
        }
        
        System.out.println(newId.length()+ " 6번 " +newId);
        
        //7번
        if(newId.length() <= 2){
            char last = newId.charAt(newId.length()-1);
            for(int  i =0; i <= 3-newId.length(); i++){
                newId += last;
            }
        }
        System.out.println("7번 " +newId);
        
        System.out.println(newId);
                
        
        return newId;
    }

}
