
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		

//		int N = sc.nextInt(); // 행
//		int M = sc.nextInt(); // 열
//		int B = sc.nextInt(); // 시작 인벤토리 블록 개수
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[N][M];

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
//				map[i][j] = sc.nextInt();
//				if (min > map[i][j])
//					min = map[i][j];
//				if (max < map[i][j])
//					max = map[i][j];
				min = Math.min(min, map[i][j]);
				max = Math.max(max, map[i][j]);
			}
		} // input

		// 1. 인벤토리에 넣는다 => 2초
		// 2. 인벤토리에서 꺼내서 블록을 쌓는다 => 1초

		int ans_time = Integer.MAX_VALUE;
		int ans_base = 0;

		// 답이 여러개 -> 높이가 높은 것
		for (int base = max; base >= min; base--) {
			int time = 0; // 땅을 고르는 시간
			int block = B; // 인벤토리 블록

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					int diff = map[i][j] - base;
					// 원하는 층보다 높을 때
					if (diff > 0) {
						block += diff;
						time += 2 * diff;
					}
					// 원하는 층보다 늦으면
					else if (diff <0) {
						block -= (-diff);
						time += (-diff);
					}

				}

			}
			if (block >= 0 && ans_time > time) {
				ans_base = base;
				ans_time = time;
			}

		}
		System.out.print(ans_time + " " + ans_base);

	} // main 끝

}
