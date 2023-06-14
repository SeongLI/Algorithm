import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static int A, B, N, M;
	public static int[] arr;
	public static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		A = sc.nextInt(); // 콩콩이 A 힘
		B = sc.nextInt(); // 콩콩이 B 힘
		N = sc.nextInt(); // 동규 위치
		M = sc.nextInt(); // 주미 위치

		arr = new int[100001];
		visited = new boolean[100001];

		bfs(N, M);
		
		System.out.println(arr[M]);

	} // main 끝

	private static void bfs(int start, int end) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visited[start] = true;

		while (!q.isEmpty()) {
			int temp = q.poll();
			
			// select_1
			if (temp - 1 >= 0 && temp - 1 <= 100000 && !visited[temp - 1]) {
				visited[temp - 1] = true;
				arr[temp - 1] = arr[temp] + 1;
				q.add(temp - 1);
			}
			// select_2
			if (temp + 1 >= 0 && temp + 1 <= 100000 && !visited[temp + 1]) {
				visited[temp + 1] = true;
				arr[temp + 1] = arr[temp] + 1;
				q.add(temp + 1);
			}
			// select_3
			if (temp - A >= 0 && temp - A <= 100000 && !visited[temp - A ]) {
				visited[temp - A] = true;
				arr[temp - A] = arr[temp] + 1;
				q.add(temp - A);
			}
			// select_4
			if (temp + A >= 0 && temp + A <= 100000 && !visited[temp + A ]) {
				visited[temp + A] = true;
				arr[temp + A] = arr[temp] + 1;
				q.add(temp + A);
			}
			// select_5
			if (temp - B >= 0 && temp - B <= 100000 && !visited[temp - B ]) {
				visited[temp - B] = true;
				arr[temp - B] = arr[temp] + 1;
				q.add(temp - B);
			}
			// select_6
			if (temp + B >= 0 && temp + B <= 100000 && !visited[temp + B ]) {
				visited[temp + B] = true;
				arr[temp + B] = arr[temp] + 1;
				q.add(temp + B);
			}
			// select_7
			if (temp * A >= 0 && temp * A <= 100000 && !visited[temp * A ]) {
				visited[temp * A] = true;
				arr[temp * A] = arr[temp] + 1;
				q.add(temp * A);
			}
			// select_8
			if (temp * B >= 0 && temp * B <= 100000 && !visited[temp * B ]) {
				visited[temp * B] = true;
				arr[temp * B] = arr[temp] + 1;
				q.add(temp * B);
			}
			
			// 최소로 딱 닿았을 때 끝!
			if (arr[end] > 0)
				break;
		} // while 끝

	} // bfs 끝
}