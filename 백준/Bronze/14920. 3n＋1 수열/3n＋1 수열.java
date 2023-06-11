import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cnt = 1;
		while (N != 1) {
			cnt++;
			if (N % 2 == 0) {
				N = N / 2;
				
			} else {
				N = 3 * N + 1;
			}
		}
		System.out.println(cnt);

	} // main 끝

}