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
			boolean[] arr = new boolean[42];
			
//		    int count = 0;
//		    for(int i = 0; i < 10; i++){
//		        arr[Integer.parseInt(br.readLine())%42] = true;
//		    }
		    for(boolean value : arr){
		    	System.out.println(arr.length);
//		        if(value){
//		            count++;
//		        }
		    }
//		    System.out.println(count);
        
         
		 
	}
	
}
