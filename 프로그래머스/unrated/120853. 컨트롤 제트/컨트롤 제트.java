class Solution {
    public int solution(String s) {
        int sum = 0;
        String[] str_arr = s.split(" ");
        int save_point = 0;
        for(int i = 0 ; i < str_arr.length ; i++){
            String temp = str_arr[i];
            if(temp.equals("Z")){
                sum -= save_point;
            } else {
                save_point = Integer.parseInt(temp);
                sum += save_point;
            }
        }
        return sum;
    }
}