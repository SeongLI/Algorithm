class Solution {
    public int solution(String myString, String pat) {
        
        int pat_len = pat.length();
        int sum = 0;
        for(int i = 0 ; i < myString.length() - pat_len + 1 ; i ++){
                if(myString.substring(i, i+ pat.length()).equals(pat)) {
                    sum++;
                }
        }
        
        return sum;
    }
}