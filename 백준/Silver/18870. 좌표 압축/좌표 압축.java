import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		int[] arr_sort = new int[N];

		for (int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			arr[i] = temp;
			arr_sort[i] = temp;
		}
		Arrays.sort(arr_sort);
		// input 끝

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int rank = 0; // 중복제거 1
		for (int i = 0; i < N; i++) {
			if (!map.containsKey(arr_sort[i])) { // 중복제거 2
				map.put(arr_sort[i], rank);
				rank++;
			}
		}
//		System.out.println(map);
		
		for(int i = 0 ; i < N ; i++) {
			if(map.containsKey(arr[i])) {
//				System.out.println(map.get(arr[i]));
				sb.append(map.get(arr[i])).append(" ");
			}
		}
		System.out.println(sb);
		
	} // main 끝

}