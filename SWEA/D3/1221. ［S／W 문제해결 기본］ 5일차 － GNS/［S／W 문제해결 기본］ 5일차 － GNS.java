import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			String round = sc.next(); // 필요 없음
			int N = sc.nextInt(); // 원소 개수
			String[] str = new String[N];
			String[] arr = { "ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN" };

			for (int i = 0; i < N; i++) {
				str[i] = sc.next();
			} // input

			System.out.println("#" + t);
			for (int i = 0; i < 10; i++) { // arr 배열과
				for (int j = 0; j < N; j++) { // str 배열 비교
					if (arr[i].equals(str[j])) {
						System.out.print(arr[i] + " ");
					}
				}
			}
			System.out.println();

		} // tc 끝

	} // main 끝
}