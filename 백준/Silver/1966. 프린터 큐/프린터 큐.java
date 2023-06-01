import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			Queue<int[]> q = new LinkedList<>(); // 배열 큐
			int N = sc.nextInt();
			int M = sc.nextInt();

			for (int i = 0; i < N; i++) {
				int temp = sc.nextInt();
				q.add(new int[] { i, temp });
			}

			int cnt = 0;
			while (true) {
				int check[] = q.poll();
				boolean flag = true;

				for (int c[] : q) {
					if (c[1] > check[1]) {
						flag = false;
						break;
					}
				}

				if (flag) {
					cnt++;
					if (check[0] == M)
						break;
				} else {
					q.add(check);
				}
			} // while문 끝
			System.out.println(cnt);
		}
	}
}
