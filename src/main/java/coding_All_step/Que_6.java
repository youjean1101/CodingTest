package coding_All_step;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Que_6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
			1. 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
			윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
			예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 
			하지만, 2000년은 400의 배수이기 때문에 윤년이다.
			- 첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
			- 첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
		 */
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.println("윤달 확인할 연도를 입력하세요.");
//		int year = Integer.parseInt(bf.readLine());
//		
//		if(year%4==0 && (year%100!=0 || year%400==0)) { 
//			System.out.println(1);
//		}else {
//			System.out.println(0);
//		}
		
		// 범위조건 넣기 (다른 사람 코드 참고)
//		if(year<1 || year>4000) {
//			System.out.println("1~4000년까지만 입력 가능합니다.");
//			return;
//		}
//		yearCalculate(year);
		
		/*
			2. 흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다. 
			사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. "Quadrant n"은 "제n사분면"이라는 뜻이다.
			예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다. 
					|
			2사분면	|	1사분면
			----------------- x
			3사분면	|	4사분면
					|
					y
			점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.
			점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 
			단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
			- 첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)
			- 점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.
		*/
//		System.out.println("X를 입력하세요.");
//		int x = Integer.parseInt(bf.readLine());
//		
//		System.out.println("Y를 입력하세요.");
//		int y = Integer.parseInt(bf.readLine());
//		
//		if(-1000>x || x>1000 || x==0 || -1000>y || y>1000 || y==0) {
//			System.out.println("x,y는 -1000~1000까지만 입력하실 수 있으며, 0은 입력하실 수 없습니다.");
//			return;
//		}
//		quadrantCalculate(x,y);
//		// 조건 더 적게 걸기(다른사람 코드 참고)
//		if(x>=0) {
//			if(y>=0) System.out.println(1);
//			else System.out.println(4);
//		}
//		else if(x<0) {
//			if(y>=0) System.out.println(2);
//			else System.out.println(3);
//		}
		
		/*
			3. 상근이는 매일 아침 알람을 듣고 일어난다. 알람을 듣고 바로 일어나면 다행이겠지만, 항상 조금만 더 자려는 마음 때문에 매일 학교를 지각하고 있다.
				상근이는 모든 방법을 동원해보았지만, 조금만 더 자려는 마음은 그 어떤 것도 없앨 수가 없었다.
				이런 상근이를 불쌍하게 보던 창영이는 자신이 사용하는 방법을 추천해 주었다.
				바로 "45분 일찍 알람 설정하기"이다.
				이 방법은 단순하다. 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다. 어차피 알람 소리를 들으면, 알람을 끄고 조금 더 잘 것이기 때문이다. 
				이 방법을 사용하면, 매일 아침 더 잤다는 기분을 느낄 수 있고, 학교도 지각하지 않게 된다.
				현재 상근이가 설정한 알람 시각이 주어졌을 때, 창영이의 방법을 사용한다면, 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.
		 			- 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
						입력 시간은 24시간 표현을 사용한다. 
						24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
					- 첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다. (입력과 같은 형태로 출력하면 된다.)
		 */
		System.out.println("시분을 입력해주세요.");
		String[] strs = bf.readLine().split(" ");
		int hour = Integer.parseInt(strs[0]);
		int minute = Integer.parseInt(strs[1]);
		
		if(hour<0 || hour>23 || minute<0 || minute>59) {
			System.out.println("시간범위에 맞게 입력해주세요.");
			return;
		}
		timeCalculate(hour,minute);
		
		// 다른사람꺼 참고 (더적은메모리와 코드길이)
		int curArTime = hour * 60 + minute;
		int newArTime = (curArTime - 45 + 24 * 60) % (24*60); 
		// 24*60 더해주는이유 : 00시 00분에서 -45를 하면 -가 되기 때문에
		
		int newH = newArTime / 60;
		int newM = newArTime % 60;
		System.out.println(newH + " " + newM);	
	}
	
	// 1번(윤달)문제 다른사람 코드 참고
	static void yearCalculate(int year) {
		if(year%4==0 && (year%100!=0 || year%400==0)) { 
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
	// 2번
	static void quadrantCalculate(int x,int y) {
		if(x>0 & y>0) System.out.println(1);
		else if(x<0 & y>0) System.out.println(2);
		else if(x<0 & y<0) System.out.println(3);
		else System.out.println(4);
	}
	// 3번
	static void timeCalculate(int h, int m) {
		int calMin=0;
		if(m-45<0) {
			h--;
			calMin = 60+(m-45);
		}else {
			calMin = m-45;
		}
		if(h<0) {
			h=23;
		}
		
		System.out.println(h+" "+calMin);
	}
}
