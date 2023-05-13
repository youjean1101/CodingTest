package coding_All_step;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Que_15 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		/*
		 1. 단어 S와 정수 i가 주어졌을 때,S의 i번째 글자를 출력하는 프로그램을 작성하시오.
		 - (입력)첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S가 주어진다. 
		 		단어의 길이는 최대 1,000이다.
				둘째 줄에 정수 i가 주어진다. (1<=i<=|S|)
		 - (출력) S의 i번째 글자를 출력한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String s = br.readLine();
//		int i = Integer.parseInt(br.readLine());
//		System.out.println(s.substring(i-1,i));
//		// 다른사람 소스코드 참고 charAt 사용
//		System.out.println(s.charAt(i-1));
		/*
		 2. 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
		 - (입력)첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
		 - (출력)첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.
		 */
//		String lengStr = br.readLine();
//		System.out.println(lengStr.length());
		/*
		 3. 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
		 - (입력)입력의 첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)가 주어진다. 각 테스트 케이스는 한 줄에 하나의 문자열이 주어진다. 
		 	문자열은 알파벳 A~Z 대문자로 이루어지며 알파벳 사이에 공백은 없으며 문자열의 길이는 1000보다 작다.
		 - (출력)각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자를 연속하여 출력한다.
		 */
//		int testCnt = Integer.parseInt(br.readLine());
//		for(int i=0;i<testCnt;i++) {
//			String seStr = br.readLine();
//			System.out.println(seStr.charAt(0)+""+seStr.charAt(seStr.length()-1));
//		}
		/*
		 4. 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
		 	- (입력)알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
		 	- (출력) 입력으로 주어진 글자의 아스키 코드 값을 출력한다.
		 */
//		String s =br.readLine();
//		System.out.println(s.hashCode());
		// 1 다른 사람 소스참고(read()사용) -> 코드길이 감소
		//int a = System.in.read();
		//System.out.print(a);
		
		// 2 다른 사람 소스참고(charAt()-> int 형변경) 
//		System.out.println((int)s.charAt(0));
		
		/*
		 5. N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
		  - (입력) 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
		  - (출력) 입력으로 주어진 숫자 N개의 합을 출력한다.
		 */
		int intCnt = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int sum =0;
		for(int i=0;i<intCnt;i++) {
			sum +=(int)str.charAt(i)-'0';
		}
		System.out.println(sum);
	}

}
