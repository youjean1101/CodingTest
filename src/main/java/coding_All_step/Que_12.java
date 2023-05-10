package coding_All_step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Que_12 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		/*
		1. 정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
		 	이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		 	- (입력) 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
				둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 
				주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
		 	- (출력)X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
//		st = new StringTokenizer(br.readLine());
//		int Cnt = Integer.parseInt(st.nextToken());
//		int limit = Integer.parseInt(st.nextToken());
//		
//		st = new StringTokenizer(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
//		
//		for(int i=0;i<Cnt;i++) {
//			arr.add(Integer.parseInt(st.nextToken()));
//		}
//		for(int a: arr) {
//			if(a<limit) {
//				sb.append(a+" ");
//			}
//		}
//		arr.clear(); // arr 배열 초기화
//		// 다른사람 소스 코드 참고 (Arrays.stream, 람다식 사용) - 코드길이 줄이고, 메모리 사용량 더 적음.
//		String[] input = br.readLine().split(" ");
//
//        int X = Integer.parseInt(input[1]); // 작은수 비교값
//
//        String a = Arrays.stream(br.readLine().split(" ")) // 동적 배열(구분자 공백)
//                .mapToInt(Integer::parseInt)	// int타입변경으로 작은수 비교
//                .filter(x -> x < X)				// 작은수 기준값보다 작은 수 가 x
//                .mapToObj(String::valueOf)		// string값으로 변환
//                .collect(Collectors.joining(" "));	// 공백으로 구분자넣기
//
//        System.out.println(a);
        
        /*
         2. N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
         	- (입력)첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 
         		둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
         		모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
         	- (출력) 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
         */
        
//         int N = Integer.parseInt(br.readLine());
//         st = new StringTokenizer(br.readLine());
//         for(int i=0;i<N;i++) {
//        	 arr.add(Integer.parseInt(st.nextToken()));
//         }
//         sb.setLength(0); // StringBuilder 초기화
//         sb.append(Collections.min(arr)+" ");
//         sb.append(Collections.max(arr));
//         
//         // 다른사람 소스코드 참고(Math.min / Math.max) -> 메모리사용량 더 적음.
//         int N2 = Integer.parseInt(br.readLine());
//         int [] arr2;
//         int max2 = Integer.MIN_VALUE;
//         int min2  = Integer.MAX_VALUE;
//
//         st = new StringTokenizer(br.readLine()," ");
//         arr2 = new int[N2];
//         for (int i = 0; i < N2; i++) {
//             arr2[i] = Integer.parseInt(st.nextToken());
//             min2 = Math.min(min2, arr2[i]); // 작은 수
//             max2 = Math.max(max2, arr2[i]);
//         }
//
//         System.out.println(min2+" "+max2);
//         
//         // 다른사람 소스 코드2 (Arrays.stream 사용( -> 코드길이 확줄임, 메모리양 줄임
//         int[] arr3 = Arrays.stream(br.readLine().split(" ")).mapToInt(i->Integer.parseInt(i)).toArray();
//         // toArray() :	ArrayList의 요소를 새 Object 배열에 복사합니다.
//         // ToArray(Type) : ArrayList의 요소를 지정된 요소 형식의 새 배열에 복사합니다.
//         System.out.printf("%d %d", Arrays.stream(arr3).min().getAsInt(), Arrays.stream(arr3).max().getAsInt());
//         // getAsInt() : int 값을 반환한다. max값이 없는 경우에는 NoSuchElementException 예외가 발생할 수 있다
        
         /*
         3. 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
			예를 들어, 서로 다른 9개의 자연수
			3, 29, 38, 12, 57, 74, 40, 85, 61
			이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
			-(입력)첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
			-(출력)첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
          */
         for(int i=0;i<9;i++) {
        	 arr.add(Integer.parseInt(br.readLine()));
         }
         //System.out.println(Arrays.stream(arr).min().getAsInt()); // [] 정적배열만 가능
         int max = Collections.max(arr);
         sb.append(max+"\n").append(arr.indexOf(max)+1);
         
         bw.write(sb.toString());
 		 bw.close();
        
        
	}

}
