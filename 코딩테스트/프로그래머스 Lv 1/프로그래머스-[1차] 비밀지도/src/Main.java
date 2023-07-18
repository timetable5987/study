import java.util.*;

/*
    https://school.programmers.co.kr/learn/courses/30/lessons/17681#

    지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 "공백"(" ") 또는 "벽"("#") 두 종류로 이루어져 있다.
    전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다.
    각각 "지도 1"과 "지도 2"라고 하자. 지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다.
    지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
    "지도 1"과 "지도 2"는 각각 정수 배열로 암호화되어 있다.
    암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.
 */
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {

        HashMap<Integer, String> map = new HashMap<>();
        int[] dList = new int[arr1.length];

        int num = 1;

        // 지도 1 복호화
        for (int i : arr1) {
            String s = decording(i, n);

            for (int j = 0; j < s.length(); j++) {
                //복호화된 문자열을 int형으로 변환
                int is = Character.getNumericValue(s.charAt(j));

                //숫자에 따라 벽인지, 아닌지 구분한 후 해쉬맵에 삽입
                if (is == 0) {
                    map.put(num, " ");
                    System.out.println(is + " : " + map.get(num));
                    num++;
                } else if (is == 1) {
                    map.put(num, "#");
                    System.out.println(is + " : " + map.get(num));
                    num++;
                }

            }
            System.out.println(" : " + num);
        }


        //2진수 변환
        num = 1;
        for (int i : arr2) {

            String s = decording(i, n);

            //지도 2를 복호화
            for (int j = 0; j < s.length(); j++) {
                int is = Character.getNumericValue(s.charAt(j));

                //지도2와 지도 1을 비교한 후, 추가적으로 벽을 삽입
                if (map.get(num).equals(" ") && is == 1) {
                    map.put(num, "#");
                }
                System.out.println(is + " : " + map.get(num));
                num++;
            }
            System.out.println(" : " + num);
        }


        String m = "";
        String[] answer = new String[n];

        //전체 지도 출력
        int j = -1;
        for (int i = 1; i <= map.size(); i++) {

            m = m + map.get(i);
            //특정 길이가 되었을 경우, 배열에 저장
            if (m.length() == n) {
                j++;
                answer[j] = m;

                m = "";
            }

        }

        return answer;
    }

    //지도 복호화 함수
    public String decording(int i, int n) {
        int num = i;

        ArrayList<Integer> list = new ArrayList<>();
        //10진수 -> 2진수로 변환
        while (num > 1) {
            list.add(num % 2);
            num = num / 2;
        }
        list.add(num);

        //변환된 2진수의 길이 != 지도의 길이일 경우, 0을 추가
        if (list.size() != n) {
            int j = n - list.size();
            for (int ii = 0; ii < j; ii++) {
                list.add(0);
            }
        }
        //리스트 역순으로 변환
        Collections.reverse(list);
        //리스트에 담긴 숫자를 문자열로 변환한 후 반환
        String array = "";
        for (int j : list) {
            array += j;

        }
        //System.out.println(array);
        return array;
    }
}