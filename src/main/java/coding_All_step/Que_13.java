package coding_All_step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Que_13 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		/*
		 1. 도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다.
		  또, 1번부터 N번까지 번호가 적혀있는 공을 매우 많이 가지고 있다. 
		  가장 처음 바구니에는 공이 들어있지 않으며,바구니에는 공을 1개만 넣을 수 있다.
		  도현이는 앞으로 M번 공을 넣으려고 한다. 
		  도현이는 한 번 공을 넣을 때, 공을 넣을 바구니 범위를 정하고, 정한 바구니에 모두 같은 번호가 적혀있는 공을 넣는다. 
		  만약, 바구니에 공이 이미 있는 경우에는 들어있는 공을 빼고, 새로 공을 넣는다. 공을 넣을 바구니는 연속되어 있어야 한다.
		  공을 어떻게 넣을지가 주어졌을 때, M번 공을 넣은 이후에 각 바구니에 어떤 공이 들어 있는지 구하는 프로그램을 작성하시오.
		  - (입력)
		    첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
			둘째 줄부터 M개의 줄에 걸쳐서 공을 넣는 방법이 주어진다. 
			각 방법은 세 정수 i j k로 이루어져 있으며, i번 바구니부터 j번 바구니까지에 k번 번호가 적혀져 있는 공을 넣는다는 뜻이다. 
			예를 들어, 2 5 6은 2번 바구니부터 5번 바구니까지에 6번 공을 넣는다는 뜻이다. (1 ≤ i ≤ j ≤ N, 1 ≤ k ≤ N)
			도현이는 입력으로 주어진 순서대로 공을 넣는다.
		  - (출력)1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다. 공이 들어있지 않은 바구니는 0을 출력한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb =new StringBuilder();
		
//		st = new StringTokenizer(br.readLine());
//		int N = Integer.parseInt(st.nextToken());
//		int M = Integer.parseInt(st.nextToken());
//		
//		int []basketArr = new int[N];
//		int i;
//		int j;
//		int k;
//		
//		for(int mCnt=0;mCnt<M;mCnt++) {
//			st = new StringTokenizer(br.readLine());
//			i = Integer.parseInt(st.nextToken());
//			j = Integer.parseInt(st.nextToken());
//			k = Integer.parseInt(st.nextToken());
//			for(int a=i;a<=j;a++) {
//				basketArr[a-1] = k;
//			}
//		}
//		for(int out:basketArr) {
//			System.out.print(out+" ");
//		}
//		// 다른사람 코드 - 코드길이 단축 (i2<j2 사용)
//		Scanner s = new Scanner(System.in);
//        int[] ary = new int[N];
//		for(int a=0; a<M; a++) { 
//            int i2 = s.nextInt()-1;
//            int j2 = s.nextInt();
//            int k2 = s.nextInt();
//            for(; i2<j2; i2++) { //  
//                ary[i2] = k2;
//            }
//        }
		/*
		 2. 도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다. 
		 	바구니에는 공이 1개씩 들어있고, 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다.
			도현이는 앞으로 M번 공을 바꾸려고 한다. 도현이는 공을 바꿀 바구니 2개를 선택하고, 두 바구니에 들어있는 공을 서로 교환한다.
			공을 어떻게 바꿀지가 주어졌을 때, M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성하시오.
			-(입력)첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
				둘째 줄부터 M개의 줄에 걸쳐서 공을 교환할 방법이 주어진다.
				 각 방법은 두 정수 i j로 이루어져 있으며, i번 바구니와 j번 바구니에 들어있는 공을 교환한다는 뜻이다. (1 ≤ i ≤ j ≤ N)
				도현이는 입력으로 주어진 순서대로 공을 교환한다.
			-(출력)1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다.
		 */
//		st = new StringTokenizer(br.readLine());
//		int N = Integer.parseInt(st.nextToken());
//		int M = Integer.parseInt(st.nextToken());
//		int []basketArr = new int[N];
//		for(int n=1;n<=N;n++) {
//			basketArr[n-1] = n;
//		}
//		
//		for(int chCnt=0;chCnt<M;chCnt++) {
//			st = new StringTokenizer(br.readLine());
//			int i = Integer.parseInt(st.nextToken())-1;
//			int j = Integer.parseInt(st.nextToken())-1;
//			int temp = basketArr[i];
//			basketArr[i] = basketArr[j];
//			basketArr[j] = temp;
//		}
//		for(int out:basketArr) {
//			System.out.print(out+" ");
//		}
		/*
		 3. X대학 M교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
			교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.
		 	-(입력)입력은 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다. 출석번호에 중복은 없다.
		 	-(출력)출력은 2줄이다. 1번째 줄엔 제출하지 않은 학생의 출석번호 중 가장 작은 것을 출력하고, 2번째 줄에선 그 다음 출석번호를 출력한다.
		 	
		 */
		ArrayList<Integer> classArr = new ArrayList<>();
		for(int i=1;i<=30;i++) {
			classArr.add(i);
		}
		
		
		for(int i=0;i<28;i++) {
			int index = Integer.parseInt(br.readLine());
			if(classArr.indexOf(index)>=0) {
				classArr.remove(classArr.indexOf(index));
			}
		}
		for(int out:classArr) {
			System.out.println(out);
		}
		// 다른사람 코드 참고->코드길이 감소(정적변수활용)
		//배열안에 value 넣지않고, 인덱스번호로 뽑아오기
		
		int[] arr = new int[31];

		for (int i = 1; i <= 28; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}

		for (int i = 1; i <= 30; i++) {
			if (arr[i] != 1) {
				System.out.println(i);
			} 
		}
	}

}
