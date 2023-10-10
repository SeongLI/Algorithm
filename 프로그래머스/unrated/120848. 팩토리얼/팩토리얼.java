class Solution {
    public int solution(int n) {
        int[] arr = new int[12];
        arr[1] = 1;
        for(int i = 2 ; i <= 11 ; i++){
            arr[i] = arr[i-1] * i;
            if(arr[i] > n) return i-1;
        }
        
        return 1;
    }
}