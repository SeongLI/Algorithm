import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long A = sc.nextInt(); // 고정비용
		long B = sc.nextInt(); // 가변비용
		long C = sc.nextInt(); // 수입비용

		if (B >= C) {
			System.out.println(-1);
			return;
		} else {
			System.out.println(A / (C - B) + 1);
		}
		
		// 시간초과
//		int N = 0;
//		while (true) {
//			N++;
//			long TC = A + (B * N); // 총 비용
//			long TR = C * N; // 총 수입
//
//			if (TC < TR) {
//				break;
//			}
//		} // while 끝
//
//		System.out.println(N);

	} // main 끝
}
