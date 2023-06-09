import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static int N, M, start, end;
	public static int[] arr;
	public static int[] arr_sum;
	public static StringBuilder sb;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sb = new StringBuilder();

		N = sc.nextInt(); // 개수
		M = sc.nextInt(); // 횟수
		arr = new int[N + 1];
		arr_sum = new int[N + 1];

		int sum = 0;
		for (int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt();		
			sum += arr[i];
			arr_sum[i] = sum;
		}
		
		for (int i = 0; i < M; i++) {
			start = sc.nextInt();
			end = sc.nextInt();
			func(start, end);
		}

		System.out.println(sb);

	} // main 끝

	private static void func(int start, int end) {
//		시간초과
//		int sum = 0;
//		for(int i = start ; i <= end ; i++) {
//			sum += arr[i];			
//		}
		int sum = arr_sum[end] - arr_sum[start-1];
		sb.append(sum).append("\n");

	} // func 끝

}