class Solution {
    public String solution(String my_string, int n) {
        // my_string 길이랑 n의 크기를 생각
        int len = my_string.length();
        String result = my_string.substring(len-n,len);
        return result;
    }
}