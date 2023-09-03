class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int cnt = 0;
        for(int i = 0 ; i< finished.length ; i++){
            if(!finished[i]) cnt++;
        }
        String[] result = new String[cnt];
        int index = 0;
        for(int i = 0 ; i < finished.length ; i++){
            if(!finished[i]){
                result[index] = todo_list[i];
                index++;
            }
        }
        
        return result;
    }
}