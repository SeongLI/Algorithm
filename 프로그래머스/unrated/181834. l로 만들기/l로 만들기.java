class Solution {
    public String solution(String myString) {
        char[] ch_arr = myString.toCharArray();

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < ch_arr.length ; i++){
            if(ch_arr[i] < 'l'){
                ch_arr[i] = 'l';
            }
            sb.append(ch_arr[i]);
        }

        return sb.toString();
    }
}