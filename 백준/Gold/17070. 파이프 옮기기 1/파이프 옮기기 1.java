import java.util.Scanner;

public class Main {
	public static int N, COUNT;
	public static int[][] map;
	public static int[][] cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		map = new int[N][N];
		cnt = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
			}
		} // input 끝

		// 1: 가로 => 오른쪽 / 대각선
		// 2: 세로 => 아래 / 대각선
		// 3: 대각선 => 오른쪽 / 아래 / 대각선
		dfs(0, 1, 1); // 0행 1열(가로) start

		// 디버깅
//		for(int i = 0 ; i< N ; i++) {
//			for(int j = 0 ; j< N ; j++) {
//				System.out.print(cnt[i][j]+" ");
//			}
//			System.out.println();
//		}

		System.out.println(cnt[N - 1][N - 1]);
//		System.out.println(COUNT);
	} // main 끝

	private static void dfs(int row, int col, int direction) {
		// 기저
		if (row >= N || col >= N || map[row][col] == 1)
			return;
//		if (row == N - 1 && col == N - 1) {
//			COUNT++;
//		}


		// 재귀
		if (direction == 1) {
			dfs(row, col + 1, 1);
			dfs(row + 1, col + 1, 3);
		} else if (direction == 2) {
			dfs(row + 1, col, 2);
			dfs(row + 1, col + 1, 3);
		} else {
			if (map[row - 1][col] == 1 || map[row][col - 1] == 1)
				return;
			dfs(row, col + 1, 1);
			dfs(row + 1, col, 2);
			dfs(row + 1, col + 1, 3);
		}
		
		cnt[row][col] ++;

	} // dfs 끝

}