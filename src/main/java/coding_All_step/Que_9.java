package coding_All_step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Que_9 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		1. 오늘은 혜아의 면접 날이다. 면접 준비를 열심히 해서 앞선 질문들을 잘 대답한 혜아는 이제 마지막으로 칠판에 직접 코딩하는 문제를 받았다. 혜아가 받은 문제는 두 수를 더하는 문제였다. C++ 책을 열심히 읽었던 혜아는 간단히 두 수를 더하는 코드를 칠판에 적었다. 코드를 본 면접관은 다음 질문을 했다. “만약, 입출력이 
		$N$바이트 크기의 정수라면 프로그램을 어떻게 구현해야 할까요?”
		혜아는 책에 있는 정수 자료형과 관련된 내용을 기억해 냈다. 책에는 long int는 
		$4$바이트 정수까지 저장할 수 있는 정수 자료형이고 long long int는 
		$8$바이트 정수까지 저장할 수 있는 정수 자료형이라고 적혀 있었다. 
		혜아는 이런 생각이 들었다. “int 앞에 long을 하나씩 더 붙일 때마다 
		$4$바이트씩 저장할 수 있는 공간이 늘어나는 걸까? 분명 long long long int는 
		$12$바이트, long long long long int는 
		$16$바이트까지 저장할 수 있는 정수 자료형일 거야!” 
		그렇게 혜아는 당황하는 면접관의 얼굴을 뒤로한 채 칠판에 정수 자료형을 써 내려가기 시작했다.
		혜아가 $N$바이트 정수까지 저장할 수 있다고 생각해서 칠판에 쓴 정수 자료형의 이름은 무엇일까?
		- (입력)첫 번째 줄에는 문제의 정수 N이 주어진다. $(4<= N<= 1\, 000; N은 4의 배수) 
		- (출력)혜아가 N바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형의 이름을 출력하여라.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("타입을 보고싶은 바이트를 입력해주세요.");
//		int N = Integer.parseInt(br.readLine());
//		String byteType="";
//		if(N%4==0) {
//			for(int i=1;i<=(N/4);i++) {
//				byteType += "long ";
//			}
//			byteType += "int";
//			System.out.println(byteType);
//		}else {
//			System.out.println("바이트 단위로 입력해주세요.");
//		}
//		
//		// 다른사람 코드 참고(StringBuilder 사용)
//		StringBuilder sb = new StringBuilder();
//		int res = N/4;
//		for(int i=0; i<res; i++) {
//			sb.append("long").append(" ");
//		}
//		sb.append("int");
//		System.out.println(sb.toString());
		
		/*
		 	2. 본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
			C++을 사용하고 있고 cin/cout을 사용하고자 한다면, cin.tie(NULL)과 sync_with_stdio(false)를 둘 다 적용해 주고,
			 endl 대신 개행문자(\n)를 쓰자. 단, 이렇게 하면 더 이상 scanf/printf/puts/getchar/putchar 등 C의 입출력 방식을 사용하면 안 된다.
			Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. 
			BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
			Python을 사용하고 있다면, input 대신 sys.stdin.readline을 사용할 수 있다. 
			단, 이때는 맨 끝의 개행문자까지 같이 입력받기 때문에 문자열을 저장하고 싶을 경우 .rstrip()을 추가로 해 주는 것이 좋다.
			또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다. 테스트케이스를 하나 받은 뒤 하나 출력해도 된다.
			자세한 설명 및 다른 언어의 경우는 이 글에 설명되어 있다.
			이 블로그 글에서 BOJ의 기타 여러 가지 팁을 볼 수 있다.
		 	- (입력) 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
		 	- (출력) 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
		 */
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//			int cnt = Integer.parseInt(br.readLine());
//			StringBuilder sb2 = new StringBuilder();
//			
//			for(int i=0;i<cnt;i++) {
//				StringTokenizer tn = new StringTokenizer(br.readLine());
//				int A = Integer.parseInt(tn.nextToken());
//				int B = Integer.parseInt(tn.nextToken());
//				sb2.append(A+B).append("\n");
//			}
//			bw.write(sb2.toString());
//			//bw.flush();
//			bw.close();
			// flush() : 내부 버퍼의 내용을 파일에 writer 함. 
			//				flush를 호출하지 않는다면 내용이 버퍼에만 남고 파일에는 쓰이지 않는 상황이 나올 수 있음.
			//	=> 메서드는 버퍼에 데이터가 가득차 있건 아니건, 버퍼에서 강제로 밀어내도록 하는 메소드
			
			// close() : 스트림을 이용하여 파일의 내용을 읽어들임 ( flush 후, 닫음)
			//				이 때, close()를 호출하여 스트림을 닫으면 그 스트림을 다시 이용하여 파일에 쓰는 것이 불가능
			//	=> 스트림으로 읽어들이는데 메모리 소모. 작업이 끝나면 close()를 호출하여 스트림을 닫아 종료된 작업에 대해 메모리를 확보해야함
		
			// flush를 사용해야 하는 이유 : 이전에 쓰여진 어떤 바이트가 output stream의 실행으로 버퍼되었다면, 버퍼된 바이트는 즉시 사용될 목적으로 쓰여져야함
			//	=> 스트림을 닫지 않은 상태에서 바이트를 보내고 싶은 경우
			
			/*
			 3. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
			 	- (입력) 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
					각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
				- (출력) 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
			 */
			int cnt2 = Integer.parseInt(br.readLine());
			StringBuilder sb3 = new StringBuilder();
			for(int i=1;i<=cnt2;i++) {
				StringTokenizer tn2 = new StringTokenizer(br.readLine());
				int A2 = Integer.parseInt(tn2.nextToken());
				int B2 = Integer.parseInt(tn2.nextToken());
				sb3.append("Case #"+i+": ").append(A2+B2).append("\n");
				
			}
			bw.write(sb3.toString());
			bw.close();
			
			//// 다른사람 코드 참고(charAt 사용)
			String str;
			for (int i = 1; i < cnt2 + 1; i++) {
				str = br.readLine();
				sb3.append("Case #").append(i).append(": ").append(str.charAt(0) - '0' + str.charAt(2) - '0').append("\n"); //
			}
			// charAt :  char타입으로는 입력을 받을 수 없고 String타입으로 입력받는 것이 2개나 존재한다는 점
			// =>  String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해주는 녀석 (인덱스번호로 글자 선택가능)
			// => char형을 int형으로 형변환하면 아스키코드로 값이 변환(그러므로 '0'을 뺴주면 int형으로 변환가능)
	}

}
