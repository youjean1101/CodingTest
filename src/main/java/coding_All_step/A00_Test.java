package coding_All_step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class A00_Test {
	
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    // final : 변수 수정 불가 (인스턴스 X)
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		String str = "정유진-velog주소:velog.io/@dbwls8382";
//		StringTokenizer st = new StringTokenizer(str, ":-");
//		
//		int i=1;
//		while(st.hasMoreTokens()) { // 다음 토큰이 있다면
//			System.out.println((i++)+"번쨰 토큰:"+st.nextToken());
//		}
		
//		int N = Integer.parseInt(br.readLine()); // readLine으로 받은 입력 데이터 String임.
//        int[] arr = new int[N];
//        System.out.println("배열길이:"+arr.length);
//        
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st = null;
//        for (int i = 0; i < N; i++) {
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            sb.append(a + b + "\n");
//        }
//        System.out.println(sb);
//        br.close();
		 int N2 = Integer.parseInt(br.readLine());
         int [] arr2;
         int max2 = Integer.MIN_VALUE;
         int min2  = Integer.MAX_VALUE;

         st = new StringTokenizer(br.readLine()," ");
         arr2 = new int[N2];
         for (int i = 0; i < N2; i++) {
             arr2[i] = Integer.parseInt(st.nextToken());
             min2 = Math.min(min2, arr2[i]); // 작은 수
             max2 = Math.max(max2, arr2[i]); // 큰 수
         }

         System.out.println(min2+" "+max2);
        
         
		 
	}
	
}
