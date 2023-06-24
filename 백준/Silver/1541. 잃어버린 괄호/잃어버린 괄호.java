import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		String[] str_arr = str.split("-"); // -을 기준으로 나누자

//		System.out.println(Arrays.toString(str_arr));

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < str_arr.length; i++) {
			int temp = 0;
			String[] add_arr = str_arr[i].split("\\+");
			// 정규 표현식을 사용하여 문자열을 분할할 때, + 문자는 정규 표현식에서 특별한 의미를 가지고 있다.
			// split("\\+")는 + 문자를 기준으로 문자열을 나누기 위해 사용되는 코드.
			// 첫 번째 역슬래시 \는 두 번째 역슬래시 \를 이스케이프하기 위해 사용.
//			System.out.println(Arrays.toString(add_arr));
			
			
			for (int j = 0; j < add_arr.length; j++) {
				temp += Integer.parseInt(add_arr[j]);
			}
			
			if(ans == Integer.MAX_VALUE) {
			ans = temp;
			}else {
			ans -= temp;
			}
		}
		System.out.println(ans);

	}
}