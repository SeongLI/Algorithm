class Solution {
    public int solution(int hp) {
        int cnt = 0;
        while(hp >0){
            if(hp >= 5){
                hp -= 5;
                cnt ++;
            } else if(hp >= 3){
                hp -= 3;
                cnt ++;
            } else{
                hp -= 1;
                cnt ++;
            }
        }
        return cnt;
    }
}