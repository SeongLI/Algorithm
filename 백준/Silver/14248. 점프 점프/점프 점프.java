import java.util.*;

public class Main {
	public static int n, s, cnt;
	public static int[] arr;
	public static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt(); // 돌다리의 돌 개수
		arr = new int[n+1];
		for(int i = 1 ; i <= n ; i++) {
			arr[i] = sc.nextInt();
		}
		s = sc.nextInt();
		// input 끝
		
		visited = new boolean[n+1];
		cnt = 1;
		bfs(s);
		System.out.println(cnt);
	} // main 끝

	private static void bfs(int s) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(s);
		visited[s] = true;
		
		while(!q.isEmpty()) {
			int temp = q.poll();
			int left = temp - arr[temp];
			int right = temp + arr[temp];
			
			if(left > 0 && !visited[left]) {
				q.add(left);
				visited[left] = true;
				cnt++;
			}
			if(right <= n && !visited[right]) {
				q.add(right);
				visited[right] = true;
				cnt++;
			}
		}
		
	} // bfs 끝

}