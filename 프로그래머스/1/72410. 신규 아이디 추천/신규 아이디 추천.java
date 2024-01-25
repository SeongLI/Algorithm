class Solution {
    public String solution(String new_id) {
        String answer = func_1(new_id);
        return answer;
    }
    
    public static String func_1 (String name){
        // 대문자 -> 소문자
        String new_name = name.toLowerCase();
        System.out.println(new_name);
        return func_2(new_name);
    }
    
    public static String func_2 (String name){
        // 소문자, -, _, . 제외 제거
        String new_name = "";
        for(int i = 0 ; i < name.length() ; i++){
            char ch = name.charAt(i);
            if(ch == '-' || ch == '.' || ch == '_' || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
                new_name += ch;
            }
        }
        return func_3(new_name);
    }
    
    public static String func_3 (String name){
        // 마침표 2개 => 마침표 1개 변환
        String new_name = name;
        StringBuilder sb = new StringBuilder();
        char lastChar = 0;
        for (char c : new_name.toCharArray()) {
            if (c == '.' && lastChar == '.') continue;
            sb.append(c);
            lastChar = c;
        }
        new_name = sb.toString();
        return func_4(new_name);
    }
    
    public static String func_4(String name){
        // 마침표가 처음이나 끝에 위치하면 제거
        String new_name = name;
        if (new_name.startsWith(".")) {
            new_name = new_name.substring(1);
        }
        if (new_name.endsWith(".")) {
            new_name = new_name.substring(0, new_name.length() - 1);
        }
        return func_5(new_name);
    }
    
    public static String func_5 (String name){
        // 빈 문자면 a 추가
        String new_name = name;
        if(name.length() == 0) new_name = "a";
        return func_6(new_name);
    }
    
    public static String func_6 (String name){
        // 길이가 16자 이상이면 자르기
        String new_name = name;
        if(new_name.length() >= 16){
            new_name = new_name.substring(0, 15);
        }
        // 마지막 마침표 제거
        if(new_name.endsWith(".")){
            new_name = new_name.substring(0, new_name.length()-1);
        }
        return func_7(new_name);
    }
    
    public static String func_7 (String name){
        String new_name = name;
        while (new_name.length() < 3) {
            new_name += new_name.charAt(new_name.length() - 1);
        }
        return new_name;
    }
    
}