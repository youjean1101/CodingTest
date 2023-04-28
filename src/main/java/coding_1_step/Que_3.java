package coding_1_step;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Que_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 준하는 사이트에 회원가입을 하다가 joonasㄴ라는 아이디가 이미 존재하는 것을 보고 놀랐다. 준하는 놀람을 ??!로 표현한다. 
		// 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 놀람을 표현하는 프로그램을 작성하시오.
		//  - 첫째 줄에 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어진다. 
		//  - 아이디는 알파벳 소문자로만 이루어져 있으며, 길이는 50자를 넘지 않는다.
		Scanner sc = new Scanner(System.in);
//		List<String> idList = new ArrayList<>();
//		idList.add("joonas");
//		idList.add("backjoon");
		
		//System.out.println("가입할 아이디를 입력하세요.");
		//String signIn = sc.nextLine();
		//System.out.println(signIn+"??!");
//		for(String id:idList) {
//			if(signIn.equals(id)) {
//				System.out.println(signIn+"??!");
//			}
//		}
		// 2. ICPC Bangkok Regional에 참가하기 위해 수완나품 국제공항에 막 도착한 팀 레드시프트 일행은 눈을 믿을 수 없었다. 
		// 공항의 대형 스크린에 올해가 2562년이라고 적혀 있던 것이었다.
		//불교 국가인 태국은 불멸기원(佛滅紀元), 
		// 즉 석가모니가 열반한 해를 기준으로 연도를 세는 불기를 사용한다. 반면, 우리나라는 서기 연도를 사용하고 있다. 
		// 불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하시오.
		//- 서기 연도를 알아보고 싶은 불기 연도 y가 주어진다. (1000 ≤ y ≤ 3000)
//		System.out.println("서기연도를 입력해주세요.");
//		int bYear = sc.nextInt();
//		if(1000<=bYear && bYear<=3000) {
//			System.out.println(bYear-543);
//		}else {
//			System.out.println("정확한 날짜를 입력해주세요.");
//		}
		
		// 3. (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
		// (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
		// 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
		// - 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
		System.out.print("A를 입력하세요.");
		int A = sc.nextInt();
		System.out.print("B를 입력하세요.");
		int B = sc.nextInt();
		System.out.print("C를 입력하세요.");
		int C = sc.nextInt();
		if(2<=A && A<=1000 && 2<=B && B<=1000 && 2<=C && C<=1000 ) {
			System.out.println((A+B)%C);
			System.out.println(((A%C) + (B%C))%C);
			System.out.println((A*B)%C);
			System.out.println(((A%C)*(B%C))%C);
		}else {
			System.out.println("2~1000범위의 숫자를 입력해주세요.");
		}
		
	}

}
