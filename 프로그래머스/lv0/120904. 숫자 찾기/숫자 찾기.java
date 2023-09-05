class Solution {
    public int solution(int num, int k) {
        String str = "" + num;
        String kk = "" + k;
        String[] str_arr = str.split("");
        for(int i = 0 ; i < str_arr.length ; i++){
            if(str_arr[i].equals(kk)) return i+1;
        }
        return -1;
    }
}