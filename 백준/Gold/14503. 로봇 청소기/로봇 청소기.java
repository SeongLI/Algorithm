import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 맵의 행 개수
		int M = sc.nextInt(); // 맵의 열 개수

		int row = sc.nextInt(); // 행 위치
		int col = sc.nextInt(); // 열 위치
//		System.out.println(row);
//		System.out.println(col);
		int dir = sc.nextInt(); // 방향
		int[] nr = { -1, 0, 1, 0 };
		int[] nc = { 0, 1, 0, -1 };

		int[][] map = new int[N][M];
		boolean[][] visited = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		// input 끝

		// 시작지점 청소
		int cnt = 1;
		visited[row][col] = true;

		loop: while (true) {

			// 현재 4칸 중 청소되지 않은 빈 칸이 있는지 체크
			boolean check = false;
			for (int i = 0; i < 4; i++) {
				int dr = row + nr[i];
				int dc = col + nc[i];

				if (map[dr][dc] == 1 || visited[dr][dc])
					continue;

				if (map[dr][dc] == 0) {
					check = true;
					break;
				}
			}

			if (check) { // 청소되지 않는 빈칸이 있는 경우
				dir = (dir + 3) % 4;
				for (int i = 0; i < 4; i++) {
					
					int dr = row + nr[dir];
					int dc = col + nc[dir];

					if (map[dr][dc] == 1 || visited[dr][dc]) {
						dir = (dir + 3) % 4; // 반시계 90도
						continue ;
					}

					if (map[dr][dc] == 0) {
						cnt++;
						visited[dr][dc] = true;
						row = dr;
						col = dc;
//						System.out.println("dir :" + dir);
						continue loop;
					}
				}

			} else if (!check) {

				switch (dir) {
				case 0:
					row++;
					if (map[row][col] == 1) {
						break loop;
					}
					continue loop;
				
				case 1:
					col--;
					if (map[row][col] == 1) {
						break loop;
					}
					continue loop;
				case 2:
					row--;
					if (map[row][col] == 1) {
						break loop;
					}
					continue loop;
				case 3:
					col++;
					if (map[row][col] == 1) {
						break loop;
					}
					else continue loop;
				}

			}
		} // while문 끝

		System.out.println(cnt);
	} // main 끝

}