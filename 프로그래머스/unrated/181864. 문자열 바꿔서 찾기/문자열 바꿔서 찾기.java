class Solution {
    public int solution(String myString, String pat) {

        String x = myString.replaceAll("A", "C");
        x = x.replaceAll("B", "D");
        
        String y = pat.replaceAll("A", "D");
        y = y.replaceAll("B", "C");
        
        System.out.println(x);
        System.out.println(y);
        
        return x.contains(y) ? 1 : 0 ;        
    }
}