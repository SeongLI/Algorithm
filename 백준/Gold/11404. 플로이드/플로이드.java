import java.util.Scanner;

public class Main {

	public static int N; // 도시의 수 (정점)
	public static int M; // 버스의 개수
	public static int[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		map = new int[N + 1][N + 1];

		final int INF = 987654321;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				map[i][j] = INF;
				if (i == j)
					map[i][j] = 0;
			}
		}

		for (int i = 0; i < M; i++) {
			int A = sc.nextInt(); // 시작
			int B = sc.nextInt(); // 도착
			int C = sc.nextInt(); // 비용

			// A,B가 똑같은데 C가 다른 경우가 있네
			map[A][B] = Math.min(map[A][B], C);

		}

		// 플로이드-워셜 문제
		for (int k = 1; k <= N; k++) {
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if (map[i][j] > map[i][k] + map[k][j]) {
						map[i][j] = map[i][k] + map[k][j];
					}
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (map[i][j] == INF) {
					sb.append(0 + " ");
				} else
					sb.append(map[i][j] + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	} // main 끝
}