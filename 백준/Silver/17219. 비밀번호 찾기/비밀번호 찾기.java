import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String, String> hash = new HashMap<>(); // key & value 구분
		for(int i = 0 ; i < N ; i++) {
			st = new StringTokenizer(br.readLine());
			String Adress = st.nextToken();
			String Pass = st.nextToken();
			hash.put(Adress, Pass);
		}
		
		// key에 따른 value 가져오기
		for(int i = 0 ; i < M ; i++) {
			String target = br.readLine();
			sb.append(hash.get(target)).append("\n");
		}
		
		System.out.println(sb);
		
		
		
		
	} // main 끝
}