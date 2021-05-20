package com.hw6.run;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import com.hw6.controller.DateCalculator;

public class Run {

	public static void main(String[] args) {

		DateCalculator totalDay = new DateCalculator();
		
		// Calendar 클래스를 이용한다.
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		
		// test
//		System.out.println("year : " + cal.get(Calendar.YEAR));
		
		// 평년인지 윤년이지 isLeapYear()를 통해서 출력한다.
		System.out.printf("올해는 %s입니다.\n", 
				totalDay.isLeapYear(
						cal.get(Calendar.YEAR)) ? "윤년" : "평년");
		
		// check
//		String start = "00010101";
////		String start = "20210519";
//		String end = "20210520";
//		String format = "yyyyMMdd";
//		
//		SimpleDateFormat sdf = new SimpleDateFormat(format);
//		
//		try {
//			Date startDate = sdf.parse(start);
//			Date endDate = sdf.parse(end);
//			
//			long diffDay = (endDate.getTime() - startDate.getTime()) / (24*60*60*1000);
//			System.out.println(diffDay + "일");
//		} catch(ParseException e) {
//			e.printStackTrace();
//		}
		
//		LocalDateTime today = LocalDateTime.now();
//		LocalDateTime start = LocalDateTime.of(1, 1, 1, 0, 0);
////		LocalDateTime start = LocalDateTime.of(2021, 5, 19, 0, 0);
//		// LocalDate는 Duration에서 지원 x
//		// 시작일 제외
//		System.out.println("총 날짜 수 : " + Duration.between(start, today).toDays()); 
		
		// 평년과 윤년을 고려해 leapDate()로 총 날짜 수를 출력한다.
		System.out.println("총 날짜 수 : " + totalDay.leapDate());
	}

}
