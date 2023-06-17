import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	private static final int LinkedList = 0;
	public static int[][] map;
	public static boolean[][] visited;
	public static int[] nr = { -1, 0, 1, 0 };
	public static int[] nc = { 0, 1, 0, -1 };
	public static int row, col;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		row = sc.nextInt();
		col = sc.nextInt();
		map = new int[row][col];
		visited = new boolean[row][col];

		int st_row = 0;
		int st_col = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				map[i][j] = sc.nextInt();

				if (map[i][j] == 2) {
					st_row = i;
					st_col = j;
				}
			}
		} // input 끝

		bfs(st_row, st_col);

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (map[i][j] == 1 && !visited[i][j]) {
					sb.append(-1).append(" ");
//					System.out.print(-1 + " ");
				} else {
					sb.append(map[i][j]).append(" ");
//					System.out.print(map[i][j] + " ");
				}
			}
//			System.out.println();
			sb.append("\n");
		}
		System.out.println(sb);

	} // main 끝

	private static void bfs(int st_row, int st_col) {
		Queue<Integer> q_row = new LinkedList<>();
		Queue<Integer> q_col = new LinkedList<>();

		q_row.add(st_row);
		q_col.add(st_col);
		visited[st_row][st_col] = true;
		map[st_row][st_col] = 0;

		while (!q_row.isEmpty()) {
			int temp_row = q_row.poll();
			int temp_col = q_col.poll();

			for (int dir = 0; dir < 4; dir++) {
				int dr = temp_row + nr[dir];
				int dc = temp_col + nc[dir];

				if (dr < 0 || dc < 0 || dr >= row || dc >= col)
					continue;

				if (visited[dr][dc] || map[dr][dc] == 0)
					continue;

				map[dr][dc] = map[temp_row][temp_col] + 1;
				visited[dr][dc] = true;
				q_row.add(dr);
				q_col.add(dc);
			}

		}

	} // bfs 끝

}