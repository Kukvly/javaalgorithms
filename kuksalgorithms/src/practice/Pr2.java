package practice;

import java.util.Arrays;

public class Pr2 {
	public static void main(String[] args) {
//		int yyyy1 = 2007;
//		int day[] = {31,28,31,30,31,30,31,31,30,31,30,31};
//		int dayCnt1 = (yyyy1 - 1) * 365 + ((yyyy1 - 1) / 4 - (yyyy1 - 1) / 100 + (yyyy1 - 1) / 400);
//
//		for (int i = 0; i < 0; i++) {
//			dayCnt1 = dayCnt1 + day[i];
//			System.out.println("1");
//		}
//		
//		System.out.println(dayCnt1);
		int num[] = new int[10];
		num[0] = 1;
		for(int i=1; i<num.length; i++) {
			num[i] = (i+2);
		}
		
		Arrays.sort(num);
		
		
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
		long rtn=1333030303;
		String tmp = Long.toString(rtn);
		String str = tmp.substring(tmp.length() - 9, tmp.length());
		System.out.println(str);
		
		System.out.println("-----------------------------");
		
		long kuks = 12019;
		String kukks = Long.toString(kuks);
		System.out.println("kuks String length: " + kukks.length());
		String rtnKuks = kukks;
		for (int i=0; i<9-kukks.length(); i++) {
			rtnKuks= "0"+rtnKuks;
		}
		System.out.println(rtnKuks);
		
	}

}
