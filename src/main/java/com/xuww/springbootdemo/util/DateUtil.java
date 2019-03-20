package com.xuww.springbootdemo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间工具
 */
public abstract class DateUtil {

	/**
	 * yyyy年MM月dd月
	 */
	public final static String PATTERN1 = "yyyy年MM月dd日";

	/**
	 * yyyy年MM月dd日HH时mm分
	 */
	public final static String PATTERN2 = "yyyy年MM月dd日HH时mm分";

	/**
	 * yyyyMMdd
	 */
	public final static String PATTERN3 = "yyyyMMdd";

	/**
	 * yyyyMMddHHmmss
	 */
	public final static String PATTERN4 = "yyyyMMddHHmmss";

	/**
	 * yyyyMMddHHmmssSSS
	 */
	public final static String YEAR2_MONTH1_DAY1_2 = "yyyyMMddHHmmssSSS";

	/**
	 * yyyy-MM
	 */
	public final static String YEAR2_MONTH2 = "yyyy-MM";

	/**
	 * yyyy-MM-dd
	 */
	public final static String PATTERN5 = "yyyy-MM-dd";

	/**
	 * yyyy-MM-dd HH:mm:ss
	 */
	public final static String PATTERN6 = "yyyy-MM-dd HH:mm:ss";
	
	/**
	 * 根据指定格式获取日期
	 * @param date
	 * @param pattern 只能含有yyyy、MM、dd、HH、mm、ss、SSS
	 * @param strFormat
	 * @return
	 */
	public static Date getDate(Date date, String pattern, String strFormat) {
		
		String source = getFormatStr(date, strFormat);
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			return sdf.parse(source);
		} catch (ParseException e) {
			return null;
		}
	}
	
	/**
	 * 根据指定格式字符串获取日期
	 */
	public static Date getDate(String source, String pattern) {
		if (source==null || "".equals(source)) {
			return null;
		}
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			return sdf.parse(source);
		} catch (ParseException e) {
			return null;
		}
	}
	
	/**
	 * 日期增加天数
	 */
	public static Date addDay(Date date, int day) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		
		c.set(Calendar.DAY_OF_YEAR, c.get(Calendar.DAY_OF_YEAR) + day);
		
		return c.getTime();
	}

	/**
	 * 日期增加月
	 */
	public static Date addMonth(Date date, int month) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.MONTH, month);
		return c.getTime();
	}
	/**
	 * 日期增加年
	 */
	public static Date addYear(Date date, int year) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.YEAR, year);
		return c.getTime();
	}
	/**
	 * 获取指定格式的日期字符串
	 */
	public static String getFormatStr(Date date, String strFormat) {
		SimpleDateFormat simple = new SimpleDateFormat(strFormat);
		return simple.format(date);
	}
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println(addDay(date, -1));
	}
}
