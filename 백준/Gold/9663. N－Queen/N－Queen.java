import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static int N, ans;
	public static int[] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		
		map = new int[N];

		ans = 0;
		func(0);
		System.out.println(ans);

	} // main 끝

	private static void func(int row) {
		// 기저
		if(row == N) {
			ans++;
			return;
		}
		
		// 재귀
		for(int i = 0 ; i < N ; i++) {
			map[row] = i;
//			System.out.println(Arrays.toString(map));
			if(check(row)) {
				func(row+1);
			}
		}
		
	} // func 끝

	private static boolean check(int col) {
		for(int i = 0 ; i < col; i++) {
			if(map[i] == map[col]) {
				return false;
			} else if(Math.abs(col-i) == Math.abs(map[col]-map[i])) {
				return false;
			}
		}
		return true;
	} // check 끝
}