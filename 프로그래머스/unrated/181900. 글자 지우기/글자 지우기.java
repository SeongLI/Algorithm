class Solution {
    public String solution(String my_string, int[] indices) {
        String[] ch_arr = my_string.split("");
        String temp = "X";
        for(int i = 0 ; i < indices.length ; i++){
            int index = indices[i];
            ch_arr[index] = temp;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < ch_arr.length ; i++){
            if(!ch_arr[i].equals(temp)) sb.append(ch_arr[i]);
        }
        return sb.toString();
    }
}