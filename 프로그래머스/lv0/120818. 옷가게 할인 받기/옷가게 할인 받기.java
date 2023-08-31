class Solution {
    public int solution(int price) {           
        
        double x = discount(price);
        return (int) x;
        
        
    }
    
    public static double discount(int money){
        if(money >= 500000){
            return money * 0.8;
        } else if( money >= 300000){
            return money * 0.9;
        } else if( money >= 100000){
            return money * 0.95;
        } else {
            return money;
        }
    }
}