package com.kh.run;

import com.kh.variable.A_Variable; //해당 클래스를 가져다 쓸거라고 선언
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.C_cast;
import com.kh.variable.D_Printf;


//main 메소드만 갖고있는 실행용 클래스
public class VariableRun {
	
	public static void main(String[] args) {
		
		// A_Variable 클래스를 대변할 이름을 생성 (new)
		A_Variable a = new A_Variable();
		
		// 대변할 이름을 가지고 메소드를 호출
		//대변할이름.호출할메소드명();
		//a.printSalary();
		
		//a.declareVariable();
		
		//a.initVariable();
		
		//a.constant();
		
		//a.overflow();
		
		B_KeyboardInput b = new B_KeyboardInput();
		
		//b.inputTest1();
		
		//b.inputTest2();
		
		//b.inputTest3();
		
		//b.inputTest4();
		
		//b.inputTest5();
		
		//b.inputTest6();
		
		C_cast c = new C_cast();
		
		
		//c.autoCasting();
		
		//c.forceCasting();
		
		D_Printf d = new D_Printf();
		
		//d.printfTest();
		
		
		

	}
	
	

}
