import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str_arr = s.split(" ");
        
        int[] arr = new int[str_arr.length];
        for(int i = 0 ; i < str_arr.length ; i++){
            arr[i] = Integer.parseInt(str_arr[i]);
        }
        Arrays.sort(arr);
        
        System.out.println(Arrays.toString(str_arr));
        System.out.println(Arrays.toString(arr));
        
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append(" ").append(arr[arr.length -1]);
        answer = new String(sb);
        return answer;
    }
}