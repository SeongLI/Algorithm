class Solution {
    public int solution(String binomial) {
		String[] str_arr = binomial.split(" ");
        int x = Integer.parseInt(str_arr[0]);
        int y = Integer.parseInt(str_arr[2]);
        
        if(str_arr[1].equals("+")){
            return x+y;
        } else if(str_arr[1].equals("-")){
            return x-y;
        } else{
            return x*y;
        }
    }
}