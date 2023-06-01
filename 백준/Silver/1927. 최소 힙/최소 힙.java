import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
//		PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2)->{
//			return o1-o2;
//		});	
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		for(int i = 0 ; i < N ; i++) {
			int temp = sc.nextInt();
			if(temp == 0 ) {
				if(pq.isEmpty()) {
					System.out.println(0);
				} else {
					System.out.println(pq.poll());
				}
			} else {
				pq.add(temp);
			}
		} // for 끝
		
		
	} // main 끝
}