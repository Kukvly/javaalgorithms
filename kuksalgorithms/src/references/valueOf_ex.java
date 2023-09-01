package references;

/**
 * 
 * @author kukvly
 * ( )안의 해당 객체를 String의 객체로 변환
 * String 객체로 형변환
 */

public class valueOf_ex {

	public static void main(String[] args) {
		String param1 = "kuks";
		String param2 = String.valueOf(28);
		String param3 = String.valueOf(param1);
		String param4 = String.valueOf(false);
		
		System.out.println(param1);
		System.out.println(param2);
		System.out.println(param3);
		System.out.println(param4);
		
		System.out.println(param1+param2);
		System.out.println(param1+param2+param3+param4);
	}

}
