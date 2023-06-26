package day11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass05 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		SimpleDateFormat simple = 
				new SimpleDateFormat("yyyy년 MM월 dd일 aa hh 시 mm분 ss초");
			//심플데이터포맷은 사용자가 원하는 시간으로 변경해주는 기능
		
		String date = simple.format(time);
		System.out.println(date);
		
		System.out.println("=================");
		Date d = new Date();
		System.out.println(d);
		System.out.println();
		//심플포멧 데이터에 d를 넣고 date에 저장하고 출력을하면
		//심플포멧 방식과 똑같이 출력됨
		date = simple.format(d);
		System.out.println(date);
		//Date는 두가지 기능이 있는데 spl은 데이터베이스에 저장할때 사용함
		//자바 유틸로 사용함
		//Date도 현재 시간을 가져오는 기능
	}

}
