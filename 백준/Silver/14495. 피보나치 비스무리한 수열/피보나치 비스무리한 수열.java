import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] dp = new long[116+1];
		
		dp[1] = dp[2] = dp[3] = 1;
		
		for(int i = 4; i <= 116 ; i++) {
			dp[i] = dp[i-3] + dp[i-1];
		}
		
		int N = sc.nextInt();

		System.out.println(dp[N]);
		
	}
	
}