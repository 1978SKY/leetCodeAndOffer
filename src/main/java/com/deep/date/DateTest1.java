package com.deep.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Deep
 * @create 2022-12-02
 */
public class DateTest1 {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();

//		String format = DateUtil.format(date, "yyyy-MM-dd");
//		System.out.println(format);

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String format = dateFormat.format(date);

		Date date1 = dateFormat.parse(format);
		System.out.println(date1);
	}
}
