class Solution {
    public String solution(String letter) {
        String[] str_arr = letter.split(" ");
        
        String[] morse_arr = {
    ".-","-...","-.-.","-..",".","..-.",
    "--.","....","..",".---","-.-",".-..",
    "--","-.","---",".--.","--.-",".-.",
    "...","-","..-","...-",".--","-..-",
    "-.--","--.." };
        
        // StringBuilder sb = new StringBuilder();
        String result = "";
        for(int i = 0 ; i < str_arr.length ; i++){
            String temp = str_arr[i];
            for(int j = 0 ; j < morse_arr.length ; j++){
                // if(temp.equals(morse_arr[j])) sb.append(Character.toString(j+'a'));
                if(temp.equals(morse_arr[j])) result += (char)(j+'a');
            }
        }
        // return sb.toString();
        return result;
    }
}