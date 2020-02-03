package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		// 숫자야구게임을 만들어주세요
		int a1 = 0;
		int b1 = 0;
		int c1 = 0;
		int a, b, c;
		while (true) {
			a = (int) (Math.random() * 9) + 1;//랜덤 숫자를 생성해주는 명령문
			b = (int) (Math.random() * 9) + 1;
			c = (int) (Math.random() * 9) + 1;
			if (a == b || a == c || b == c) // if문안에 세게의 변수의 값이 하나라도 겹치면
											// coutinue 문으로 다시 올라가서 숫자 배열을 설정한다?
			{
				continue;
			}
			break;// 숫자가 안겹칠경우 while문을 빠져나온다
		}
		System.out.println(a + "" + b + "" + c);
		while (true) { // 무한반복 
			System.out.print("숫자를 입력하세요 :");
			Scanner s = new Scanner(System.in);
			int num = Integer.parseInt(s.nextLine());// num이란 변수에다가 숫자를 입력받는 명령문
			a1 = num / 100; // 1
			b1 = num / 10 % 10; // 123 에서 10으로 나누면 12가 되는데 12를 10으로 또 나누면 2가 남는다
			c1 = num % 10; // 123에서 10으로 나누면 3 남음

			int str = 0;
			int ball = 0; // 스트라이크,볼,아웃의 변수를 선언한다
			int out = 0;

			// 스트라이크 여부 확인 하는 if문
			if (a == a1) {
				str++;
			}
			if (b == b1) {
				str++;
			}
			if (c == c1) {
				str++;
			}
			if (a == b1 || a == c1) {// 볼의 여부를 확인 하는 if문
				ball++;
			}
			if (b == a1 || b == c1) {
				ball++;
			}
			if (c == a1 || c == b1) {
				ball++;
			}
			out = 3 - (str + ball);// 아웃 공식
			if (str == 3) {
				System.out.println("정답입니다!");
				break; // 정답이 맞으면 while문을 멈춰준다
			}
			System.out.println(str + "s " + ball + "b " + out + "o");
		}

	}

}