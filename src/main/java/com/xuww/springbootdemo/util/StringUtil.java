package com.xuww.springbootdemo.util;

public abstract class StringUtil {
	 /*
	  * 如果串为null返回空串，否则返回源串
	  */
	public static String dealNull(String str) {
		if(str != null){
			return str;
		}
		return "";
	}

	/**
	 * @author linjunqin
	 * @Description 不足位数，左侧补0
	 * @param
	 * @date 2017-3-9 上午8:44:07
	 */
	public static String flushLeft(int length, String content){
		char c = '0';
		String str = "";
		String cs = "";
		if (content.length() > length){
			str = content;
		}else{
			for (int i = 0; i < length - content.length(); i++){
				cs = cs + c;
			}
		}
		str = cs+content;
		return str;
	}
}
