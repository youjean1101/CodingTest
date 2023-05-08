package coding_All_step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Que_11 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 1. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 (입력)입력은 여러 개의 테스트 케이스로 이루어져 있다.
			각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
			입력의 마지막에는 0 두 개가 들어온다.
		 (출력) 각 테스트 케이스마다 A+B를 출력한다.
		 */
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		 StringTokenizer st;
		 StringBuilder sb = new StringBuilder();
//		 
//		 while(true) {
//			 st = new StringTokenizer(br.readLine());
//			 int A = Integer.parseInt(st.nextToken());
//			 int B = Integer.parseInt(st.nextToken());
//			 if(A==0 && B==0) break;
//			 sb.append(A+B+"\n");
//		 }
//		
		 /*
		 2. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		  (입력) 입력은 여러 개의 테스트 케이스로 이루어져 있다.
				각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		  (출력) 각 테스트 케이스마다 A+B를 출력한다.
		  */
		 //
//		 String str; // 입력받을값을 먼저 선언
//		 
//		 while((str=br.readLine())!=null) {
//			 st = new StringTokenizer(str);
//			 int A = Integer.parseInt(st.nextToken());
//			 int B = Integer.parseInt(st.nextToken());
//			 if(A<0 && A>10 && B<0 && B>10) {System.out.println("0~10범위로 입력해주세요.");}
//			 String AB = String.valueOf(A+B);
//			 bw.write(AB+"\n");
//			 bw.flush();
//		 }
		 // 오답!!! (문제의도 : EoF(End Of File)을 적용시켜라)
		 // =>오답노트 https://velog.io/@dbwls8382/%EB%B0%B1%EC%A4%80-10951%EB%AC%B8%EC%A0%9C-%EC%98%A4%EB%8B%B5%EB%85%B8%ED%8A%B8EoF
		 // 문제 이해를 위해 참고
		 //https://cha-coding.tistory.com/entry/%EB%B0%B1%EC%A4%80-10951%EB%B2%88-AB-4-%E2%80%93-JAVA-%EC%9E%90%EB%B0%94
		 /*
		  3. 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
		   - (입력)첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다. 
		   		셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.
		   - (출력)첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.
		  */
		 int inputCnt = Integer.parseInt(br.readLine());
		 
		 ArrayList<Integer> intArr = new ArrayList<>();
		 st = new StringTokenizer(br.readLine());
		 
		 int eq = Integer.parseInt(br.readLine());
		 
		 int eqCnt = 0;
		 for(int i=0;i<inputCnt;i++) {
			 intArr.add(Integer.parseInt(st.nextToken()));
		 }
		 for(int a:intArr) {
			 if(a==eq) {
				 eqCnt++;
			 }
		 }
		 bw.write(String.valueOf(eqCnt));
		 bw.close();
		 
		 
	}

}
