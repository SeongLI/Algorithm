class Solution {
    public String solution(String code) {
        String answer = "";
        
        int mode = 0; // 짝수
        for(int i = 0 ; i < code.length() ; i++){
            char temp = code.charAt(i);
            if(mode == 1){
                if(temp == '1'){
                    mode = 0;
                }else{
                    if(i % 2 == 1) {
                        answer = answer + temp;
                    }
                }
            }else{ // mode가 0일 때,
                if(temp == '1'){
                    mode = 1;
                }else{
                    if(i % 2 == 0) {
                        answer = answer + temp;
                    }
                }
            }
        }
        
        if(answer.equals("")) return "EMPTY";
        
        return answer;
    }
}