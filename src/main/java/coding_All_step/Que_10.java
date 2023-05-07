package coding_All_step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Que_10 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		1. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 - (입력)첫째 줄에 테스트 케이스의 개수 T가 주어진다.
				각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 - (출력) 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다.
		  		x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

//		int cnt = Integer.parseInt(br.readLine());
		
//		StringTokenizer st;
//		for(int i=1;i<=cnt;i++) {
//			st = new StringTokenizer(br.readLine());
//			int A = Integer.parseInt(st.nextToken());
//			int B = Integer.parseInt(st.nextToken());
//			sb.append("Case #"+i+": "+A+" + "+B+" = ").append(A+B).append("\n");
//		}
		/*
		 2. 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		 - (입력)첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		 - (출력)첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
		 */
		int starLineCnt = Integer.parseInt(br.readLine());
		
//		for(int i=0;i<starLineCnt;i++) {
//			sb.append("*");			
//			for(int j=0;j<i;j++) { 
//				// (다른사람 참고 코드)for(int j=0;j<i+1;j++)하면 위에 append코드 한 줄 줄일 수 있음.
//				sb.append("*");
//			}
//			sb.append("\n");
//		}
		/*
		 3. 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
			하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
			- (입력) 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
			- (출력) 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
		 */
		
		for(int i=1;i<=starLineCnt;i++) { // 줄
			for(int j=0;j<starLineCnt-i;j++) { //별갯수
				sb.append(" ");
			}
			for(int k=0;k<i;k++) { //별갯수
				sb.append("*");
			}
			sb.append("\n");
		}
		
		
		// 다른사람 코드 참고
		for(int i = 1; i <= starLineCnt; i++){
            for(int j = starLineCnt; j > 0; j--){
                if(i < j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
		
		bw.write(sb.toString());
		bw.close();
	}

}
