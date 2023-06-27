import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(func(A,B));
		
	} // main 끝
	
	public static long func(int x, int y) {
		return (x+y) * (x-y);
	} // func 끝
}