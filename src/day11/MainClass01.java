package day11;

/*
 * 싱글톤
 * - 하나의 객체를 공유하는것
 * (하나의 공간을 사용함)
 */
class TestClass01{
int num;
static int cnt;
public TestClass01() {
	cnt++;
	System.out.println(cnt + "객체생성");
}
}
public class MainClass01 {
	public static void main(String[] args) {
		TestClass01 t01 = new TestClass01();
		TestClass01 t02 = new TestClass01();
		TestClass01 t03 = new TestClass01();
		
		System.out.println(t01+": "+t01.num);
		System.out.println(t02+": "+t02.num);
		System.out.println(t03+": "+t03.num);
	}

}
