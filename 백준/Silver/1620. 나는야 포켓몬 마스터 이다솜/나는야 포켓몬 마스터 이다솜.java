import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, String> map_int = new HashMap<>();
		HashMap<String, Integer> map_str = new HashMap<>();
		
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st  = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= N ; i++) {
			int index = i;
			String str = br.readLine();
			map_int.put(index, str);
			map_str.put(str, index);
		} // input
		
		for(int i = 0 ; i< M ; i++) {
			
			String temp = br.readLine();	
			if(temp.charAt(0) < 65) {
//				System.out.println("숫자");
				sb.append(map_int.get(Integer.parseInt(temp))).append("\n");
			} else {
//				System.out.println("문자");
				sb.append(map_str.get(temp)).append("\n");
			}
		} // for문 끝
		System.out.println(sb);
		
	} // main 끝
}