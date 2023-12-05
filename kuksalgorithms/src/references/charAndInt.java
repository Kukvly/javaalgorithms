package references;

public class charAndInt {

	public static void main(String[] args) {
		
		// char 형 변수 선언
		char a = '1';
		
		char c = 'a';
		
		
		
		
		
		// int 형 변수 선언
		int b = 5;
		
		// char 형 변수 그대로 출력
		System.out.println(a);
		
		// '1'의 아스키코드값이 그대로 출력 (0의 아스키코드값 = 48)
		System.out.println((int)a);
		
		// '1'의 아스키코드값 (49) - '0'의 아스키코드값 (48) = 1
		System.out.println(a-'0');	// char 형이었던 '1'를 int 형인 1 로 변환 
		
		System.out.println(a-(int)a);

		System.out.println(a==(int)a);
		
		int n = a-(int)a;
//		char d = a-(int)a;
		
		System.out.println(c+1);
		
		// int 형 변수 그대로 출력
		System.out.println(b);
		
		// 5 + '0'의 아스키코드값 (48) = 53
		System.out.println((b+'0'));
		
		// int 형인 5를 char 형인 '5'로 변환
		System.out.println((char)(b+'0'));	
	}
}
