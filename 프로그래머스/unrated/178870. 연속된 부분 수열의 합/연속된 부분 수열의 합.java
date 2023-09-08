class Solution {
    public int[] solution(int[] sequence, int k) {
        
        // 정답을 담을 배열
        int[] result = new int[2];
        int result_len = 987654321;
        // sequence 배열의 길이
        int sequence_len = sequence.length;
        int LP = 0;
        int RP = 0;
        int sum = sequence[0];
        
        // 투포인터 쓸거야
        while(true){
                if(LP == sequence_len){
                    return result;
                }
                
                // 연속 원소의 합을 sum에 넣고 k랑 비교할거야
                // int sum = 0;
                // for(int x = LP ; x <= RP ; x++){
                //     sum += sequence[x];
                // }
            
                // sum이 같으면 길이가 가장 짧은 인덱스 저장
                if(sum == k){
                    if(RP-LP < result_len){
                        result_len = RP-LP;
                        result[0] = LP;
                        result[1] = RP;
                    }
                    sum -= sequence[LP];
                    LP++;
                    continue;
                }
            
                // sum < k : RP++
                if(sum < k){
                    if(RP < sequence_len-1){
                        RP++;
                        sum += sequence[RP];
                        continue;
                    }else{
                        return result;
                    }
                } 
            
               // sum > k : LP++
               if(sum > k){
                    if(LP == RP){
                        if(RP < sequence_len-1){
                            RP++;
                            sum += sequence[RP];
                            continue;
                        } else{
                            return result;
                        }
                    } else{
                        sum -= sequence[LP];
                        LP++;
                        continue;
                    }
                }
            }
        
    }
}