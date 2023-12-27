package practice;

public class Pr2 {
	public static void main(String[] args) {
		int yyyy1 = 2007;
		int day[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int dayCnt1 = (yyyy1 - 1) * 365 + ((yyyy1 - 1) / 4 - (yyyy1 - 1) / 100 + (yyyy1 - 1) / 400);

		for (int i = 0; i < 0; i++) {
			dayCnt1 = dayCnt1 + day[i];
			System.out.println("1");
		}
		
		System.out.println(dayCnt1);
	}

}
