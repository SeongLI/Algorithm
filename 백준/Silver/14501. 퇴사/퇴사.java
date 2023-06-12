import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] time = new int[N];
		int[] point = new int[N];
		int[] dp = new int[N + 1];

		for (int i = 0; i < N; i++) {
			time[i] = sc.nextInt();
			point[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			// 날짜 초과 범위 설정
			if (time[i] + i <= N) {
				// 현재 날짜 + 상담 끝 수입 vs 이전까지 최대 수입 + 오늘 수입
				dp[time[i] + i] = Math.max(dp[i + time[i]], dp[i] + point[i]);
			}
			// 이전값이 누적되야 한다
			dp[i + 1] = Math.max(dp[i + 1], dp[i]);
		}
		System.out.println(dp[N]);

	} // main 끝
}