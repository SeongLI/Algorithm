class Solution {
    public int[] solution(long n) {
        String str = "" + n;
        String[] str_arr = str.split("");
        int[] result = new int[str_arr.length];
        for(int i = str_arr.length - 1 ; i >= 0 ; i--){
            result[str_arr.length-i-1] = Integer.parseInt(str_arr[i]);
        }
        return result;
    }
}