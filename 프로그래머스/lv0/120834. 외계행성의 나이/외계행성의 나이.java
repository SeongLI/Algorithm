class Solution {
    public String solution(int age) {
        String answer = "" + age;
        String[] str_arr = answer.split("");

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < str_arr.length ; i++){ 
           char temp = (char)(Integer.parseInt(str_arr[i]) + 97);
            sb.append(temp);
        }
        
        return sb.toString();
    }
}