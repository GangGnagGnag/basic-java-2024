package ch06.sec13.exam02.package2;	 		//<-패키지가 다름

import ch06.sec13.exam02.package1.*;

public class C {
//	필드선언
	A a1 = new A(true);		//o
//	A a2 = new A(1);		//x	<-디폴트 생성자 접근 불가능
//	A a3 = new A("문자열");	//x <-private생성자 접근 불가능
	
}
