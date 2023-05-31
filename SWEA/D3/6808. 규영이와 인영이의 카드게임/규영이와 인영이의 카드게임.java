import java.util.Scanner;

public class Solution {

	public static int[] gyu;
	public static int[] joo;
	public static boolean[] visited; // 순열 방문체크
	public static int[] result;
	public static int cnt; // 이긴 횟수

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {

			gyu = new int[9]; // 규영 카드
			joo = new int[9]; // 주영 카드

			boolean[] check = new boolean[18 + 1];
			for (int i = 0; i < 9; i++) {
				gyu[i] = sc.nextInt();
				check[gyu[i]] = true;
			}
			int index = 0;
			for (int i = 1; i <= 18; i++) {
				if (!check[i])
					joo[index++] = i;
			} // input

			result = new int[9];
			visited = new boolean[9];
			cnt = 0;
			permutation(cnt);

			System.out.print("#" + t + " ");
			System.out.println(cnt + " " + (362880 - cnt)); // 9! = 362880

		} // tc 끝
	} // main 끝

	private static void permutation(int index) {
		if (index == 9) {
			// 점수 비교
			int gyu_score = 0;
			int joo_score = 0;

			for (int i = 0; i < 9; i++) {
				if (gyu[i] > result[i])
					gyu_score += gyu[i] + result[i]; // 규영카드(gyu[])와 주영카드(result[]) 비교
				else
					joo_score += gyu[i] + result[i];
			}

			// 규영이가 이기면 cnt++;
			if (gyu_score > joo_score)
				cnt++;
			return;
		}

		// 재귀
		for (int i = 0; i < 9; i++) {
			// 방문하지 않았을 때
			if (!visited[i]) {
				result[index] = joo[i]; // 주영이 카드를 넣고
				visited[i] = true;
				permutation(index + 1);
				visited[i] = false;
			}
		}

	} // 순열 끝
}
