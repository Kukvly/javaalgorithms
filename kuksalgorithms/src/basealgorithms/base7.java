/**
 * 수열의 합
 * N: 합
 * L: 길이가 적어도 L
 * 가장 짧은 연속된 음이 아닌 정수 리스트 출력
 * N <= 1000000000, 2<=L<=100 [N, L 자연수]
 * 만약 리스트의 길이가 100보다 작거나 같으면, 
 * 연속된 수를 첫째 줄에 공백으로 구분하여 출력한다. 
 * 만약 길이가 100보다 크거나 그러한 수열이 없을 때는 -1을 출력한다.
 */

/**
 * 총합: n
 * 길이: l
 * 
 * 
 * 
 * 35 56789
 * 
 * 
 * 
 * 홀수갯수
 * 18 5+6+7
 * ([0]+[l-1])*(l/2) = n
 * 
 * n을 쪼개서 쪼갠 값들의 중심 값을 잡아 왼쪽으로는 1씩 빼주고 오른쪽으로는 1씩 더해준다.
 * 
 * ex.
 * n=35
 * l=5
 * nList[0] = 5
 * nList[1] = 6
 * nList[2] = 7
 * nList[3] = 8
 * nList[4] = 9
 * 
 * 
 * 
 * case1.
 * n % 2 = 1 -> 합이 홀수 -> 중심값이 1개 있다.
 * 중심값 = n/l
 * nList[l].length() = l
 * 
 * 
 * 중앙 인덱스: [(l-1)/2]
 * 
 * 
 *
 *                    
 * case2.
 * 
 * l=4
 * nList[0] = x
 * nList[1] = x+1
 * nList[2] = x+2
 * nList[3] = x+3
 * 
 * nList[i] = x+i
 * 
 * l=5
 * nList[0] = x
 * nList[1] = x+1
 * nList[2] = x+2
 * nList[3] = x+3
 * nList[4] = x+4
 * 
 * 5(x-1)
 * x-l +l
 * x+i
 * 
 * (nTemp/lTemp +1) = x
 * (nTemp/lTemp +1) == nList[0]
 * (nTemp/lTemp) = x-1
 * 
 * <정답>
 * n = l(x-1)
 * n/l = x-1
 * x = n/l + 1
 * 
 * double nTemp = n;
 * double lTemp = l;
 * 
 * x + x+1 + x+2 + x+3 + ... + x+(l-1)
 * l*x + sum(1~l)
 * sum(1~l) = (l/2)
 * 
 * if ((n-x)%(l-1)==0){
 * 연산
 * }
 *
 * 
 * 
 * (i+1 = l) -> 마지막 i + 1 = l (수열의 길이)
 * 
 * 
 * l*(x+1) - 1 = n
 * (x+1) * l = n+1
 * x+1 = (n+1)/l
 * x = (n+1)/l -1
 * 
 * 
 * int isum = 0;
 * isum = isum + i;
 * n = nList[0]*(i+1) + isum
 * 
 * n = x+y+z
 * 
 *
 * case3.
 * n = (x+1) + (x+2) + ... (x+l)
 * 
 * n = lx + ((l+1)*l)/2
 * lx = n - (l*(l+1))/2
 * if((n - (l*(l+1))/2)%l == 0)
 * {
 * 	연산실행
 * }
 * else{
 * 	System.out.println("-1");
 * }
 * 
 * 
 */

package basealgorithms;

import java.util.Scanner;

public class base7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int l = input.nextInt();

		for (int i = l; i < 101; i++) {
			int x = n - (i * (i + 1) / 2);

			if (x % i == 0) {
				x = (x / i);

				if (x >= -1) {
					for (int j = 1; j < (i+1); j++) {
						System.out.print(x + j + " ");
					}
					break;
				}

			} else {
				System.out.print("-1");
				break;
			}

		}

	}

}