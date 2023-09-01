class Solution {
    public int solution(String my_string, String is_suffix) {
        int len_x = my_string.length();
        int len_y = is_suffix.length();
        
        if(len_x < len_y) return 0;
        else{
              String temp = my_string.substring(len_x-len_y, len_x);
                
              if(temp.equals(is_suffix)){
                  return 1;
              } else{
                  return 0;
              }
        }
        
        
    }
}