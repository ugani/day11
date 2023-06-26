package ingerintance;

class Test03{
	public Test03() {
		System.out.println("부모 생성자 실행");
		
	}
}
class TestClass03 extends Test03{
	//테스트클래스03으로 만들었으니
	//일단 자기 자신 클래스를 찾아가고
	//부모클래스를 상속 받고 있으니 부모클래스에 가서
	//부모 클래스 먼저 실행 후 그 다음 자식 클래스를 실행
	public TestClass03() {
		System.out.println("자식 생성자 실행");
	}
}
public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
	}

}
