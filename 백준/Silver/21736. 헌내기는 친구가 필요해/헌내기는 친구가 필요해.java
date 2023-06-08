import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static int row, col;
	public static String[][] map;
	public static boolean[][] visited;
	public static int[] nr = { -1, 0, 1, 0 };
	public static int[] nc = { 0, 1, 0, -1 };
	public static int cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		row = sc.nextInt();
		col = sc.nextInt();
		map = new String[row][col];
		visited = new boolean[row][col];
		int start_R = 0;
		int start_C = 0;
		for (int i = 0; i < row; i++) {
			String str = sc.next();
			String[] str_arr = str.split("");
			for (int j = 0; j < col; j++) {
				map[i][j] = str_arr[j];
				if (map[i][j].equals("I")) {
					start_R = i;
					start_C = j;
				}
			}
		} // input 끝
		
		cnt = 0;
		bfs(start_R, start_C);
		
		if(cnt == 0) {
			System.out.println("TT");
		} else {
			System.out.println(cnt);
		}
		
	}// main 끝

	private static void bfs(int R, int C) {
		Queue<Integer> q_R = new LinkedList<Integer>();
		Queue<Integer> q_C = new LinkedList<Integer>();

		q_R.add(R);
		q_C.add(C);
		visited[R][C] = true;
		
		while (!q_R.isEmpty() && !q_C.isEmpty()) {
			int temp_R = q_R.poll();
			int temp_C = q_C.poll();

			for (int dir = 0; dir < 4; dir++) {
				int dr = temp_R + nr[dir];
				int dc = temp_C + nc[dir];
				
				if(dr<0 || dc <0 || dr >= row || dc>= col || visited[dr][dc]) continue;
				
				// 벽
				if(map[dr][dc].equals("X")) continue; 
				// 사람
				if(map[dr][dc].equals("P")) {
					cnt++;
				};
				
				q_R.add(dr);
				q_C.add(dc);
				visited[dr][dc] = true;
				
			}
		}

	}// bfs 끝
}