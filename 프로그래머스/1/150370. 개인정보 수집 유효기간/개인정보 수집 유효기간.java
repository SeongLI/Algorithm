// terms : 약관 종류와 기간(달)
import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0 ; i < terms.length ; i++){
            String key = terms[i].split(" ")[0];
            String temp_value = terms[i].split(" ")[1];
            int value = Integer.parseInt(temp_value);
            
            map.put(key, value);
        }
        
        // String[] today_arr = today.split("."); => 이렇게 하면 안돼!!!!
        String[] today_arr = today.split("\\.");
        int today_year = Integer.parseInt(today_arr[0]);
        int today_month = Integer.parseInt(today_arr[1]);
        int today_day = Integer.parseInt(today_arr[2]);
        
        ArrayList<Integer> list = new ArrayList<>(); // 정답 넣을 배열 
        for(int i = 0 ; i < privacies.length ; i++){
            String temp_str = privacies[i].split(" ")[0];
            String[] pri_arr = temp_str.split("\\."); // 수집 날짜 (년 월 일)
            int year = Integer.parseInt(pri_arr[0]);
            int month = Integer.parseInt(pri_arr[1]);
            int day = Integer.parseInt(pri_arr[2]);
            
            String temp_key = privacies[i].split(" ")[1];
            int temp_value = map.get(temp_key); // 수집 유형의 유효기간
            
            int new_year = year + (month + temp_value) / 12 ;
            int new_month = (month + temp_value) % 12 ;
            int new_day = day - 1;
            if(new_day == 0){
                new_day = 28;
                new_month --;
            }
                
            if(new_month == 0){
                new_year--;
                new_month = 12;
            }
//             System.out.println("뭐임 이거 new_day   " + new_day);
//             System.out.println("뭐임 이거 day  " + day);
            
//             System.out.println(i +"번째 today" + today_year + " " + today_month + " " + today_day);
//             System.out.println(i +"번째 new" + new_year + " " + new_month + " " + new_day);
            
            if(today_year > new_year){
                list.add(i+1);
            }else if((today_year == new_year) && today_month > new_month){
                list.add(i+1);
            }else if((today_year == new_year) && (today_month == new_month) && today_day > new_day ){
                list.add(i+1);
            }else continue;
        }
        
        int size = list.size();
        int[] ans = new int[size];
        for(int i = 0 ; i < size ; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}