

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();

		int N = sc.nextInt();

		int temp = 1;
		boolean check = true;
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();

			while (temp <= x) {
				stack.push(temp);
				sb.append("+").append("\n");
				temp++;
			}
			
			if(stack.peek() == x ) {
				stack.pop();
				sb.append("-").append("\n");
			} else {
				check = false;
			}

		} // for문 끝
		
		if(check) System.out.println(sb);
		else System.out.println("NO");

	} // main 끝
}
