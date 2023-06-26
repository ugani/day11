package ingerintance;

class Test07{
	protected int num; //프라이빗으로 변수 생성함
	public void test() {System.out.println("부모 test");}
}
class TestClass07 extends Test07{
	public void display() {
		num = 100;
		//아무리 상속 받은 자식이라도 프라이빗으로 만들어진건 접근 못함
		//단, protected를 사용하면 프라이빗 기능을 가지고 있지만
		//상속받은 자식클래스는 접근이 가능하도록 해준다
		//( 프라이빗과 퍼블릭의 반반)
		
		System.out.println("display 실행");
		this.test();
		//디스가 생략되도 자식에 있는 테스트가 실행되지만
		//디스가 있으면 가독성을 높여서 사용이 가능하다.
	}
	public void test() {
		System.out.println("자식~test");
		//만약 나한테도 test가 있으면 부모껄 가져오지 않고
		//나한테 있는 test를 실행함
	}
}

public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 t = new TestClass07();
		t.display();
	}

}
