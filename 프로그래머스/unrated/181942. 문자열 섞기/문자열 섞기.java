class Solution {
    public String solution(String str1, String str2) {
        String[] str1_arr = str1.split("");
        String[] str2_arr = str2.split("");
        int len = str1_arr.length;
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < len ; i++){
            sb.append(str1_arr[i]).append(str2_arr[i]);
        }
        return sb.toString();
    }
}