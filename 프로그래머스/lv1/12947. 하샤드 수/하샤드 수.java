class Solution {
    public boolean solution(int x) {
        String str = "" + x;
        int num = 0;
        String[] str_arr = str.split("");
        for(String element : str_arr){
            num += Integer.parseInt(element);
        }
        if(x % num == 0) return true;
        else return false;
    }
}