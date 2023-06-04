import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		int M = sc.nextInt();

		Map<String, Integer> map_1 = new HashMap<>();
		for (int i = 1; i <= N; i++) {
			String str = sc.next();
			map_1.put(str, 1);
		}
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		
		int cnt = 0;
		for (int i = 1; i <= M; i++) {
			String str = sc.next();
			if (map_1.containsKey(str)) {
				cnt++;
				pq.add(str);
			}
		}
		
		sb.append(cnt).append("\n");
		for(int i = 0 ; i< cnt ; i++) {
			sb.append(pq.poll()).append("\n");
		}
		
		System.out.println(sb);

	} // main 끝
}