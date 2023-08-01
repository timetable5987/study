/*
https://school.programmers.co.kr/learn/courses/30/lessons/12915

문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
*/


class Solution {
    public String[] solution(String[] strings, int n) {
        
        String[] immi = new String[strings.length];
                
        for(int i = 0; i < strings.length; i++){
            immi[i] = String.valueOf(strings[i].charAt(n));
        }
        
        
        for(int i=1; i < immi.length; i++){
            for(int j=i ; j >= 1; j--){
                if(immi[j].compareTo(immi[j-1]) < 0){
                
                    String tmp = immi[j];
                    immi[j] = immi[j-1];
                    immi[j-1] = tmp;
                    
                    tmp = strings[j];
                    strings[j] = strings[j-1];
                    strings[j-1] = tmp;                   
                    
                    
                }else if(immi[j].compareTo(immi[j-1]) == 0){
                    
                    if(strings[j].compareTo(strings[j-1]) < 0){
                
                    String tmp = immi[j];
                    immi[j] = immi[j-1];
                    immi[j-1] = tmp;
                    
                    tmp = strings[j];
                    strings[j] = strings[j-1];
                    strings[j-1] = tmp;
                }
                    
                }else {
                    break; 
                } //자기보다 작은 데이터를 만나면 그 위치에서 멈춤
            }
        }         
       
        
        return strings;
    }
}