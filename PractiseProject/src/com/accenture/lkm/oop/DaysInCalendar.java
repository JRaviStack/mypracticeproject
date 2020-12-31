package com.accenture.lkm.oop;

import java.time.Year;
import java.time.YearMonth;

public class DaysInCalendar {
	public int calculateDays(int givenYear) {
		return  Year.of(givenYear).length();
	}
	public int calculateDays(int givenYear, int months) {
		return Year.of(givenYear).length();
	}

	public static void main(String[] args) {
		DaysInCalendar dic = new DaysInCalendar();
		System.out.println(dic.calculateDays(1));
		System.out.println(dic.calculateDays(2015, 3));

	}

}
