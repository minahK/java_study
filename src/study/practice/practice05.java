package study.practice;

import java.util.Scanner;

public class practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;

		if (num > 0) {
			System.out.println("양수");
		} else if (num < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		}
		
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("첫 번째 숫자를 입력하세요: ");
		int num1 = scanner.nextInt();

		System.out.println("두 번째 숫자를 입력하세요: ");
		int num2 = scanner.nextInt();

		System.out.println("더하기: " + num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println("빼기: " + num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println("곱하기: " + num1 + " * " + num2 + " = " + (num1 * num2));

		System.out.println("나누기: " + num1 + " / " + num2 + " = " + ((double) num1 / num2));

	}

}
