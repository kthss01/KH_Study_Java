package com.kh.operator;

public class C_Arithmetic {
	
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
		
		// 값 % 2 == 0 --> 짝수
		// 값 % 2 == 1 --> 홀수
	
		// 값 % 5 == 0 --> 5의 배수
	}
	
	public void method2() {
		double a = 35;
		double b = 10;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		double sum = a + b;
		System.out.println("a + b = " + sum);
		
		double sub = a - b;
		System.out.println("a - b = " + sub);
		
		double mul = a * b;
		System.out.println("a * b = " + mul);

		double div = a / b;
		System.out.println("a / b = " + div);

		double mod = a % b;
		System.out.println("a % b = " + mod);
		
		int c = 27;
		System.out.println("c = " + c);
		
		double result = a + a * b % c - a / b;
		
		/*
		 * 1. a * b = 350.0 
		 * 2. 350.0 % c = 26.0
		 * 3. a / b = 3.5
		 * 4. a + 26.0 - 3.5 = 57.5
		 */
		
		System.out.println("result = " + result);
	}
	
	public void method3() {
		int a = 5;
		int b = 10;
		int c = (++a) + b; // a = 6, c = 16
		int d = c / a; // d = 2
		int e = c % a; // e = 4
		int f = e++; // f = 4, e = 4(5)
		int g = (--b) + (d--); // b = 9, d = 2(1), g = 11
		int h = 2;
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h); 
		// a = 6(7), c = 15, g = 11(10), e = 6, i = 7
		// 6 + 9 / (15 / 1) * (11 - 1) % (6 + 2)
		// i = 6 + 90 / 15 % 8 = 12
		
		/*
		 * 변수	a		b		c		d		e		f		g		h		i
		 * a	5		10
		 * b	5		10
		 * c	6		10		16
		 * d	6		10		16		2
		 * e	6		10		16		2		4
		 * f	6		10		16		2		4(5)	4
		 * g	6		9		16		2(1)	5		4		11
		 * h	6		9		16		1		5		4		11		2
		 * i	6(7)	9		15		1		6		4		11(10)	2		12
		 * 
		 * i 계산
		 * 6 + 9 / (15 / 4) * (11 - 1) % (6 + 2)
		 * i = 6 + (9 / 3) * 10 % 8 = 6 + (3 * 10) % 8
		 * 	 = 6 + (30 % 8) = 6 + 6 = 12
		 * 
		 * 정리	7		9		15		1		6		4		10		2		12		
		 */
		
		
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		System.out.println("e : " + e);
		System.out.println("f : " + f);
		System.out.println("g : " + g);
		System.out.println("h : " + h);
		System.out.println("i : " + i);
		
	}
}
