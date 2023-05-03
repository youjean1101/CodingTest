package coding_1_step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A00_Test {
	
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String str = "정유진-velog주소:velog.io/@dbwls8382";
		StringTokenizer st = new StringTokenizer(str, ":-");
		
		int i=1;
		while(st.hasMoreTokens()) { // 다음 토큰이 있다면
			System.out.println((i++)+"번쨰 토큰:"+st.nextToken());
		}
	}
	
}
