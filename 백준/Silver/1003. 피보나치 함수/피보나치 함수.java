import java.util.Scanner;

public class Main {
	// 시간 제한 -> 0.25초 (추가 시간 없음) : DP 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int T = sc.nextInt();
		int N = 40;
		int[] dp_zero = new int[N + 1];
		int[] dp_one = new int[N + 1];

		dp_zero[0] = 1;
		dp_zero[1] = 0;
		dp_one[0] = 0;
		dp_one[1] = 1;
		for (int i = 2; i <= N; i++) {
			dp_zero[i] = dp_one[i - 1];
			dp_one[i] = dp_one[i - 2] + dp_one[i - 1];
		}

		for (int i = 0; i < T; i++) {
			int index = sc.nextInt();			
			sb.append(dp_zero[index]).append(" ").append(dp_one[index]).append("\n");
		}
		System.out.println(sb);
	} // main 끝
}
//0 -> 1 0
//1 -> 0 1
//2 -> 0 + 1 ->  1 1
//3 -> 2 + 1 ->  1 2
//4 -> 3 + 2 ->  2 3
//5 -> 4 + 3 ->  3 5