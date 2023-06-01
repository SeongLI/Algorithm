import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
			if (Math.abs(o1) == Math.abs(o2)) { // 같을경우 음수를 우선
				return o1 - o2;
			} else {
				return Math.abs(o1) - Math.abs(o2);
			}
		});

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int temp = sc.nextInt();

			if (temp == 0) {
				if (pq.isEmpty()) {
					System.out.println(0);
				} else {
					System.out.println(pq.poll());
				}
			} else {
				pq.add(temp);
			}

		} // for문 끝

	} // main 끝
}
