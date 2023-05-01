package coding_1_step;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Que_5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		/* 1. 아래 예제와 같이 개를 출력하시오.
		 |\_/|
		 |q p|   /}
		 ( 0 )"""\
		 |"^"`    |
		 ||_/=\\__|
		*/
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
		
		/*
		2. 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
		첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
		첫째 줄에 다음 세 가지 중 하나를 출력한다.

		A가 B보다 큰 경우에는 '>'를 출력한다.
		A가 B보다 작은 경우에는 '<'를 출력한다.
		A와 B가 같은 경우에는 '=='를 출력한다.
		
		-10,000 ≤ A, B ≤ 10,000
		*/
//		Scanner sc = new Scanner(System.in);
//		System.out.println("A를 입력하세요.");
//		int A = sc.nextInt();
//		System.out.println("B를 입력하세요.");
//		int B = sc.nextInt();
//		
//		if(A>B) {
//			System.out.println(">");
//		}else if(A<B) {
//			System.out.println("<");
//		}else {
//			System.out.println("==");
//		}
		/*
		3. 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D,
		 	나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		 - 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다. 
		*/
//		double score = sc.nextDouble();
//		if(90<=score && 100>=score) {
//			System.out.println("A");
//		}else if(80<=score && 89>=score) {
//			System.out.println("B");
//		}else if(70<=score && 79>=score) {
//			System.out.println("C");
//		}else if(60<=score && 69>=score) {
//			System.out.println("D");
//		}else{
//			System.out.println("F");
//		}
		
		// 입력값을 bufferReader로 받아 실행시간 및 메모리 줄이기
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("bufferReader로 입력받기");
		byte a = Byte.parseByte(bf.readLine());
		// byte단위 : -128 ~ 127
		
		if(a < 60) System.out.println("F");
		else if(a < 70) System.out.println("D");
		else if(a < 80) System.out.println("C");
		else if(a < 90) System.out.println("B");
		else System.out.println("A");
	}
}
