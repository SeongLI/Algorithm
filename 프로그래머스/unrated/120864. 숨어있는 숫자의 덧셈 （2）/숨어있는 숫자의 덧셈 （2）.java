import java.util.*;

class Solution {
    public int solution(String my_string) {
        // my_string 배열은 소문자 + 대문자 + 자연수로 이루어짐
        // 소문자나 대문자가 있으면 split
        // String[] str_arr = my_string.split("[a-zA-Z]"); // a부터 z까지 + A부터 Z까지
        // String[] str_arr = my_string.split("[^0-9]+"); //  0부터 9까지의 숫자를 제외한 연속된 문자 그룹
        String[] str_arr = my_string.split("[^0-9]"); // 0부터 9까지의 숫자를 제외한 단일 문자
        System.out.println(Arrays.toString(str_arr));
        
        int sum = 0;
        for(int i = 0 ; i < str_arr.length ; i++){
            if(!str_arr[i].equals("")) sum+= Integer.parseInt(str_arr[i]);
        }
        
        return sum;
    }
}