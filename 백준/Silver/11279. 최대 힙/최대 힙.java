import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		int N = sc.nextInt();
		for(int i = 0 ; i < N ; i++) {
			int temp = sc.nextInt();
			if(temp == 0) {
				if(pq.isEmpty()) System.out.println(0);
				else {
					System.out.println(pq.poll());
				}
			} else { 
				pq.add(temp);
			}
		}
		
		
	} //main 끝
}
