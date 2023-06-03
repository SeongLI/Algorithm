import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int cnt = 0;
		int[] arr = new int[1000+1];
		for (int i = 0; i < N; i++) {
			arr[sc.nextInt()]++;
		}
		for (int i = 1 ; i <= 1000; i++) {
			if (arr[i] != 0) {
				for (int j = i; j < i + M; j++) {
					if(j > 1000) break;
					arr[j] = 0;
				}
				cnt++;
			}
		}

		System.out.println(cnt);
	} // main 끝
}