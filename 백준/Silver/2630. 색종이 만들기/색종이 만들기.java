import java.util.Scanner;

public class Main {
	public static int N, W, B;
	public static int[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt(); // 한 변의 길이
		map = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
			}
		} // input 끝

		W = 0;
		B = 0;
		func(0, 0, N);
		
		System.out.println(W);
		System.out.println(B);
	
	} // main 끝

	private static void func(int row, int col, int size) {

		// 기저
		if (check(row, col, size)) {
			if (map[row][col] == 1) { // 파란색
				B++; 
			} else {
				W++;
			}
			return;
		}

		// 재귀
		int size_new = size / 2;

		func(row, col + size_new, size_new); // 1사분면
		func(row, col, size_new);  // 2사분면
		func(row + size_new, col, size_new); // 3사분면 
		func(row + size_new, col + size_new, size_new); // 4사분

	} // func 끝

	private static boolean check(int row, int col, int size) {
		int color = map[row][col];

		for (int i = row; i < row + size; i++) {
			for (int j = col; j < col + size; j++) {
				if (map[i][j] != color) {
					return false;
				}
			}
		}
		return true;

	} // check 끝

}