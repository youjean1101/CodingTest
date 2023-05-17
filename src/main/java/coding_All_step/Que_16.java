package coding_All_step;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Que_16 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		/*
		 1. 알파벳 소문자로만 이루어진 단어 S가 주어진다. 
		 	각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
		 	포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
		 	-(입력) 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
		 	-(출력) 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, 
		 		... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
				만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다.
				 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("a".hashCode()); // 97
//		System.out.println("z".hashCode()); // 122
//		String s = br.readLine();
//		
//		ArrayList<Integer> sArr = new ArrayList<>();
//		for(int i=0;i<s.length();i++) {
//			sArr.add(String.valueOf(s.charAt(i)).hashCode());
//		}
//		
//		for(int j="a".hashCode();j<"z".hashCode()+1;j++) {
//			System.out.print(sArr.indexOf(j)+" ");
//		}
		// 다른사람 소스코드 참고(정적배열 a 아스키코드 - 사용) -> 코드수,메모리량 감소
		String s = br.readLine(); // 입력받은 문자
		int[] alpha=new int [26];	// 알파벳 정적배열
		for(int i=0;i<26;i++) alpha[i]=-1; // -1 value값 넣기
		for(int i=0;i<s.length();i++) { 
			
			int temp=(int)s.charAt(i)-97; // 입력받은 문자(하나하나) 아스키코드를 temp에 삽입 
			if(alpha[temp]==-1) // -1이면
			alpha[temp]=i; // 자리수 넣기
		}
		for(int i=0;i<26;i++) 
		System.out.println(alpha[i]+" ");
		/*
		 2. 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
		  즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. 
		  S에는 QR Code "alphanumeric" 문자만 들어있다.
			QRCode "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
			-(입력) 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. 
				S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 
			-(출력) 각 테스트 케이스에 대해 P를 출력한다.
		 */
//		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
//		String s2=null;
//		int r =0;
//		for(int i=0;i<t;i++) {
//			st = new StringTokenizer(br.readLine());
//			r = Integer.parseInt(st.nextToken());
//			s2 = st.nextToken();
//			for(int j=0;j<s2.length();j++) {
//				for(int k=0;k<r;k++) {
//					System.out.print(s2.charAt(j));
//				}
//			}
//			System.out.println();
//		}
		/*
		 3. 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 
		 	이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 
		 	단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
		 	- (입력) 첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 
		 	이 문자열의 길이는 1,000,000을 넘지 않는다. 
		 	단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.
		 	- (출력) 첫째 줄에 단어의 개수를 출력한다.
		 */
		//String sen = br.readLine();
		
//		String []senArr = br.readLine().split(" ");
//		int one=0;
//		if(senArr.length>0 && senArr[0]=="") { 
//			one=1;
//		}
//		System.out.println(senArr.length-one);// senArr.length-1 할 경우, 런타임에러발생 (배열 - 값으로 인하여)
		
		// 다른사람 코드 참고(countTokens() 사용) -> 코드수, 메모리량 감소
		st = new StringTokenizer(br.readLine(), " ");
		System.out.println(st.countTokens());
		
		/*
		 4. 상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 
		 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 
		 상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
		 상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 
		 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
		 두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
		 */
		 st = new StringTokenizer(br.readLine());
		 
		 String []A = st.nextToken().split("");
		 String []B = st.nextToken().split("");
		 back(A); // 거꾸로
		 back(B);
		 int aCompare = Integer.parseInt(A[0]+A[1]+A[2]);
		 int bCompare = Integer.parseInt(B[0]+B[1]+B[2]);
		 
		 if(aCompare>bCompare) {
			 System.out.println(aCompare);
		 }else {
			 System.out.println(bCompare);
		 }
		 // 다른사람코드 (.reverse()(뒤집는 , 삼항연산자 사용) - > 코드수, 메모리수 감소
		 int A2 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		 int B2 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
			
		 System.out.print(A2 > B2 ? A2:B2);
	}
	static void back(String[] arr) {
		 String temp = arr[0];
		 arr[0] = arr[2];
		 arr[2] = temp;
	}
}
