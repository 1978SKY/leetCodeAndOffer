package com.deep;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Deep
 * @create 2022-09-21
 */
public class DateTest {
	public static void main(String[] args) {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

		Date date = new Date();
//		String format = dateFormat.format(date);
		Date date1 = new Date();
//		SimpleDateFormat dateFormat1 = new SimpleDateFormat("HH:mm");
//		String format1 = dateFormat1.format(date1);
		DateTest dateTest = new DateTest();


		System.out.println(dateTest.getAppointTime(date,date1));
	}

	private String getAppointTime(Date start, Date end) {
		SimpleDateFormat startFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		SimpleDateFormat endFormat = new SimpleDateFormat("HH:mm");
		if (start == null) {
			return "";
		} else if (end == null) {
			return startFormat.format(start);
		}
		return startFormat.format(start) + "-" + endFormat.format(end);
	}

}
