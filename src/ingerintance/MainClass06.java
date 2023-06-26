package ingerintance;

class Test06{
	public int num; //변수 하나 생성
	public Test06() {num=100;}
}
class TestClass06 extends Test06{
	public void test() {
		int num = 7777777;
		//자기 자신에도 num이라는 변수가 있으면
		//나한테 있는 값을 먼저 실행함
		System.out.println(num);
		//자기 자신한테 변수 num이 없으면
		//부모클래스를 찾아가서 num을 가져옴
		System.out.println(super.num);
		//나한테도 num이 있고 부모한테 있는 num을
		//가지고 올때는 super를 써주면 가져올수있음
	}
}
public class MainClass06 {
public static void main(String[] args) {
	TestClass06 t = new TestClass06();
	t.test();
}
}
