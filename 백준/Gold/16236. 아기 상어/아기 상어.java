import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static int[][] map;
	public static int[][] dist;
	public static int N, st_row, st_col, min_row, min_col, min_dist;
	public static int size, eat, time;
	public static int[] nr = { -1, 0, 1, 0 };
	public static int[] nc = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		map = new int[N][N];
		st_row = 0; // 시작 row
		st_col = 0; // 시작 col
		size = 2; // 물고기 사이즈
		eat = 0; // 먹은 물고기 수
		time = 0; // 총 잡아먹는 시간(답)

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
				if (map[i][j] == 9) {
					st_row = i;
					st_col = j;
					map[i][j] = 0;
				}
			}
		} // input 끝

		while (true) {
			dist = new int[N][N];

			min_row = Integer.MAX_VALUE;
			min_col = Integer.MAX_VALUE;
			min_dist = Integer.MAX_VALUE;

			bfs(st_row, st_col);

			if (!check()) {
				break;
			}
		}
		System.out.println(time);

	} // main 끝

	private static boolean check() {
		if (min_row != Integer.MAX_VALUE && min_col != Integer.MAX_VALUE) {
			eat++;
			map[min_row][min_col] = 0;
			st_row = min_row;
			st_col = min_col;
			time += dist[min_row][min_col];

			if (eat == size) {
				size++; // 자라나라
				eat = 0; // 먹은 양 초기화
			}
			return true;
		}
		return false;

	} // check 끝

	private static void bfs(int st_row, int st_col) {
		Queue<Integer> q_x = new LinkedList<>();
		Queue<Integer> q_y = new LinkedList<>();

		q_x.add(st_row);
		q_y.add(st_col);
		
		while (!q_x.isEmpty()) {
			int temp_row = q_x.poll();
			int temp_col = q_y.poll();

			for (int dir = 0; dir < 4; dir++) {
				int dr = temp_row + nr[dir];
				int dc = temp_col + nc[dir];

				if (dr < 0 || dc < 0 || dr >= N || dc >= N)
					continue;

				if (map[dr][dc] > size || dist[dr][dc] != 0) // 사이즈 & visited
					continue;

				dist[dr][dc] = dist[temp_row][temp_col] + 1;

				if (map[dr][dc] != 0 && map[dr][dc] < size) {
					if (min_dist > dist[dr][dc]) {
						min_dist = dist[dr][dc];
						min_row = dr;
						min_col = dc;
					} else if (min_dist == dist[dr][dc]) {
						if (min_row == dr) {
							min_col = Math.min(min_col, dc);
						} else if (min_row > dr) {
							min_row = dr;
							min_col = dc;
						}
					}
				}
				q_x.add(dr);
				q_y.add(dc);

			} // for 끝

		} // while 끝

	} // bfs 끝

}