import java.util.Scanner;

public class Main {

	public static int N, M;
	public static int[][] map_1, map_2;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt(); // 행
		M = sc.nextInt(); // 열

		map_1 = new int[N][M];
		map_2 = new int[N][M];

		for (int i = 0; i < N; i++) {
			String str = sc.next();
			String[] str_arr = str.split("");
			for (int j = 0; j < M; j++) {
				map_1[i][j] = Integer.parseInt(str_arr[j]);
			}
		} // map_1 Input

		for (int i = 0; i < N; i++) {
			String str = sc.next();
			String[] str_arr = str.split("");
			for (int j = 0; j < M; j++) {
				map_2[i][j] = Integer.parseInt(str_arr[j]);
			}
		} // map_2 Input

		// input 끝

		int cnt = 0;
		for (int i = 0; i < N - 2; i++) {
			for (int j = 0; j < M - 2; j++) {
//				if (!check(i, j)) {
//				=> 이렇게 해버리면 map_1[i][j]과 map_2[i][j]가 같은데 바뀌고 넘어가 버릴 수 있다!!
				if (map_1[i][j] != map_2[i][j]) {
					change(i, j);
					cnt++;
				}
			}
		}

		// 바꿀 수 없을 때 -1 출력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map_1[i][j] != map_2[i][j]) {
					System.out.println(-1);
					return;
				}
			}
		}

		System.out.println(cnt);

	} // main 끝

//	public static boolean check(int row, int col) {
//		// 3x3 행렬이 같은지 체크
//		for (int i = row; i < row + 3; i++) {
//			for (int j = col; j < col + 3; j++) {
//				if (map_1[i][j] != map_2[i][j])
//					return false;
//			}
//		}
//		return true;
//
//	} // check 끝

	public static void change(int row, int col) {
		// 1->0, 0->1
		for (int i = row; i < row + 3; i++) {
			for (int j = col; j < col + 3; j++) {
				if (map_1[i][j] == 1)
					map_1[i][j] = 0;
				else
					map_1[i][j] = 1;
			}
		}
	} // change 끝

}