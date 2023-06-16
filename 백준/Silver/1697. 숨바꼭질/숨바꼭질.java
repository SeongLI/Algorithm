import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static int N, K;
	public static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt(); // 수빈 위치
		K = sc.nextInt(); // 동생 위치
		arr = new int[100001];

		bfs(N);
		System.out.println(arr[K]);
		
	} // main 끝

	private static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);

		while (!q.isEmpty()) {
			int temp = q.poll();

			if (temp == K) {
				return;
			}
			// 뒤 -1
			if (temp <= 100000 && temp >= 1) {
				if (arr[temp - 1] == 0) {
					arr[temp - 1] = arr[temp] + 1;
					q.add(temp - 1);
				}
			}
			// 앞 +1
			if (temp <= 99999 && temp >= 0) {
				if (arr[temp + 1] == 0) {
					arr[temp + 1] = arr[temp] + 1;
					q.add(temp + 1);
				}
			}
			// 점프 *2
			if (2 * temp <= 100000 && 2 * temp >= 0) {
				if (arr[2 * temp] == 0) {
					arr[2 * temp] = arr[temp] + 1;
					q.add(2 * temp);
				}
			}

		} // while 끝

	} // bfs 끝

}