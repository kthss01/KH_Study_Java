package com.hw3.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SetDate {
	
	private Calendar cal = Calendar.getInstance();
	
	public SetDate() {
	}
	
	public String todayPrint() {
		// 오늘의 년, 월, 일, 시, 분, 초를 각 변수에 담은 후
		// 오늘을 String으로 리턴
		
		Date date = new Date();
		cal.setTime(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 h시 mm분 ss초");
		
		return sdf.format(cal.getTime());
		
	}
	
	public String setDay() {
		// "2011년 3월 21일 월요일을 세팅하여 출력
		
		cal.set(2011, 3 - 1, 21);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		
		return sdf.format(cal.getTime());
	}
}
