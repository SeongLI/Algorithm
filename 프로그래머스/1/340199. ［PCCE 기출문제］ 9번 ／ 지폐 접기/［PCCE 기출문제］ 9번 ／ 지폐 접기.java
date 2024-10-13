class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        while(true){
            int wallet_max_index = -1;
            int bill_max_index = -1;
            int wallet_min_index = -1;
            int bill_min_index = -1;
            
            if(wallet[0] >= wallet[1]){
                wallet_max_index = 0;
                wallet_min_index = 1;
            } else{
                wallet_max_index = 1;
                wallet_min_index = 0;
            }
            if(bill[0] >= bill[1]){
                bill_max_index = 0;
                bill_min_index = 1;
            } else{
                bill_max_index = 1;
                bill_min_index = 0;
            }
            
            if(bill[bill_min_index]>wallet[wallet_min_index] | bill[bill_max_index]>wallet[wallet_max_index]){
                bill[bill_max_index] = bill[bill_max_index] / 2;
                answer++;
            } else break;
            
        }
        
        return answer;
    }
}