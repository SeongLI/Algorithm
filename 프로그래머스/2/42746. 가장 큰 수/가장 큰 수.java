import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String[] str_arr = new String[numbers.length];
        for(int i = 0 ; i < str_arr.length ; i++){
            str_arr[i] = numbers[i]+"";
        }
        
        Arrays.sort(str_arr, new Comparator<String>(){
            public int compare(String o1, String o2){
                return (o2+o1).compareTo(o1+o2); // 역순
            }
        });
        
        if(str_arr[0].equals("0")) return "0";
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < str_arr.length ; i++){
            sb.append(str_arr[i]);            
        }
        
        return sb.toString();
    }
}