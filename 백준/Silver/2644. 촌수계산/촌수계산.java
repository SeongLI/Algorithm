import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static int N, X, Y, M;
	public static int[][] map;
	public static boolean[] visited;
	public static int[] cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // 전체 사람 수
		X = sc.nextInt(); // 촌수를 계산해야하는 관계 X,Y
		Y = sc.nextInt();
		M = sc.nextInt(); // 부모 자식간의 관계 계수

		map = new int[N + 1][N + 1];
		visited = new boolean[N + 1];
		for (int i = 0; i < M; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();

			map[start][end] = map[end][start] = 1;
		}

		cnt = new int[N + 1];
		bfs(X);
		if (!visited[Y]) {
			System.out.println(-1);
		} else {
			System.out.println(cnt[Y]);
		}

	}// main 끝

	private static void bfs(int X) {
		Queue<Integer> q = new LinkedList<>();
		q.add(X);

		while (!q.isEmpty()) {
			int temp = q.poll();
			
			if (temp == Y) {
				return;
			}

			for (int i = 1; i <= N; i++) {
				if (map[temp][i] != 0 && !visited[i]) {
					q.add(i);
					cnt[i] = cnt[temp] + 1;
					visited[i] = true;
				}
			}

		}

	} // dfs 끝
}