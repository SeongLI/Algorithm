import java.util.*;
// 유클리드 호제법
class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int point = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            // 최소공배수
            point = func(point, arr[i]);
        }
    
        return point;
    }

    // 최소공배수
    public static int func(int small, int large){
        return (small * large) / func2(small, large);
    }
    
    // 최대공약수
    public static int func2(int small, int large){
        if(large % small == 0){
            return small;
        }
        return func2(large % small, small);
    }
}

