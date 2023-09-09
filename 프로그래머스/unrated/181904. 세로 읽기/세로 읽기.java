class Solution {
    public String solution(String my_string, int m, int c) {
        char[][] str_Arr = new char[my_string.length() / m][m];
        int index = 0;
        for(int i = 0 ; i < my_string.length() / m ; i++){
            for(int j = 0 ; j < m ; j++){
                str_Arr[i][j] = my_string.charAt(index);
                index++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < my_string.length()/m ; i++){
            sb.append(str_Arr[i][c-1]);
        }
        return sb.toString();
    }
}