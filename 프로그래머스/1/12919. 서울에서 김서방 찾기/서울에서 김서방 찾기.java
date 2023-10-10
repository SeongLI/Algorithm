class Solution {
    public String solution(String[] seoul) {
        int temp = -1;
        for(int i = 0 ; i < seoul.length ; i++){
            if(seoul[i].equals("Kim")) {
                temp = i;
                break;    
            }
        }
        
         return "김서방은 " + Integer.toString(temp) + "에 있다";
        
    }
}