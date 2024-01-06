class Solution {
    public int solution(String t, String p) {
        int p_len = p.length();
        // long p_integer = Integer.parseInt(p);
        long p_integer = Long.parseLong(p);
        
        int count = 0;
        for(int i = 0 ; i < t.length() - p_len + 1 ; i++){
            String temp_arr = t.substring(i, i + p_len);
            // int temp_int = Integer.parseInt(temp_arr);
            Long temp_int = Long.parseLong(temp_arr);
            if(p_integer >= temp_int) count++;
        }
        return count;
    }
}