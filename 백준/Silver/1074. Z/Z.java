import java.util.Scanner;

public class Main {

	public static int N;
	public static int row, col;
	public static int cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt(); // 2^N × 2^N인 2차원 배열
		int size = (int) Math.pow(2, N);

		row = sc.nextInt();
		col = sc.nextInt();
		cnt = 0;
		func(row, col, size);
		System.out.println(cnt);
	} // main 끝

	private static void func(int row, int col, int size) {
		if (size == 1) {
			return;
		}
		int new_size = size / 2;
		// 2사분면
		if (row < new_size && col < new_size) {

			func(row, col, new_size);
		}
		// 1사분면
		else if (row < new_size && col < new_size + new_size) {
			cnt += new_size * new_size;
			func(row, col - new_size, new_size);
		}
		// 3사분면
		else if (row < new_size + new_size && col < new_size) {
			cnt += new_size * new_size * 2;
			func(row - new_size, col, new_size);
		}
		// 4사분면
		else if (row < new_size + new_size && col < new_size + new_size) {
			cnt += new_size * new_size * 3;
			func(row - new_size, col - new_size, new_size);
		}

	} // func 끝

}