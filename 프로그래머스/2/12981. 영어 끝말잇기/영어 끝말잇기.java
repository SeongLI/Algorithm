// 앞문자의 마지막과 뒷문자의 처음을 비교한다. charAt
// 이전에 나왔던 것인지 확인한다. hashmap
import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        // HashSet<String> set = new HashSet<>();
        map.put(words[0], 0);
        // set.add(words[0]);
        int[] result = new int[2];
        int index = 1; // 인덱스
        
        while(index < words.length){
            // 앞
            char front = words[index-1].charAt(words[index-1].length()-1);
            // 뒤(현재 기준)
            char back = words[index].charAt(0);
            // 단어 체크
            // int check = map.getOrDefault(words[index], -1); // 이렇게 안해도 되겠구나 containsKey 활용

            if(map.containsKey(words[index]) || (front != back)){
            // if(set.contains(words[index]) || (front != back)){
                result[0] = index % n + 1; // 번호
                result[1] = index / n + 1; // 차례
                break;
            }
            map.put(words[index], 1);
            // set.add(words[index]);
            index++;
        }
        
        return result;
    }
}