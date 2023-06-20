import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		1 3 6 10 15
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] map = new int[N + 1][N + 1];
		int[][] dp = new int[N + 1][N + 1];

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				map[i][j] = sc.nextInt();
//				System.out.print(map[i][j]+" ");
			}
//			System.out.println();
		} // input끝

//		dp[0][0] = map[0][0];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + map[i][j];
			}
		}

		int ans = 0;
		for (int i = 1; i <= N; i++) {
			ans = Math.max(ans, dp[N][i]);
		}
		System.out.println(ans);

	} // main 끝
}