import java.util.*;

class Solution {
    public String solution(String s) {
        // 문자열을 문자의 리스트로 변환
        List<Character> characters = new ArrayList<>();
        for (char c : s.toCharArray()) {
            characters.add(c);
        }

        // 문자열 전체를 역순으로 정렬
        Collections.sort(characters, Collections.reverseOrder());

        // 정렬된 문자들을 이어붙여 문자열 생성
        StringBuilder sb = new StringBuilder();
        for (Character c : characters) {
            sb.append(c);
        }

        return sb.toString();
    }
}
