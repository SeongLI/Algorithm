import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static int[] arr = new int[21];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int TC = sc.nextInt(); 
		for(int i = 0 ; i < TC ; i++) {
			String str = sc.next();
			switch (str) {
			case "add":
				int a = sc.nextInt();
				add(a);
				break;
			case "remove":
				int b = sc.nextInt();
				remove(b);
				break;
			case "check":
				int c = sc.nextInt();
				sb.append(check(c)).append("\n");
				break;
			case "toggle":
				int d = sc.nextInt();
				toggle(d);
				break;
			case "all":
				all();
				break;
			case "empty":
				empty();
				break;
			}
		} // TC 끝
		System.out.println(sb);
	} // main 끝

	private static void empty() {
		Arrays.fill(arr, 0);	
	}

	private static void all() {
		Arrays.fill(arr, 1);
	}

	private static void toggle(int x) {
		if(arr[x] == 1) arr[x] = 0;
		else arr[x] = 1;
	}

	private static int check(int x) {
		// S에 x가 있으면 1, 없으면 0 출력
		if(arr[x] == 1) return 1;
		else return 0;
	}

	private static void remove(int x) {
		if(check(x) == 0) return;
		else arr[x] = 0;
	}
	
	private static void add(int x) {
		// S에 x를 추가한다.
		// x가 이미 있는 경우에는 연산 무시한다.
		if(check(x) == 1) return;
		else arr[x] = 1;
		
	}

}