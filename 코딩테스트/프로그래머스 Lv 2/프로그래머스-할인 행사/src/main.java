/*
https://school.programmers.co.kr/learn/courses/30/lessons/131127

XYZ 마트는 일정한 금액을 지불하면 10일 동안 회원 자격을 부여합니다.
XYZ 마트에서는 회원을 대상으로 매일 한 가지 제품을 할인하는 행사를 합니다. 할인하는 제품은 하루에 하나씩만 구매할 수 있습니다.
알뜰한 정현이는 자신이 원하는 제품과 수량이 할인하는 날짜와 10일 연속으로 일치할 경우에 맞춰서 회원가입을 하려 합니다.

 더보기
 */

import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();

        for (int j = 0; j < discount.length - 9; j++) {

            for (int i = 0; i < want.length; i++) {
                map.put(want[i], number[i]);
            }

            for (int i = j; i < j + 10; i++) {
                if (map.get(discount[i]) == null) {
                    continue;
                } else {
                    if (map.get(discount[i]) == 1) {
                        //   System.out.println(discount[i] +" , 날짜 "+ i);
                        map.remove(discount[i]);
                    } else {
                        map.put(discount[i], map.get(discount[i]) - 1);
                        //  System.out.println(discount[i]);
                    }
                }

                if (map.size() == 0) {
                    answer++;
                    //   System.out.println("");
                    break;
                }
            }
        }
        return answer;
    }
}