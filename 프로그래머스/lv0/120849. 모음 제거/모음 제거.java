
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        int len = my_string.length();
        char[] ch_arr = my_string.toCharArray();
        char[] a_arr = {'a', 'e', 'i', 'o', 'u'};
        
        StringBuilder sb = new StringBuilder();
        loop : for(int i = 0 ; i < len ; i++){
            int cnt = 0;
            for(int j = 0 ; j < 5 ; j++){
                cnt++;
                if(ch_arr[i] == a_arr[j]){
                    continue loop;
                }
                if(cnt == 5){
                    sb.append(ch_arr[i]);
                }
            }    
        }
        System.out.print(sb);
    
        
        
        return sb.toString();
    }
}