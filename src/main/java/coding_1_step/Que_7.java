package coding_1_step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Que_7 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
			1. KOI 전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는 인공지능 오븐을 개발하려고 한다. 
			인공지능 오븐을 사용하는 방법은 적당한 양의 오리 훈제 재료를 인공지능 오븐에 넣으면 된다. 
			그러면 인공지능 오븐은 오븐구이가 끝나는 시간을 분 단위로 자동적으로 계산한다. 
			또한, KOI 전자의 인공지능 오븐 앞면에는 사용자에게 훈제오리구이 요리가 끝나는 시각을 알려 주는 디지털 시계가 있다. 
			훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 
			오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
				- (입력) 첫째 줄에는 현재 시각이 나온다. 
				현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다. 
				두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다. 
				- (출력) 첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다. 
				(단, 시는 0부터 23까지의 정수, 분은 0부터 59까지의 정수이다. 디지털 시계는 23시 59분에서 1분이 지나면 0시 0분이 된다.)
		 */
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.println("[입력] 시 분을 입력해주세요.");
//		String []strs = bf.readLine().split(" "); 
//		
//		int hour = Integer.parseInt(strs[0]);
//		int minute = Integer.parseInt(strs[1]);
//		
//		System.out.println("[입력] 설정하실 타이머를 입력해주세요..");
//		int timer = Integer.parseInt(bf.readLine()); 
//		
//		if(hour==24) hour=0;
//		
//		if(hour<0 || hour>24 || minute<0 || minute>59) {
//			System.out.println("[안내메시지] 시간양식에 맞게 작성해주세요.");
//			return;
//		}else if(timer<0 | timer>1000) {
//			System.out.println("[안내메시지]타이머는 0~1000까지만 설정가능합니다.");
//			return;
//		}
//		
//		timerCalculate(hour, minute,timer);
		
		// 다른사람 코드참고 (StringTokenizer 사용)
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//입력
//        StringTokenizer st = new StringTokenizer(br.readLine()); // 
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        int c = Integer.parseInt(br.readLine());
//        int min = 60 * a + b + c;
//        int hour2 = (min / 60) % 24;
//        int minute2 = min % 60;
//        bw.write(hour + " " + minute);
//        bw.flush();
        
		/*
		2. 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 
		같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
		같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
		모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
		예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다.
		또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 
		3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
		3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
			- (입력) 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다. 
			- (출력) 첫째 줄에 게임의 상금을 출력 한다.
		 */
//        System.out.println("주사위 3개를 던지세요.");
//        String []strs2 = bf.readLine().split(" "); 
//        
//        int dice1 = Integer.parseInt(strs2[0]);
//        int dice2 = Integer.parseInt(strs2[1]);
//        int dice3 = Integer.parseInt(strs2[2]);
//        
//        //주사위최댓값
//        int iMax=0;
//        int []intrs = {dice1,dice2,dice3};
//        for(int i : intrs) iMax = Math.max(i, iMax);
//   
//        int sameCompare = dice1==dice2?dice1:dice1==dice3?dice3:dice2==dice3?dice2:0;
//        //같다는 조건
//        int money = 0;
//        if(dice1==dice2 && dice2==dice3) {
//        	money = 10000+dice1*1000;
//        }else if(sameCompare!=0){
//        	money = 1000+sameCompare*100;
//        }else {
//        	money = iMax*100;
//        }
//        System.out.println(money);
		/*
		3. N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
			- (입력)첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
			- (출력) 출력형식과 같게 N*1부터 N*9까지 출력한다.
		 */
        System.out.println("몇단의 구구단을 보시겠습니까?");
        int number = Integer.parseInt(bf.readLine());
        
        for(int i=1;i<10;i++) {
        	System.out.println(number+" * "+i+" = "+(number*i));
        }
        
	}
	static void timerCalculate(int h, int m, int t) {
		int totMinute = ((h*60+m)+t+(24*60))%(24*60);
		int resultHour = totMinute/60;
		int resultMinute = totMinute%60;
		
		System.out.println(resultHour+" "+resultMinute);
	}
}
