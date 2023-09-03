class Solution {
    public int[] solution(int n, int[] numlist) {
        int len = 0;
        for(int i = 0 ; i < numlist.length ; i++){
            if(numlist[i] % n == 0) len++;
        }
        int[] result = new int[len];
        int index = 0;
        for(int i = 0 ; i < numlist.length ; i++){
            if(numlist[i] % n == 0 ){
                result[index] = numlist[i];
                index++;
            }
        }
        return result;
    }
}