class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int queries_len =  queries.length; // 쿼리 길이(반복 횟수)
        for(int i = 0 ; i < queries_len; i++){
            for(int j = queries[i][0] ; j <= queries[i][1] ; j++ ){
                arr[j] ++;
            }
        }
        return arr;
    }
}