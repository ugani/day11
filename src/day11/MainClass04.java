package day11;

public class MainClass04 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		//커런트타임밀리스는 시간을 초 단위로 출력함
		System.out.println(time);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		2000을 넣으면 2초 기다리라는뜻
//		트라이 캐치를 넣어줘야 위 구문을 사용 가능
		
		System.out.println("출력");
		//출력을 하면 2초 뒤에 "출력" 이라는 문장이 출력됨
		
		long end  = System.currentTimeMillis();
		System.out.println(end - time);
		System.out.println((end - time)/1000+"초 사용");
	}

}
