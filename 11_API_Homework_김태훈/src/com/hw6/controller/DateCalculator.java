package com.hw6.controller;

public class DateCalculator {

	public DateCalculator() {
	}

	public long leapDate() {
		// 1년 1월 1일부터 오늘까지의 총 날 수를 계산
		// 1년부터 현재 연도까지 각 연도가 윤년이면 총 날수에 366일을,
		// 평년이면 365일ㅇ르 더함
		// 해당 현재 연도가 윤년이면 2월을 29일로 평년이면 28일로 더함
		// 월의 날짜 수를 더함
		// (31일 : 1,3,5,7,8,10,12 월
		// 30일 : 4,6,9,11 월)

		int year = 2021; // 올해
		int month = 5;
		int day = 20;

		long[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		long totalDay = 0;
		
		// 년 계산
		for (int i = 1; i < year; i++) {
			for (int j = 0; j < months.length; j++) {
				totalDay += months[j];
				
				// 평년, 윤년 체크 
				if (isLeapYear(i) && j == 1) {
					totalDay++;
				}
			}
		}
		
		// 월 계산
		for (int i = 0; i < month - 1; i++) {
			totalDay += months[i];
			
			if (isLeapYear(year) && i == 1) {
				totalDay++;
			}
		}
		
		// 일 계산
		totalDay += day;

		return totalDay;
	}

	public boolean isLeapYear(int year) {
		// 연도가 윤년이면 true, 평년이면 false 리턴
		// (윤년 : 연도가 4의 배수이면서, 100의 배수가 아니거나 400의 배수가 되는 해)

		return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
	}
}
