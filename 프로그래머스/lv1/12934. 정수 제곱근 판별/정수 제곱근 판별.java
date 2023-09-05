class Solution {
    public long solution(long n) {
        long sq = (long) Math.sqrt(n);
        if(sq * sq != n){
            return -1;
        } else{
            return (long)Math.pow(sq+1 , 2);
        }
    }
}