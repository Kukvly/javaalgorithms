package sv.silver_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author kukvly
 * 
 *         캠프에 오게 된 송유진은 캠프가 너무 지루해서 오늘로부터 캠프가 끝날 때 까지 며칠이나 남았는지 알아보고 싶었다. 그런데
 *         캠프는 비상식적으로 길지도 몰라서 (윤년을 포함할지도 모른다) 손으로 하나하나 세기에는 힘들어 보였다. 더욱 정확한 계산을
 *         위해, 유진이는 윤년이 정해지는 기준을 찾아보았고, 그것은 다음과 같았다. 서력기원 연수가 4로 나누어떨어지는 해는 우선
 *         윤년으로 한다. (2004년, 2008년, …) 100으로 나누어떨어지는 해는 평년으로 한다. (2100년, 2200년,
 *         …) 400으로 나누어떨어지는 해는 다시 윤년으로 한다. (1600년, 2000년, …) 그런데 캠프가 너무 길 경우,
 *         사춘기인 유진이는 캠프에 무단으로 빠질지도 모른다.
 * 
 *         input 첫째 줄에 오늘의 날짜가 주어지고, 두 번째 줄에 D-Day인 날의 날짜가 주어진다. 날짜는 연도, 월, 일순으로
 *         주어지며, 공백으로 구분한다. 입력 범위는 1년 1월 1일부터 9999년 12월 31일 까지 이다. 오늘의 날짜는 항상
 *         D-Day보다 앞에 있다.
 * 
 *         ex. 2008 12 27 2009 1 22
 * 
 *         output 오늘부터 D-Day까지 x일이 남았다면, "D-"를 출력하고 그 뒤에 공백 없이 x를 출력한다. 만약 캠프가
 *         천년 이상 지속된다면 (오늘이 y년 m월 d일이고, D-Day가 y+1000년 m월 d일과 같거나 늦다면) 대신 "gg"를
 *         출력한다. 오늘이 2월 29일인 경우는 주어지지 않는다. ex. D-26
 * 
 *         0001/01/01 ~ 9999/12/31
 * 
 */

public class B_1308 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] today = br.readLine().split(" ");
		int yyyy1 = Integer.parseInt(today[0]);
		int mm1 = Integer.parseInt(today[1]);
		int dd1 = Integer.parseInt(today[2]);

		String[] dDay = br.readLine().split(" ");
		int yyyy2 = Integer.parseInt(dDay[0]);
		int mm2 = Integer.parseInt(dDay[1]);
		int dd2 = Integer.parseInt(dDay[2]);

		int dayCnt1 = (yyyy1 - 1) * 365 + ((yyyy1 - 1) / 4 - (yyyy1 - 1) / 100 + (yyyy1 - 1) / 400);

		int dayCnt2 = (yyyy2 - 1) * 365 + ((yyyy2 - 1) / 4 - (yyyy2 - 1) / 100 + (yyyy2 - 1) / 400);

		int day[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int dayCnt = 0;

		if (((yyyy1 * 10000) + (mm1 * 100) + dd1 + 10000000) <= (yyyy2 * 10000) + (mm2 * 100) + dd2) {
			System.out.println("gg");
		} else {
			if (mm1 == 1) {
				dayCnt1 = dayCnt1 + dd1;
			} else if (mm1 == 2) {
				dayCnt1 = dayCnt1 + day[0] + dd1;

			} else {
				for (int i = 0; i < mm1 - 1; i++) {
					dayCnt1 = dayCnt1 + day[i];
				}
				dayCnt1 = dayCnt1 + dd1;
				if (mm1 > 2 && yyyy1 % 4 == 0 && (yyyy1 % 100 != 0 || yyyy1 % 400 == 0)) {
				    dayCnt1++;
				} else if(yyyy1%100==0 && yyyy1%400!=0) {

				}else {

				}
			}

			if (mm2 == 1) {
				dayCnt2 = dayCnt2 + dd2;
			} else if (mm2 == 2) {
				dayCnt2 = dayCnt2 + day[0] + dd2;
			} else {
				for (int i = 0; i < mm2 - 1; i++) {
					dayCnt2 = dayCnt2 + day[i];
				}
				dayCnt2 = dayCnt2 + dd2;
				if (mm2 > 2 && yyyy2 % 4 == 0 && (yyyy2 % 100 != 0 || yyyy2 % 400 == 0)) {
				    dayCnt2++;
				} else if(yyyy2%100==0 && yyyy2%400!=0) {

				}else {

				}
			}		
			dayCnt = dayCnt2 - dayCnt1;

			// answer part
			System.out.println("D-" + dayCnt);

		}
	}

}
