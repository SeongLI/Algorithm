class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
         if(myString.endsWith("x")){
            String[] str_arr = myString.split("x");
            int[] result = new int[str_arr.length + 1];
            for(int i = 0 ; i < str_arr.length ; i++){
                result[i] = str_arr[i].length();
            }
            return result;
        } else{
            String[] str_arr = myString.split("x");
            int[] result = new int[str_arr.length];
            for(int i = 0 ; i < str_arr.length ; i++){
                result[i] = str_arr[i].length();
            }
            return result;
        }
    }
}