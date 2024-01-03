package references;

public class FastFor {
	public static void main(String[] args) {
		
		/**
		 * for([array's datatype] [param] : [array]){
		 * 		System.out.println(param);
		 * }
		 * 
		 * array 내에 있는 요소들 0번부터 순서대로 출력
		 */
		
		String[] kuksArr1 = {"kim", "yun", "kuk", "pomi"};
		
		for(String i: kuksArr1) {
			System.out.println(i);
		}
		
		System.out.println("--------------------------");
		
		int [][] kuksArr2 = {
				{11, 12, 13},
				{14, 15, 16},
				{17, 18, 19},
				{20, 21, 22},
				{23, 24, 25}
		};
		
		int cnt = 0;
		for (int[] kArr: kuksArr2) {
			System.out.println("kuks chk start---------");
			for (int kuksVal: kArr) {
				System.out.println(cnt+"--------------");
				System.out.println(kuksVal);
			}
			cnt++;
			
		}
		
		System.out.println("kuks chk end ----------");
	}
}
