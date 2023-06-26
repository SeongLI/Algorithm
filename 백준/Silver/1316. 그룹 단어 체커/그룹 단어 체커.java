import java.util.*;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			String str=  sc.next();
			boolean check[] = new boolean[26]; 
			boolean tmp = true; 
			
			for (int j = 0; j < str.length(); j++) {
				int index = str.charAt(j)-'a';
				if(check[index]) { // 이전에 사용한적이 있는 문자라면
					if(str.charAt(j) != str.charAt(j-1)) { // 이전 문자와 연속되지 않는다면
						tmp = false; // 그룹 단어가 x
						break;
					}
				}else { // 이전에 사용한적이 없는 문자
					check[index] = true; // 문자 사용 체크
				}
			}
			if(tmp) cnt++;
		}
		
		System.out.println(cnt);
	}
}