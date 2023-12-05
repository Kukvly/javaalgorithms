package references;

public class test1 {

	public static void main(String[] args) {
		// char 형 변수 선언
		char a = '1'; // 49
		char b = '9'; // 57
		
		char c = 'a';
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(a+c);
		System.out.println(a+1);
		
		char d = (char) (a + 1);
		
		int p = a + 1;
		
		char e = (char)(a+c);
		System.out.println(e);
		System.out.println(b);
		System.out.println((char)(a+b));
		System.out.println(a+b);
		System.out.print(d);
		System.out.print(p);
		
	}
}
