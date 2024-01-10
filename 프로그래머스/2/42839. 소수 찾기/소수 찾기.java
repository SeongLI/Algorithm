import java.util.*;
class Solution {
    public static char[] paper;
    public static boolean[] visited;
    public static ArrayList<Integer> list;
        
    public int solution(String numbers) {
        paper = new char[numbers.length()];
        visited = new boolean[numbers.length()];
        list = new ArrayList<>();
        
        for(int i = 0 ; i < numbers.length() ; i++){
            paper[i] = numbers.charAt(i);
        }
        
        dfs("", 0);
        
        int size = list.size();
        
        // int test = 0;
        // while(test < size){
        //     System.out.println(list.get(test));
        //     test++;
        // }
        
        return size;
    }
    
    // 백트랙킹
    public static void dfs(String temp, int index){
        
        if(!temp.equals("")){
            int num = Integer.parseInt(temp);

            if(!list.contains(num)){
                if(isPrime(num)) list.add(num);
            }
        }
        
        if(index == paper.length) return; // 기저 조건
        
        for(int i = 0 ; i < paper.length ; i++){
            if(!visited[i]){
                visited[i] = true;
                String add_temp = temp + paper[i];
                dfs(add_temp, index+1);
                visited[i] = false;
            }
        }        
    }
    
    // 소수인지 체크
    public static boolean isPrime(int num){
        if(num == 0 || num == 1) return false;
        
        for(int i = 2 ; i <= Math.sqrt(num) ; i++){
            if(num % i == 0) return false; 
        }
        
        return true;
    }
    
    
}