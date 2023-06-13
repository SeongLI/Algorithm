import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] dp = new int[N+1];
		
		for(int i = 1 ; i <= N ; i++) {
			int min = i;
			for(int j =1 ; j*j <=i ; j++) {
				// min값 set
				if(min >dp[i-(j*j)] + 1) {
					min = dp[i-(j*j)] + 1;
				}
			}
			dp[i] = min;
		}
		System.out.println(dp[N]);
	} // main 끝
}


//1 = 1
//2 = 1 + 1
//3 + 1 + 1 + 1
//
//4 = 2
//5 = 2 + 1
//6 = 2 + 1 + 1
//7 = 2 + 1 + 1 + 1
//8 = 2 + 2
//
//9 = 3
//10 = 3 + 1
//11 = 3 + 1 + 1
//12 = 3 + 1 + 1 + 1
//13 = 3 + 2
//14 = 3 + 2 + 1
//15 = 3 + 2 + 1 + 1
//
//16 = 4
//17 = 4 + 1