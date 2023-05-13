package coding_All_step;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Que_14 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		/*
		 1. 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 
		 	예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
			수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 
			그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
		 	-(입력) 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
		 	-(출력) 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int []arr = new int[10];
//		for(int i=0;i<10;i++) {
//			int A = Integer.parseInt(br.readLine());
//			arr[i]= A%42;
//		}
//		Set<Integer> set = new HashSet<>(); // set은 중복된값을 중복저장할수 없기떄문에
//		for(int a:arr) {
//			set.add(a);
//		}
//		System.out.println(set.size());
//		
//		// 다른사람 코드(boolean 사용) -> 코드길이감소 및 다른방법
//		boolean[] boolArr = new boolean[42]; // 42로 배열수 정한 이유 : 42로 나눈 나머지이므로 42보다 작은수로만 나오니까
//		int count = 0;
//		for(int i = 0; i < 10; i++){
//			boolArr[Integer.parseInt(br.readLine())%42] = true; // 42로 나눈나머지 배열값에 true를 삽입
//		}
//		for(boolean value : boolArr){ // true값 계산
//		    if(value){
//		        count++;
//		    }
//		}
//		System.out.println(count);
		/*
		 2. 도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다. 바구니는 일렬로 놓여져 있고, 가장 왼쪽 바구니를 1번째 바구니, 그 다음 바구니를 2번째 바구니, ..., 가장 오른쪽 바구니를 N번째 바구니라고 부른다. 
			도현이는 앞으로 M번 바구니의 순서를 역순으로 만들려고 한다. 도현이는 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고, 그 범위에 들어있는 바구니의 순서를 역순으로 만든다.
			바구니의 순서를 어떻게 바꿀지 주어졌을 때, M번 바구니의 순서를 역순으로 만든 다음, 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램을 작성하시오.
		 	- (입력)첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
					둘째 줄부터 M개의 줄에는 바구니의 순서를 역순으로 만드는 방법이 주어진다. 방법은 i j로 나타내고, 왼쪽으로부터 i번째 바구니부터 j번째 바구니의 순서를 역순으로 만든다는 뜻이다. (1 ≤ i ≤ j ≤ N)
					도현이는 입력으로 주어진 순서대로 바구니의 순서를 바꾼다.
		 	- (출력) 모든 순서를 바꾼 다음에, 가장 왼쪽에 있는 바구니부터 바구니에 적혀있는 순서를 공백으로 구분해 출력한다.
		 */
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 바구니 갯수
		int M = Integer.parseInt(st.nextToken()); // 변경횟수
		int []basketArr = new int[N];
		
		for(int a=0;a<N;a++) {
			basketArr[a] = a+1;
		}
		
		for(int a=0;a<M;a++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken())-1;
			int j = Integer.parseInt(st.nextToken())-1;
			if(i!=j) {
				while(i < j) { // 알고리즘 공부하기
					int temp = basketArr[i];
					basketArr[i++]= basketArr[j]; 
					basketArr[j--] = temp;
				}
			}
		}
		for(int outArr:basketArr){
			System.out.print(outArr+" ");
		}
		/*
		 3. 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 
		 	일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
			예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
			세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
			-(입력) 첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 
				둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
			-(출력) 첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.
		 */
//		 int N = Integer.parseInt(br.readLine());
		 double []scoreArr = new double[N];
		 st = new StringTokenizer(br.readLine());
		 
		 for(int a=0;a<N;a++) {
			 scoreArr[a]=Double.parseDouble(st.nextToken());
		 }
		 double max = Arrays.stream(scoreArr).max().getAsDouble();
		 double sum = 0;
		 for(int a=0;a<N;a++) {
			 sum += scoreArr[a]/max*100;
		 }
		System.out.println(sum/N);
		// 다른사람 코드 (Math.max, split 사용) => 코드수 감소, 메모리량 감소
		String[] line = br.readLine().split(" ");
        int max2 = 0;
        double sum2 = 0;
        for(int i = 0; i < N; i++){ 
            int s = Integer.parseInt(line[i]);
            max2 = Math.max(max2, s);
            sum2 += (double) s;
        }
        sum *= 100.0 / (double) max;
        System.out.println(sum / N);
	}
}
