class Solution {
    public String solution(int n) {
        int len = n/2;
        
        StringBuilder sb = new StringBuilder();
        if(n%2 == 0){
            for(int i = 0 ; i < len ; i ++){
                sb.append("수박");
            }
        } else{
            for(int i = 0 ; i < len ; i++){
                sb.append("수박");
            }
            sb.append("수");
        }        
        
        return sb.toString();
        
    }
}