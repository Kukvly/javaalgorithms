package basealgorithms;

import java.util.Scanner;

public class base13_a{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Long A,B,C;
        String str = scan.nextLine();
        String[] numbers = str.split(" ");
        A = Long.parseLong(numbers[0]);
        B = Long.parseLong(numbers[1]);
        C = Long.parseLong(numbers[2]);
        System.out.println(A+B+C);
    }
}