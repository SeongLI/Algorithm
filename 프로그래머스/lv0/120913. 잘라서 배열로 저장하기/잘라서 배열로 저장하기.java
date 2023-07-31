class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
        String[] answer = new String[len];
        
        for(int i = 0 ; i < len ; i++){
            int start = n*i;
            int end = 0;
            
            if(start + n > my_str.length() ){
                end = my_str.length();
            } else{
                end = start + n;
            }
            answer[i] = my_str.substring(start, end);
            
        }
        
        
        return answer;
    }
}