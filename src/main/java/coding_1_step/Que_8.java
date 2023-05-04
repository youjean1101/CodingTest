package coding_1_step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Que_8 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
			1.두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
			- 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
			- 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
			- 각 테스트 케이스마다 A+B를 출력한다.
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, "utf-8"));
//		
//		System.out.println("테스트 케이스 개수를 입력하세요.");
//		int testCnt = Integer.parseInt(br.readLine());
//		
//		List<Integer> sumAB = new ArrayList<>();
//		int A=0;
//		int B=0;
//		for(int i=0;i<testCnt;i++) {
//			String []arr = br.readLine().split(" ");
//			A = Integer.parseInt(arr[0]);
//			B = Integer.parseInt(arr[1]);
//			sumAB.add(A+B);
//		}
//		for(int i:sumAB) {
//			System.out.println(i);
//		}
		
		// 다른사람 코드 참고(tokenizer사용)
//		int N = Integer.parseInt(br.readLine()); // readLine으로 받은 입력 데이터 String임.
//        int[] arr = new int[N];
//
//        StringBuilder sb = new StringBuilder();
//        
//        //StringBuilder의 객체를 생성한 후, append()의 인자로 연결하고자 하는 문자열을 넣어서 StringBuilder의 객체를 통해 호출
//        StringTokenizer st = null;
//        for (int i = 0; i < N; i++) {
//            st = new StringTokenizer(br.readLine()); 
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            sb.append(a + b + "\n");
//        }
//        System.out.println(sb);
//        br.close();
        /*
         2. n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
         	- 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
         	- 1부터 n까지 합을 출력한다.
         */
//        int n = Integer.parseInt(br.readLine());
//        int tot = 0;
//        
//        for(int i=1;i<=n;i++) {
//        	tot += i;
//        }
//        System.out.println(tot);
//        // 다른사람 참고코드
//        System.out.println(IntStream.rangeClosed(1, n).sum());
        // IntStream.rangeClosed: 두 메서드 모두 시작 값과 종료 값을 인수로 받는다.
        
        /*
         3. 준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다. 정말 멋졌다. 
         	그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다! 준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.
			영수증에 적힌, 구매한 각 물건의 가격과 개수 구매한 물건들의 총 금액을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
			- 첫째 줄에는 영수증에 적힌 총 금액 $X$가 주어진다.
			- 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 $N$이 주어진다.
			- 이후 $N$개의 줄에는 각 물건의 가격 $a$와 개수 $b$가 공백을 사이에 두고 주어진다.
			- 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 
					일치하지 않는다면 No를 출력한다.
         */
         System.out.println("영수증에 적힌 최종가격을 입력해주세요.");
         int totPrice = Integer.parseInt(br.readLine());
         int cntProduct = Integer.parseInt(br.readLine());
         
         StringTokenizer st = null;
         int calPrice=0;
         for(int i=0;i<cntProduct;i++) {
        	 st = new StringTokenizer(br.readLine());
        	 int price = Integer.parseInt(st.nextToken());
        	 int cnt = Integer.parseInt(st.nextToken());
        	 calPrice += price*cnt;
         }
         if(totPrice==calPrice) {
        	 System.out.println("Yes");
         }else {
        	 System.out.println("No");
         }
         
        
	}
}
