class Solution {
    public int solution(int order) {
        String str = "" + order;
        String[] str_arr = str.split("");
        int cnt = 0;
        for(int i = 0 ; i < str_arr.length ; i++){
            if(str_arr[i].equals("3") || str_arr[i].equals("6") || str_arr[i].equals("9")){
                cnt ++;
            }
        }
        return cnt;
    }
}