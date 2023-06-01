import java.util.Scanner;

// 스택 구현
// System.out.println() : 시간초과
public class Main {
	public static int[] arr = new int[10000];
	public static int head = -1; // 머리
	public static int tail = -1; // 꼬리
	public static StringBuilder sb;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sb = new StringBuilder();
		
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String str = sc.next();

			switch (str) {
			case "push":
				int num = sc.nextInt();
				push(num);
				break;
			case "pop":
				pop();
				break;
			case "size":
				size();
				break;
			case "empty":
				empty();
				break;
			case "top":
				top();
				break;
			} // switch문 끝
		} // for문 끝
		
		System.out.println(sb);

	} // main 끝

	public static void push(int num) {
		tail++;
		arr[tail] = num;
	} // push 끝

	public static void pop() {
		// 비어있는 상태인지 확인
		if (head == tail) {
			sb.append(-1).append("\n");
		} else {
			sb.append(arr[tail]).append("\n");
			tail--;
		}
	} // pop 끝

	public static void size() {
		sb.append(tail + 1).append("\n");
	} // size 끝

	public static void empty() {
		if (head == tail) {
			sb.append(1).append("\n");
		} else {
			sb.append(0).append("\n");
		}
	} // empty 끝

	public static void top() {
		// 비어있는 상태인지 확인
		if (tail == -1) {
			sb.append(-1).append("\n");
		} else {
			sb.append(arr[tail]).append("\n");
		}

	} // top 끝

}