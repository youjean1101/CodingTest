package coding_1_step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A00_Test {
	
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 int year;

        year = Integer.parseInt(br.readLine());

        if(year<1 | year>4000){
            System.out.println("한정 범위를 넘어섰습니다.");
            return;
        }

        yearCalculate(year);
	}
	 static void yearCalculate(int year){
	        if(year%4 == 0 & (year%100 != 0 | year%400 == 0)){
	            System.out.println(1);
	        }
	        else{
	            System.out.println(0);
	        }
	    }
}
