package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_Constant;
import com.kh.variable.C_Overflow;
import com.kh.variable.D_Cast;
import com.kh.variable.E_Printf;
import com.kh.variable.F_KeyboardInput;

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
//		c.overflow();
		
		D_Cast d = new D_Cast();
//		d.rule1();
//		d.rule2();
//		d.stringTest();
		
		E_Printf e = new E_Printf();
//		e.printfMethod();
		
		F_KeyboardInput f = new F_KeyboardInput();
//		f.inputScanner1();
//		f.inputScanner2();
		f.inputScanner3();
	}

}
