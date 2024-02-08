package edu.kh.poly.pack3.run;

import edu.kh.poly.pack3.model.dto.Calculator;
import edu.kh.poly.pack3.model.dto.KHCCalculator;
import edu.kh.poly.pack3.model.dto.Machine;

public class CalculatorRun {

	public static void main(String[] args) {
		
		// 인터페이스 장점 : 상속 받은 클래스들의 형태가 똑같거나 비슷하기 때문에
		// 코드 유지 보수 시 참조하는 객체만 변경하면 유지 보수가 완료된다
		
		Calculator cal = new KHCCalculator();
		
		System.out.println(cal.plus(1,5));
		System.out.println(cal.minus(8,5));
		System.out.println(cal.multi(5,5));
		System.out.println(cal.div(5,2));
		System.out.println(cal.mod(5,2));
		System.out.println("---------------------------------");
		System.out.println(cal.sum(5,2,5));
		System.out.println(cal.areaOfCircle(4));
		System.out.println(cal.rangeCheck(100_000_002));
		System.out.println(cal.pow(2, 10));
		System.out.println("2진수 : " + cal.toBinary(15));
		System.out.println("16진수 : " + cal.toHexadecimal(15));
		
		// 참조 변수의 자료형을 Machine으로 강제 형변환 해야지만
		// powerOn(), powerOff() 호출 가능
		
		Machine machine = (Machine)cal;
		machine.powerOn();
		machine.powerOff();
		
	}
	
	
}
