package ingerintance;

class Test04{
	public Test04(String s) {
		System.out.println(s +" 부모 생성자 실행");
	}
	
}
class TestClass04 extends Test04{
	public TestClass04() {
		//상속을 썻는데 에러가 발생하면 
		//부모생성자에 값을 전달해줘야 에러가 발생하지 않음
		super("값 전달");
		//슈퍼 라는 키워드를 써주면 에러가 발생하지 않음!!
		System.out.println("자식 생성자 실행");
	}
	
}

public class MainClass04 {
	public static void main(String[] args) {
		TestClass04 t = new TestClass04();
	}

}
