package day11;

class TestClass03{
	static TestClass03 t;
	//스태이틱으로 해줘야 클래스로 접근이 가능
	private TestClass03() {
		System.out.println("생성자 실행");
	}
	public static TestClass03 getInstance() {
		//반환타입은 void가 아닌 TestClass03
		System.out.println(t+ ":test 실행");
		if(t==null)
			t = new TestClass03();
		return t;
		//프라이빗으로 만들면 외부로 접근이 불가능하니
		//내부에 있는 메소드를 통해서 접근하게 끔 만듬
		//static으로 만들어줌
		//static으로 만들어주면 클래스로 접근이 가능하게됨
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t01 = TestClass03.getInstance();
		TestClass03 t02 = TestClass03.getInstance();
		TestClass03 t03 = TestClass03.getInstance();
		//클래스에서 객체를 가져옴
		
		System.out.println(t01);
		System.out.println(t02);
		System.out.println(t03);
		//스태이틱으로 만들면 클래스로 접근이 가능
	}

}
