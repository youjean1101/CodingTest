package coding_1_step;

import java.util.Scanner;

public class Que_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 1. (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다. 
		
		 		472 ---(1)
		 	X	385 ---(2)
		 ------------
		 	   2360 ---(3)
		 	  3776  ---(4)
		 	 1416	---(5)
		 ------------
		 	 181720 ---(6)
		 
		 (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
		 - 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
		 */
		Scanner sc = new Scanner(System.in);
//		System.out.println("3자리 숫자의 1번쨰 자연수를 입력하세요.");
//		int A = sc.nextInt();
//		System.out.println("3자리 숫자의 2번쨰 자연수를 입력하세요.");
//		
//		sc.nextLine(); //nextInt() 메소드 enter(개행문자)를 제거
//		
//		String B= sc.nextLine();
//		for(int i=B.length()-1;i>-1;i--) {
//			System.out.println(A*Character.getNumericValue(B.charAt(i)));
//		}
//		System.out.println(A*Integer.parseInt(B));
		
		/*
		 * 2. 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다! 
		 * - 첫 번째 줄에 A, B, C
		 * (1 ≤ A, B, C ≤ 10의 12승)이 공백을 사이에 두고 주어진다.
		 */
		// 오답
//		String ABC = sc.nextLine();
//		String []abcList = ABC.split(", ");
//		int sum =0;
//		for(String a:abcList) {
//			sum += Integer.parseInt(a);
//		}
//		System.out.println(sum);
		//정답
//		System.out.println("더할 3개의 숫자를 입력하세요(공백으로분류).");
//		long A = sc.nextLong();
//		long B = sc.nextLong();
//		long C = sc.nextLong();
//		System.out.println(A+B+C);
		
		// 아래 예제와 같이 고양이를 출력하시오.
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
		
	}
}
