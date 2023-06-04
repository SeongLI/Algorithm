import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static int row, col, hi;
	public static int[] dx = { -1, 1, 0, 0, 0, 0 };
	public static int[] dy = { 0, 0, -1, 1, 0, 0 };
	public static int[] dz = { 0, 0, 0, 0, -1, 1 };
	public static int[][][] map;
	static Queue<int[]> q = new LinkedList<int[]>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		col = sc.nextInt(); // 열
		row = sc.nextInt(); // 행
		hi = sc.nextInt(); // 높이
		map = new int[hi][row][col];

		for (int h = 0; h < hi; h++) {
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					map[h][i][j] = sc.nextInt();
					if (map[h][i][j] == 1) {
						q.add(new int[] { h, i, j });
					}
				}
			}
		}
		System.out.println(bfs());
	} // main 끝

	private static int bfs() {

		while (!q.isEmpty()) {
			int[] t = q.poll();
			int z = t[0];
			int x = t[1];
			int y = t[2];

			for (int i = 0; i < 6; i++) {
				int nz = z + dz[i];
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx < 0 || nx >= row || ny < 0 || ny >= col || nz < 0 || nz >= hi)
					continue;

				if (map[nz][nx][ny] == 0) {
					map[nz][nx][ny] = map[z][x][y] + 1;
					q.add(new int[] { nz, nx, ny });
				}
			}
		}

		int max = Integer.MIN_VALUE;
		if (checkZero()) {
			return -1;
		} else {
			for (int h = 0; h < hi; h++) {
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						if (max < map[h][i][j]) {
							max = map[h][i][j];
						}
					}
				}
			}
			return max - 1;
		}

	} // bfs끝

	private static boolean checkZero() {
		for (int h = 0; h < hi; h++) {
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (map[h][i][j] == 0)
						return true;
				}
			}
		}
		return false;
	} // checkZero 끝

}