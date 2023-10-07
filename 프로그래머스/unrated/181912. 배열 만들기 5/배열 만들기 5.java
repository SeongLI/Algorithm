import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();        
        
        for(int i = 0 ; i < intStrs.length ; i++){
            String tempBefore = intStrs[i].toString();
            String tempAfter = tempBefore.substring(s,s+l);
            int tempInt = Integer.parseInt(tempAfter);
            if(k<tempInt) list.add(tempInt);
        }
        
        int size = list.size();
        int[] result = new int[size];
        for(int i = 0 ; i < size ; i ++){
            result[i] = list.remove(0);
        }
        
        return result;
    }
}