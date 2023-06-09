import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		1 2 4 7 13 24 44 앞에 3개 합이다

		int[] dp = new int[10 + 1];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for (int i = 4; i <= 10; i++) {
			dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
		}

		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			System.out.println(dp[N]);
		}
	} // main 끝
}