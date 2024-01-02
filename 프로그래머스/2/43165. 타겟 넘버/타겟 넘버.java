class Solution {
    public static int count = 0;
    
    public int solution(int[] numbers, int target) {
        func(numbers, 0 , 0, target);
        return count ;
    }
    
    public static void func(int[] numbers, int index, int sum, int target){
        
            if(index == numbers.length && sum == target) count++;
            if(index == numbers.length)  return;
        
            // if(index == numbers.length){
            //     if(target == sum) count++;
            //     return;
            // }
        
            func(numbers, index + 1, sum + numbers[index], target);
            func(numbers, index + 1, sum - numbers[index], target);
    }
}