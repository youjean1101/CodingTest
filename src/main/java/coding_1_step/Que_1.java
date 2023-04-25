package coding_1_step;

import java.util.Scanner;

public class Que_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Hello World!를 출력하시오.
		System.out.println("Hello World!");
		
		// 2.두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		//첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
		Scanner sc02 = new Scanner(System.in);
//		System.out.println("정수 A(0~10)를 입력하세요.");
//		int A = sc02.nextInt();
//		System.out.println("정수 B(0~10)를 입력하세요.");
//		int B = sc02.nextInt();
//		if(0<A && B<10) {
//			System.out.println("A+B="+(A+B));
//		}else {
//			System.out.println("A,B는 정수 및 A는 1이상, B는 9이하로 입력해주세요.");
//		}
		
		// 3. 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
		// 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
		Scanner sc03 = new Scanner(System.in);
		System.out.println("정수 A(0~10)를 입력하세요.");
		int A = sc03.nextInt();
		System.out.println("정수 B(0~10)를 입력하세요.");
		int B = sc03.nextInt();
		if(0<A && B<10) {
			System.out.println("A-B="+(A-B));
		}else {
			System.out.println("A,B는 정수 및 A는 1이상, B는 9이하로 입력해주세요.");
		}
	}
}
