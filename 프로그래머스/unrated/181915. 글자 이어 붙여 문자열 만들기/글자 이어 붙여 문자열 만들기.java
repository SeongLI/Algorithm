class Solution {
    public String solution(String my_string, int[] index_list) {
        String[] str_arr = my_string.split("");
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < index_list.length ; i++){
            sb.append(str_arr[index_list[i]]);
        }
        return sb.toString();
    }
}