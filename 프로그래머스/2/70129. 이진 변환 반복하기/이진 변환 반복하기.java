class Solution {
    public int[] solution(String s) {
        int zero = 0; // 제거된 0 누적합
        int count = 0; // 회차 누적합
        
        while(!s.equals("1")){
            count++;            
            System.out.println(count + " s :" + s);
            
            String[] new_s = s.split("");
            int after_len = 0; // 0 제거 후 길이 
            for(int i = 0 ; i < new_s.length ; i++){
                if(new_s[i].equals("1")) after_len++;
            }
            int before_len = s.length(); // 0 제거 전 길이

            zero += before_len - after_len; // 0 제거 횟수

            StringBuilder sb = new StringBuilder();
            while(after_len > 0){
                sb.append(after_len % 2);
                after_len = after_len / 2 ;
            }
            s = sb.reverse().toString();
        }
        
        return new int[]{ count, zero };
        
    
    }
}