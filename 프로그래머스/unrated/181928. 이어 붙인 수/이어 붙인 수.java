class Solution {
    public int solution(int[] num_list) {
        // 홀짝 구분
        // string으로 만든다.
        // 두 수를 더한다.
        StringBuilder sb_even = new StringBuilder();        
        StringBuilder sb_odd = new StringBuilder();
        
        for(int i = 0 ; i < num_list.length ; i++){
            if(num_list[i] % 2 == 0){
                sb_even.append(String.valueOf(num_list[i]));
            } else{
                sb_odd.append(String.valueOf(num_list[i]));
            }
        }
        
        int result = Integer.parseInt(sb_even.toString()) + Integer.parseInt(sb_odd.toString());
        return result;
        
    }
}