package coding_1_step;

import java.util.Random;
import java.util.Scanner;

public class Que_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
		// 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
		Scanner sc = new Scanner(System.in);
//		System.out.println("1 이상의 정수를 입력하세요.");
//		int A = sc.nextInt();
//		System.out.println("9 이하의 정수를 입력하세요.");
//		int B = sc.nextInt();
//		if(0<A && B<10) {
//			System.out.println("AXB= "+A*B);
//		}else {
//			System.out.println("범위에 맞는 숫자를 입력하세요.");
//		}
		
		
		// 2. 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
		// 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//		System.out.println("1 이상의 정수를 입력하세요.");
//		double A = sc.nextDouble();
//		System.out.println("9 이하의 정수를 입력하세요.");
//		double B = sc.nextDouble();
//		if(0.0<A && B<10.0) {
//			System.out.println("A/B="+A/B);
//		}else {
//			System.out.println("범위에 맞는 숫자를 입력하세요.");
//		}
		// 3. 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
		// 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
//		Random r = new Random();
//		int A = r.nextInt(10000)+1;
//		int B = r.nextInt(10000)+1;
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println("A:"+A);
		System.out.println("B:"+B);
		System.out.println("A+B="+(A+B));
		System.out.println("A-B="+(A-B));
		System.out.println("A*B="+A*B);
		System.out.println("A/B="+A/B);
		System.out.println("A%B="+A%B);
		sc.close();
	}

}
