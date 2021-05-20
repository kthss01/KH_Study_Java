package com.kh.chap04_wrapper.run;

import com.kh.chap04_wrapper.controller.A_WrapperTest;
import com.kh.chap04_wrapper.controller.B_WrapperStringTest;

public class Run {

	public static void main(String[] args) {
		A_WrapperTest a = new A_WrapperTest();
//		a.method1();
		
		B_WrapperStringTest b = new B_WrapperStringTest();
		b.method1();
	}

}
