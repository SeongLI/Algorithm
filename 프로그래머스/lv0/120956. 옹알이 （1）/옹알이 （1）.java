class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
            
         for(int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace("aya", "000");
            babbling[i] = babbling[i].replace("woo", "000");
            babbling[i] = babbling[i].replace("ye", "00");
            babbling[i] = babbling[i].replace("ma", "00");
            babbling[i] = babbling[i].replace("0", "");
 
            if(babbling[i].length() == 0) answer++;
        }
        
        return answer;

    } // solution 끝
}