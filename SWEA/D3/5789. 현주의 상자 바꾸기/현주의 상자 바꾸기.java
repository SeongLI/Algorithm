import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // 테스트케이스
		for (int t = 1; t <= T; t++) {

			int N = sc.nextInt(); // 상자의 개수
			int[] arr = new int[N + 1]; // 처음엔 모두 0으로

			int Q = sc.nextInt(); // 바꿀 횟수
			for (int i = 1; i <= Q; i++) {
				int L = sc.nextInt(); // 시작
				int R = sc.nextInt(); // 끝
				for (int j = L; j <= R; j++) {
					arr[j] = i;
				}
			} // 횟수 끝

			StringBuilder sb = new StringBuilder();
			for(int i = 1 ; i <= N ; i++) {
				sb.append(arr[i]).append(" ");
			}
			
			System.out.print("#" + t + " ");
			System.out.println(sb);
		} // tc 끝

	} // main 끝
}