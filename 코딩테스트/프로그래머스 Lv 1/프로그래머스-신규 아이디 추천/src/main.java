/*
https://school.programmers.co.kr/learn/courses/30/lessons/72410

카카오에 입사한 신입 개발자 네오는 "카카오계정개발팀"에 배치되어, 카카오 서비스에 가입하는 유저들의 아이디를 생성하는 업무를 담당하게 되었습니다.
 "네오"에게 주어진 첫 업무는 새로 가입하는 유저들이 카카오 아이디 규칙에 맞지 않는 아이디를 입력했을 때, 입력된 아이디와 유사하면서 규칙에 맞는 아이디를 추천해주는 프로그램을 개발하는 것입니다.
다음은 카카오 아이디의 규칙입니다.

아이디의 길이는 3자 이상 15자 이하여야 합니다.
아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.
"네오"는 다음과 같이 7단계의 순차적인 처리 과정을 통해 신규 유저가 입력한 아이디가 
카카오 아이디 규칙에 맞는 지 검사하고 규칙에 맞지 않은 경우 규칙에 맞는 
새로운 아이디를 추천해 주려고 합니다.
*/


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
