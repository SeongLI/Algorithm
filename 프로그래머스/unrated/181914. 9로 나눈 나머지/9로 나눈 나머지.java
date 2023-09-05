class Solution {
    public int solution(String number) {
        String[] str = number.split("");
        int num = 0;
        for(String x : str){
            num += Integer.parseInt(x);
        }
        return num % 9;
    }
}