package ingerintance;

class Calc02{
	public void display() {
		System.out.println("나는 계산기야~");
	}
}
class Computer02 extends Calc02{
	//	↑자식클래스	    	↑부모클래스
	//부모클래스의 기능을 자식클래스가 상속받아서 사용
	Calc02 c;
	public Computer02() {c = new Calc02();}
	
	public void print02() {
		System.out.println("print");
		display();
		//부모클래스의 디스플래이 기능을 사용
	}
	
	public void print() {
		System.out.println("나는 컴퓨터야");
	}
}
public class MainClass02 {
	public static void main(String[] args) {
//		Calc02 c = new Calc02();
//		c.display();
		Computer02 com = new Computer02();
		com.print();
		com.display();
		//display는 Calc02의 기능이고
		//com은 컴퓨터02의 객체인데
		//Calc02의 기능을 상속 받아서
		//부모클래스의 기능을 자식클래스가 사용할수있다.
		
		com.print02();
		//프린트02에서 부모클래스의 디스플레이 기능을
		//가져와서 사용하게함
		//(나한테 디스플페이 기능이 없으니 부모의 기능을 가져옴)
	}

}
