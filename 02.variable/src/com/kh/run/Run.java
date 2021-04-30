package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_Constant;
import com.kh.variable.C_Overflow;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_Variable a = new A_Variable();
//		a.printValue();
//		a.declareVariable();
//		a.initVariable();
//		a.test();
		
		B_Constant b = new B_Constant();
//		b.finalConstant();
		
		C_Overflow c = new C_Overflow();
//		c.printVariableSize();
		c.overflow();
	}

}
