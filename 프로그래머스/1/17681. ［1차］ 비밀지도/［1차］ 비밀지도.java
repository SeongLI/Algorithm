// 원소 하나마다 2진수로 바꿔
// int -> string 변환 1 => # 
// 두개를 합쳐
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        int num = 10;
        String[] answer = new String[n];
        
        for(int i = 0 ; i < n ; i++){
            String temp1 = func(arr1[i], n);
            String temp2 = func(arr2[i], n);
            String ans_temp = "";
            for(int j = 0 ; j < n ; j++){
                if(temp1.charAt(j) == '#' || temp2.charAt(j) == '#'){
                    ans_temp += "#";
                }else ans_temp += " ";
            }
            answer[i] = ans_temp;
        }
        return answer;
    }
    
    public static String func(int num, int n){
        String value = "";
        for(int i = n-1 ; i >= 0 ; i --){
            double temp = Math.pow(2, i);
            if(temp == 0 || num < temp) value += " ";
            else {
                value += "#";
                num -= temp;
            }
        }
        return value;
    }
}