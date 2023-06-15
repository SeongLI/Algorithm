import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static int[] arr;
	public static int x;
	public static int y;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {

			arr = new int[10000 + 2];
			arr[1] = 1;
			for (int i = 1; i <= 10000; i++) {
				arr[i + 1] = arr[i] + i;
			}

			x = 0;
			y = 0;
			func(sc.nextInt());
			int p_x = x;
			int p_y = y;

			x = 0;
			y = 0;
			func(sc.nextInt());
			int q_x = x;
			int q_y = y;

//		System.out.println(p_x + " " + p_y);
//		System.out.println(q_x + " " + q_y);
			int ans_x = p_x + q_x;
			int ans_y = p_y + q_y;
			int ans = arr[ans_x + ans_y - 1] + ans_x - 1;

			System.out.println("#" + t + " "+ ans);
		}

	} // main 끝

	public static void func(int num) {
		for (int i = 1; i <= 10000; i++) {
			if (arr[i + 1] > num) {
				int temp = arr[i];
				x = 1;
				y = i;
				while (temp != num) {
					temp++;
					x++;
					y--;

				}
				break;
			}
		}
	} // func 끝
}