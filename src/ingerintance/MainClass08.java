package ingerintance;
//다중 상속

class A{
	public void a() {System.out.println("aaa");}
}

class B extends A{
	public void b() {System.out.println("bbb");}
	
}

class C extends B{
	public void c() {System.out.println("ccc");}
}
//위와 같이 물려서 물려서 상속을 받을 수 있음
//자바에선 하나의 클래스에서 한번에 여러개를 상속 받을 순 없지만
//물려서 다중으로 상속을 받을 수 있다.

public class MainClass08 {
	public static void main(String[] args) {
		C c =  new C();
		c.a();
		c.b();
		c.c();
		
	}

}
