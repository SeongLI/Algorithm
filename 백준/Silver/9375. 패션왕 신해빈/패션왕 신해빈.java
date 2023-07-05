import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			Map<String, Integer> map = new HashMap<>();
			for (int i = 0; i < N; i++) {
				String str = sc.next();
				String type = sc.next();
				// getOrDefault : map에 key 값이 존재한다면 해당 value를 반환하고, 없다면 설정한 defaultValue를 반환
				map.put(type, map.getOrDefault(type, 0) + 1);
			}
			int ans  = 1;
			for(int cnt : map.values()) {
				ans *= cnt + 1;
			}
			System.out.println(ans - 1); // 알몸인 경우 제외
		}

	} // main 끝
}