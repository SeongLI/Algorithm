import java.util.LinkedList;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0 ; i < arr.length ; i ++){
            list.add(arr[i]);
        }
        for(int i = 0 ; i < queries.length ; i ++){
            int front = queries[i][0];
            int back = queries[i][1];
            int front_temp = list.get(front);
            int back_temp = list.get(back);
            
            list.remove(front);
            list.add(front, back_temp);
            list.remove(back);
            list.add(back, front_temp);
        }
        
        int size = list.size();
        
        int[] result = new int[size];
        for(int i = 0 ; i < size ; i++){
            result[i] = list.remove(0);
            }
        return result;
    }
}