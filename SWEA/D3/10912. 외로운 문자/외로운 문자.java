import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // 테스트케이스
		for (int t = 1; t <= T; t++) {
			String str = sc.next();
			String[] str_arr = str.split("");

			LinkedList<String> list = new LinkedList<>();
			for (int i = 0; i < str_arr.length; i++) {
				String temp = str_arr[i];
				if (list.isEmpty() || !list.contains(temp)) {
					list.add(temp);
				} else if (list.contains(temp)) {
					list.remove(temp);
				}
//			System.out.println(list); // 디버깅
			}
//		System.out.println(list); // 디버깅
			
			Collections.sort(list);
			
			System.out.print("#" + t + " ");
			if (list.isEmpty())
				System.out.println("Good");
			else {
				while (true) {
					System.out.print(list.poll());
					if (list.isEmpty())
						break;
				}
				System.out.println();
			}

		} // tc 끝

	} // main 끝
}
