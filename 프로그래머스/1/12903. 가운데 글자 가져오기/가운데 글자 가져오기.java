class Solution {
    public String solution(String s) {
        int len = s.length();
        
        String ans = "";
        if(len % 2 == 0){
            ans += s.charAt(len/2 - 1);
            ans += s.charAt(len/2);
        } else{
            ans += s.charAt(len/2);
        }
        return ans;
    }
}