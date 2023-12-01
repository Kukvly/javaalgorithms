package silver_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1996 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String mine[][] = new String[n][n];
		String rst[][] = new String[n][n];

		// input
		for (int i = 0; i < n; i++) {
			String row = br.readLine();
			for (int j = 0; j < n; j++) {
				rst[i][j] = "0";
				if (Character.isDigit(row.charAt(j))) {
					mine[i][j] = (String.valueOf(row.charAt(j)));
				} else {
					mine[i][j] = ".";
				}
			}

		}

		// 1 x 1
		if (n == 1) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (Character.isDigit(mine[i][j].charAt(0))) {
						rst[i][j] = "*";
					} else {
						rst[i][j] = mine[i][j];

					}
					System.out.print(rst[i][j]);

				}
				System.out.println();
			}

		}

		// 2 x 2
		int sum2 = 0;
		if (n == 2) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (Character.isDigit(mine[i][j].charAt(0))) {
						rst[i][j] = "*";
						sum2 += Integer.parseInt(mine[i][j]);
					}

					else {
						rst[i][j] = rst[i][j];
					}
				}
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (Character.isDigit(mine[i][j].charAt(0))) {
						rst[i][j] = "*";
					}

					else {
						rst[i][j] = String.valueOf(sum2);
					}

					System.out.print(rst[i][j]);
				}
				System.out.println("");
			}
		}

		// logic (n x n)
		int sumPoint = 0;
		if (n > 2) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (Character.isDigit(mine[i][j].charAt(0))) {
						rst[i][j] = "*";
					} else {
						// 4개의 꼭짓점
						// 좌상
						if (i == 0 && j == 0) {
							if (mine[i][j].equals(".")) {
								if (Character.isDigit(mine[i][j + 1].charAt(0))) {
									sumPoint += Integer.parseInt(mine[i][j + 1]);
								}

								if (Character.isDigit(mine[i + 1][j].charAt(0))) {
									sumPoint += Integer.parseInt(mine[i + 1][j]);
								}

								if (Character.isDigit(mine[i + 1][j + 1].charAt(0))) {
									sumPoint += Integer.parseInt(mine[i + 1][j + 1]);
								}
							}
							if (sumPoint >= 10) {
								rst[i][j] = "M";
							} else {
								rst[i][j] = String.valueOf(sumPoint);
							}
						}

						// 좌하
						else if (i == n-1 && j == 0) {
							if (mine[i][j].equals(".")) {
								if (Character.isDigit(mine[i - 1][j].charAt(0))) {
									sumPoint += Integer.parseInt(mine[i - 1][j]);
								}

								if (Character.isDigit(mine[i][j + 1].charAt(0))) {
									sumPoint += Integer.parseInt(mine[i][j + 1]);
								}

								if (Character.isDigit(mine[i - 1][j + 1].charAt(0))) {
									sumPoint += Integer.parseInt(mine[i - 1][j + 1]);
								}
							}
							if (sumPoint >= 10) {
								rst[i][j] = "M";
							} else {
								rst[i][j] = String.valueOf(sumPoint);
							}
						}

						// 우상
						else if (i == 0 && j == n-1) {
							if (mine[i][j].equals(".")) {
								if (Character.isDigit(mine[i][j - 1].charAt(0))) {
									sumPoint += Integer.parseInt(mine[i][j - 1]);
								}
								if (Character.isDigit(mine[i + 1][j].charAt(0))) {
									sumPoint += Integer.parseInt(mine[i + 1][j]);
								}
								if (Character.isDigit(mine[i + 1][j - 1].charAt(0))) {
									sumPoint += Integer.parseInt(mine[i + 1][j - 1]);
								}
							}

							if (sumPoint >= 10) {
								rst[i][j] = "M";
							} else {
								rst[i][j] = String.valueOf(sumPoint);
							}
						}

						// 우하
						else if (i == n - 1 && j == n - 1) {
							if (mine[i][j].equals(".")) {
								if (Character.isDigit(mine[i][j - 1].charAt(0))) {
									sumPoint += Integer.parseInt(mine[i][j - 1]);
								}
								if (Character.isDigit(mine[i - 1][j].charAt(0))) {
									sumPoint += Integer.parseInt(mine[i - 1][j]);
								}
								if (Character.isDigit(mine[i - 1][j - 1].charAt(0))) {
									sumPoint += Integer.parseInt(mine[i - 1][j - 1]);
								}
							}

							if (sumPoint >= 10) {
								rst[i][j] = "M";
							} else {
								rst[i][j] = String.valueOf(sumPoint);
							}
						}

						// 4개의 꼭짓점을 제외한 모서리들의 경우
						int sumLine = 0;

						// 상
						if (i == 0 && j > 0 && j < n - 1) {
							System.out.println("");
							System.out.println("--------------------------");
							
							
							if (mine[i][j].equals(".")) {
								if (Character.isDigit(mine[i][j - 1].charAt(0))) {
									sumLine += Integer.parseInt(mine[i][j - 1]);
									

									System.out.println("1. kuks check: " + sumLine);
								}
								if (Character.isDigit(mine[i][j + 1].charAt(0))) {
									sumLine += Integer.parseInt(mine[i][j + 1]);
									

									System.out.println("2. kuks check: " + sumLine);
								}
								if (Character.isDigit(mine[i + 1][j - 1].charAt(0))) {
									sumLine += Integer.parseInt(mine[i + 1][j - 1]);
									

									System.out.println("3. kuks check: " + sumLine);
								}
								if (Character.isDigit(mine[i + 1][j + 1].charAt(0))) {
									sumLine += Integer.parseInt(mine[i + 1][j + 1]);
									

									System.out.println("4. kuks check: " + sumLine);
								}
								if (Character.isDigit(mine[i+1][j].charAt(0))) {
									sumLine += Integer.parseInt(mine[i + 1][j]);

									System.out.println("5. kuks check: " + sumLine);
								}
								
								System.out.println("6. kuks Sum check: " + sumLine);
								System.out.println("7. kuks Final check: " + String.valueOf(sumLine));
								
							}

							if (sumLine >= 10) {
								rst[i][j] = "M";
							} else {
								rst[i][j] = String.valueOf(sumLine);
								System.out.println("rst["+i+"]["+j+"]: " + rst[i][j]);
							}

							System.out.println("--------------------------");
						}
						

						// 좌
						else if (i > 0 && j == 0 && i < n - 1) {
							if (mine[i][j].equals(".")) {
								if (Character.isDigit(mine[i - 1][j].charAt(0))) {
									sumLine += Integer.parseInt(mine[i - 1][j]);
								}
								if (Character.isDigit(mine[i + 1][j].charAt(0))) {
									sumLine += Integer.parseInt(mine[i + 1][j]);
								}
								if (Character.isDigit(mine[i][j + 1].charAt(0))) {
									sumLine += Integer.parseInt(mine[i][j + 1]);
								}
								if (Character.isDigit(mine[i + 1][j + 1].charAt(0))) {
									sumLine += Integer.parseInt(mine[i + 1][j + 1]);
								}
								if (Character.isDigit(mine[i - 1][j + 1].charAt(0))) {
									sumLine += Integer.parseInt(mine[i - 1][j + 1]);
								}
							}
							if (sumLine >= 10) {
								rst[i][j] = "M";
							} else {
								rst[i][j] = String.valueOf(sumLine);
							}
						}

						// 우
						else if (i < n - 1 && i > 0 && j == n - 1) {
							if (mine[i][j].equals(".")) {
								if (Character.isDigit(mine[i-1][j].charAt(0))) {
									sumLine += Integer.parseInt(mine[i - 1][j]);
								}

								if (Character.isDigit(mine[i+1][j].charAt(0))) {
									sumLine += Integer.parseInt(mine[i + 1][j]);
								}

								if (Character.isDigit(mine[i][j-1].charAt(0))) {
									sumLine += Integer.parseInt(mine[i][j - 1]);
								}
								if (Character.isDigit(mine[i-1][j-1].charAt(0))) {
									sumLine += Integer.parseInt(mine[i - 1][j - 1]);
								}
								if (Character.isDigit(mine[i+1][j-1].charAt(0))) {
									sumLine += Integer.parseInt(mine[i + 1][j - 1]);
								}
							}
							if (sumLine >= 10) {
								rst[i][j] = "M";
							} else {
								rst[i][j] = String.valueOf(sumLine);
							}

						}

						// 하
						else if (i == n - 1 && j > 0 && j < n - 1) {
							if (mine[i][j].equals(".")) {
								if (Character.isDigit(mine[i][j-1].charAt(0))) {
									sumLine += Integer.parseInt(mine[i][j-1]);
								}
								if (Character.isDigit(mine[i][j+1].charAt(0))) {
									sumLine += Integer.parseInt(mine[i][j+1]);
								}
								if (Character.isDigit(mine[i-1][j].charAt(0))) {
									sumLine += Integer.parseInt(mine[i-1][j]);
								}
								if (Character.isDigit(mine[i-1][j-1].charAt(0))) {
									sumLine += Integer.parseInt(mine[i-1][j-1]);
								}
								if (Character.isDigit(mine[i-1][j+1].charAt(0))) {
									sumLine += Integer.parseInt(mine[i-1][j+1]);
								}
							}

							if (sumLine >= 10) {
								rst[i][j] = "M";
							} else {
								rst[i][j] = String.valueOf(sumLine);
							}
						}

						// 내부 값들

						int sumIn = 0;

						if(i!=0 && i!=n-1 && j!=0 && j!=n-1) {
							if (mine[i][j].equals(".")) {
								if (Character.isDigit(mine[i - 1][j].charAt(0))) {
									sumIn += Integer.parseInt(mine[i - 1][j]);
								}

								if (Character.isDigit(mine[i + 1][j].charAt(0))) {
									sumIn += Integer.parseInt(mine[i + 1][j]);
								}

								if (Character.isDigit(mine[i][j - 1].charAt(0))) {
									sumIn += Integer.parseInt(mine[i][j - 1]);
								}

								if (Character.isDigit(mine[i][j + 1].charAt(0))) {
									sumIn += Integer.parseInt(mine[i][j + 1]);
								}

								if (Character.isDigit(mine[i - 1][j - 1].charAt(0))) {
									sumIn += Integer.parseInt(mine[i - 1][j - 1]);
								}

								if (Character.isDigit(mine[i - 1][j + 1].charAt(0))) {
									sumIn += Integer.parseInt(mine[i - 1][j + 1]);
								}

								if (Character.isDigit(mine[i + 1][j - 1].charAt(0))) {
									sumIn += Integer.parseInt(mine[i + 1][j - 1]);
								}

								if (Character.isDigit(mine[i + 1][j + 1].charAt(0))) {
									sumIn += Integer.parseInt(mine[i + 1][j + 1]);
								}
							}
						}
						if (sumIn >= 10) {
							rst[i][j] = "M";
						} else {
							rst[i][j] = String.valueOf(sumIn);
						}
					}
				System.out.print(rst[i][j]);					

				}
				System.out.println();
			}
		}
	}
}