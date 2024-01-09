// 아이디어 : 0부터 number길이-k 까지 한개 이상은 들어간다.
class Solution {
    public String solution(String number, int k) {
        
        StringBuilder sb = new StringBuilder();
        int max_index = 0; // 서서히 올라갈거야
        
        for(int i = 0 ; i < number.length() - k ; i++){
            int max = 0 ; // max 초기화
            for(int j = max_index ; j <= i + k ; j++){
                int temp = number.charAt(j) - '0';
                if(max < temp){
                    max = temp;
                    max_index = j + 1; // 하나를 더 올려줘야 반복이 돌아.
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
}