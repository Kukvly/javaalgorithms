package references;

/**
 * 
 * @author kukvly
 * concat 명령어 -> 초기값이 null이면 에러 발생
 */

public class concat_sb {

	public static void main(String[] args) {
		// Null pointer access: 
		// The variable str1 can only be null at this location
		// String str1 = null;
		// String rtn1 = str1.concat("Hi");
		
		// System.out.println("rtn1: " + rtn1);
		
		// 정상 출력
		// rtn2: nice kuks
		String str2 = "nice ";
		String rtn2 = str2.concat("kuks");
				
		System.out.println("rtn2: " + rtn2);
	}

}
