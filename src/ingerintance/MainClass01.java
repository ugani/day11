package ingerintance;

import java.util.ArrayList;

/*
 * 상속
 * -new 연산 없이 특정 클래스의 기능을 사용 할 수 있다.
 * -extends를 통해 상속을 받는다. extends-> 상속받겠다는 기능
 * -부모클래스의 특정기능을 
 *  새로운 기능으로 변경하여 사용할수있다.(overriding)
 */
class TestClass01 extends ArrayList<String>{
	//자식클래스↑			//부모클래스↑
					//extends로 어레이리스트를 상속 받음
	//extends를 사용하지 않을 경우
	//new로 객체를 생성하고 클래스를 생성해야하지만
	//extends의 상속으로 간결하게 코드 작성이 가능하다
	public void test() {
		System.out.println("test실행");
	}
}

public class MainClass01 {
public static void main(String[] args) {
	TestClass01 t =  new TestClass01();
	t.test();
	t.add("안요녕하세");
	System.out.println(t.get(0));
						//어레이리스트 0번째에 있는걸
						//get(0)을 통해 가져와서 출력
}
}
