class Solution {
    public String solution(String n_str) {
        String[] str_Arr = n_str.split("");
        int index = -1;
        for(int i = 0 ; i < n_str.length() ; i++){
            if(!str_Arr[i].equals("0")) {
                index = i;
                break;
            }
        }
        return n_str.substring(index);
    }
}