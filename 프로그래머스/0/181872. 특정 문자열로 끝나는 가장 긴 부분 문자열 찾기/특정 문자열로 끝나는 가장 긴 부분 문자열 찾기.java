class Solution {
    public String solution(String myString, String pat) {
        int pat_len = pat.length();
        
        int index = -1;
        for(int i = 0 ; i < myString.length() - pat_len + 1 ; i++){
            String temp = myString.substring(i,i+pat_len);
            if(temp.equals(pat)) index = i + pat_len - 1;
        }
    
        return myString.substring(0, index+1);
    }
}