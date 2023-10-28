class Solution {
    public String solution(String phone_number) {
        // 번호 길이를 저장
        // 마지막 4개만 저장
        // 나머지 별로 채움
        int len = phone_number.length();
        
        String answer = "";
        for(int i = 0 ; i < len - 4 ; i++){
            answer += '*';
        }
        answer += phone_number.substring(len-4, len);
        return answer;
            
    
    }
}