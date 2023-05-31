import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			String round = sc.next();
					
			int N = sc.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				String str = sc.next();

				switch (str) {
				case "ZRO":
					arr[i] = 0;
					break;
				case "ONE":
					arr[i] = 1;
					break;
				case "TWO":
					arr[i] = 2;
					break;
				case "THR":
					arr[i] = 3;
					break;
				case "FOR":
					arr[i] = 4;
					break;
				case "FIV":
					arr[i] = 5;
					break;
				case "SIX":
					arr[i] = 6;
					break;
				case "SVN":
					arr[i] = 7;
					break;
				case "EGT":
					arr[i] = 8;
					break;
				case "NIN":
					arr[i] = 9;
					break;
				}
			} // input

			Arrays.sort(arr);

			System.out.println("#" + t + " ");
			for (int i = 0; i < N; i++) {

				switch (arr[i]) {
				case 0:
					System.out.print("ZRO" + " ");
					break;
				case 1:
					System.out.print("ONE" + " ");
					break;
				case 2:
					System.out.print("TWO" + " ");
					break;
				case 3:
					System.out.print("THR" + " ");
					break;
				case 4:
					System.out.print("FOR" + " ");
					break;
				case 5:
					System.out.print("FIV" + " ");
					break;
				case 6:
					System.out.print("SIX" + " ");
					break;
				case 7:
					System.out.print("SVN" + " ");
					break;
				case 8:
					System.out.print("EGT" + " ");
					break;
				case 9:
					System.out.print("NIN" + " ");
					break;
				}
			} // output
			System.out.println();

		} // tc 끝

	} // main 끝
}
