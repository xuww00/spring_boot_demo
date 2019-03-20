package com.xuww.springbootdemo.util;

import java.math.BigDecimal;

public abstract class Constant {

	public static final String DES_YUNPAY_CODE = "12345678";
	public static final String MATCH_MOBILE = "^1\\d{10}$";// 用户手机正则表达式
	public static final String MATCH_PASSWORD = "^(?![^a-zA-Z]+$)(?!\\D+$).{6,16}$";
	public static final String MATCH_SIXNUM = "^\\d{6}$";
	public static final String MATCH_FOURNUM = "^\\d{4}$";
	public static final String DATA_DES_KEY = "VOUmRNqWslkphSjB";
	public static final String OAUTH_DATA_DES_KEY = "2M7gQnLO";
	public static final Integer OAUTH_DATA_SHIFT_KEY = 65432198;
	public static final String MATCH_IDENTITY = "^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$|^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|X)$";// 身份证正则表达式,15位到18位

	public static final String DRIBLET_PAY_LIMIT = "20000";
	public static final String AVIOD_PAY_KEY="aabbcc";
	public static final String VIDEO_SHARE_CODE="VIDEO_SHARE_URL_LIST";

	public static final byte[] R_TOKEN = "tokenV2".getBytes();
	public static final byte[] R_USER_LOGIN_ERR = "errV2".getBytes();//帐户可登录时间
	public static final byte[] R_USER_PAY_ERR = "payErrV2".getBytes();//支付密码错误次数
	public static final byte[] R_USER_PAY_ERR_NUM = "payErrNumV2".getBytes();//支付密码错误次数
	public static final byte[] R_USER_RECHARGE_COUNT = "rechargeCountV2".getBytes();//总充值额度
	public static final byte[] R_USER_TRANSFER_TO_USER_COUNT_DAY = "transferToUserCountDayV2".getBytes();//会员转帐总额
	public static final byte[] R_USER_TRANSFER_TO_USER_COUNT_MONTH = "transferToUserCountMonthV2".getBytes();//会员转帐总额
	public static final int LOGIN_WRONG_TIMES = 5; // 登录错误次数
	public static final int LOGIN_WRONG_SEAL_SECONDS = 600;//登录错误次数超出的限制登录时间，单位：秒 add by zms at 20160901.09.14
	public static final byte[] R_USER_LOGIN_ERR_NUM = "errNumV2".getBytes();//登录密码错误次数

	public static final byte[] R_SMS_CODE_ERR_NUM = "smsErrNumV2".getBytes();
	public static final byte[] R_SMS_CODE_ERR = "smsErrV2".getBytes();

	public static final byte[] R_USER_AVOIDPAY_COUNT = "avoidPay".getBytes();// 每日免密总金额
	public static final byte[] R_USER_CREDIT_REPAY_NOTIFY = "creditRepayNotifyV2".getBytes();//推送记录

	public static final BigDecimal AMOUNT_RECHARGE_LEAST = new BigDecimal(1.00); // 最低充值金额

	public static final BigDecimal AMOUNT_RECHARGE_MOST = new BigDecimal(100000.00); // 最高充值金额

	public static final BigDecimal AMOUNT_SHOPPING_LEAST = new BigDecimal(1.00); // 最低购物金额

	public static final BigDecimal AMOUNT_SHOPPING_MOST = new BigDecimal(100000.00); // 最高购物金额

	public static final BigDecimal AMOUNT_TRANSFER_LEAST = new BigDecimal(1.00); // 最低转账金额

	public static final BigDecimal AMOUNT_TRANSFER_MOST = new BigDecimal(500000.00); // 最高转账金额


	public static final BigDecimal AMOUNT_REDBAG_LEAST = new BigDecimal(1.00); // 最低红包金额

	public static final BigDecimal AMOUNT_REDBAG_MOST = new BigDecimal(300.00); // 最高红包金额

	public static final BigDecimal AMOUNT_UPGRADE_VIP = new BigDecimal(100.0); // 升级VIP金额

	public static final BigDecimal AMOUNT_UPGRADE_DIAMOND = new BigDecimal(1000.0); // 升级金钻金额

	public static final BigDecimal PERCENT_YUNPAY_SERVICE_FEE = new BigDecimal(0.12); // 云付通服务费

	public static final BigDecimal PERCENT_CLOUD_REFERRERFROM_WHENOUT = new BigDecimal(0.03); // 转出推荐人收到云币的百分比——消费时

	public static final BigDecimal PERCENT_CLOUD_REFERRERTO_WHENIN = new BigDecimal(0.02); // 转入推荐人收到云币的百分比——商户收款时

	public static final BigDecimal PERCENT_CLOUD_FROM_WHENOUT = new BigDecimal(0.15); // 用户收到云币的百分比——消费时

	public static final BigDecimal PERCENT_BALANCE_TO_WHENIN = new BigDecimal(0.85); // 用户收到现金的百分比——消费时

	public static final BigDecimal AMOUNT_TRANSFER_CASHBALANCE_MOST = new BigDecimal(500000.00); // 最高转账金额

	public static final String MATCH_EMAIL = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";//邮箱

	public static final String MATCH_USERNAME = "^([\\u4e00-\\u9fa5]+|([a-zA-Z]+\\s?)+)$";// 用户姓名正则表达式1.如果是英文名,可以允许英文名字中出现空格；2.英文名的空格可以是多个，但是不能连续出现多个；3.汉字不能出现空格

	public static final String MATCH_BANKCARD_NO = "^(\\d{16}|\\d{17}|\\d{18}|\\d{19})$"; // 银行卡号正则表达式，16到19位数字



}
