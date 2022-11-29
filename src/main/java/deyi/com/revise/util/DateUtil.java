///**
// * Copyright (c) 2015-2016, Chill Zhuang 庄骞 (smallchill@163.com).
// * <p>
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// * <p>
// * http://www.apache.org/licenses/LICENSE-2.0
// * <p>
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//package deyi.com.revise.util;
//
//import org.apache.commons.lang3.StringUtils;
//import org.apache.commons.lang3.time.DateFormatUtils;
//import org.apache.commons.lang3.time.DateUtils;
//import org.docx4j.wml.P;
//
//import java.sql.Timestamp;
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//
//public class DateUtil {
//
//	/**
//	 * 缺省日期时间格式yyyy-MM-dd HH:mm:ss
//	 */
//	public static final String C_TIME_PATTON_DEFAULT = "yyyy-MM-dd HH:mm:ss";
//
//	/**
//	 * 日期时间格式2 yyyy-MM-dd HH:mm
//	 */
//	public static final String C_TIME_PATTON_2 = "yyyy-MM-dd HH:mm";
//	/**
//	 * 缺省日期格式yyyy-MM-dd
//	 */
//	public static final String C_DATE_PATTON_DEFAULT = "yyyy-MM-dd";
//	/**
//	 * 日期格式yyyyMM
//	 */
//	public static final String C_DATA_PATTON_YYYYMM = "yyyyMM";
//	/**
//	 * 日期格式yyyyMMdd
//	 */
//	public static final String C_DATA_PATTON_YYYYMMDD = "yyyyMMdd";
//	/**
//	 * 日期格式yyyyMMddHHmmss
//	 */
//	public static final String C_DATA_PATTON_YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
//	/**
//	 * 时间格式HH:mm:ss
//	 */
//	public static final String C_TIME_PATTON_HHMMSS = "HH:mm:ss";
//
//	private static final int C_ONE_SECOND = 1000;
//	private static final int C_ONE_MINUTE = 60 * C_ONE_SECOND;
//	private static final int C_ONE_HOUR = 60 * C_ONE_MINUTE;
//	@SuppressWarnings("unused")
//	private static final long C_ONE_DAY = 24 * C_ONE_HOUR;
//
//	/**
//     * 秒与毫秒的倍数
//     */
//    public static final int MULTIPLE_MSEC = 1;
//    /**
//     * 秒与毫秒的倍数
//     */
//    public static final int MULTIPLE_SEC  = 1000;
//    /**
//     * 分与毫秒的倍数
//     */
//    public static final int MULTIPLE_MIN  = 60000;
//    /**
//     * 时与毫秒的倍数
//     */
//    public static final int MULTIPLE_HOUR = 3600000;
//    /**
//     * 天与毫秒的倍数
//     */
//    public static final int MULTIPLE_DAY  = 86400000;
//
//    /**
//     * 获取YYYY格式
//     */
//    public static String getYear() {
//        return formatDate(new Date(), "yyyy");
//    }
//
//    /**
//     * 获取YYYY格式
//     */
//    public static String getYear(Date date) {
//        return formatDate(date, "yyyy");
//    }
//
//    /**
//     * 获取YYYY-MM-DD格式
//     */
//    public static String getDay() {
//        return formatDate(new Date(), "yyyy-MM-dd");
//    }
//
//    /**
//     * 获取YYYY-MM-DD格式
//     */
//    public static String getDay(Date date) {
//        return formatDate(date, "yyyy-MM-dd");
//    }
//
//    /**
//     * 获取YYYYMMDD格式
//     */
//    public static String getDays() {
//        return formatDate(new Date(), "yyyyMMdd");
//    }
//
//    /**
//     * 获取YYYYMMDD格式
//     */
//    public static String getDays(Date date) {
//        return formatDate(date, "yyyyMMdd");
//    }
//
//    /**
//     * 获取YYYY-MM-DD HH:mm:ss格式
//     */
//    public static String getTime() {
//        return formatDate(new Date(), "yyyy-MM-dd HH:mm:ss");
//    }
//
//    /**
//     * 获取YYYY-MM-DD HH:mm:ss.SSS格式
//     */
//    public static String getMsTime() {
//        return formatDate(new Date(), "yyyy-MM-dd HH:mm:ss.SSS");
//    }
//
//    /**
//     * 获取YYYYMMDDHHmmss格式
//     */
//    public static String getAllTime() {
//        return formatDate(new Date(), "yyyyMMddHHmmss");
//    }
//
//    /**
//     * 获取YYYY-MM-DD HH:mm:ss格式
//     */
//    public static String getTime(Date date) {
//        return formatDate(date, "yyyy-MM-dd HH:mm:ss");
//    }
//
//    public static String formatDate(Date date, String pattern) {
//        String formatDate = null;
//        if (StringUtils.isNotBlank(pattern)) {
//            formatDate = DateFormatUtils.format(date, pattern);
//        } else {
//            formatDate = DateFormatUtils.format(date, "yyyy-MM-dd");
//        }
//        return formatDate;
//    }
//
//    /**
//     * 日期比较，如果s>=e 返回true 否则返回false)
//     *
//     * @author luguosui
//     */
//    public static boolean compareDate(String s, String e) {
//        if (parseDate(s) == null || parseDate(e) == null) {
//            return false;
//        }
//        return parseDate(s).getTime() >= parseDate(e).getTime();
//    }
//
//    /**
//     * 日期比较，如果s>=e 返回true 否则返回false)
//     * @author luguosui
//     */
//    public static boolean compareDate(Date s, Date e) {
//        if (s == null || e == null) {
//            return false;
//        }
//        return s.getTime() >= e.getTime();
//    }
//
//    /**
//     * 日期比较，如果s>=e 返回true 否则返回false)
//     *
//     * @author luguosui
//     */
//    public static boolean compareDate2(String s, String e) {
//        if (parseDate(s) == null || parseDate(e) == null) {
//            return false;
//        }
//        return parseDate(s).getTime() > parseDate(e).getTime();
//    }
//
//    /**
//     * 格式化日期
//     */
//    public static Date parseDate(String date) {
//        return parse(date, "yyyy-MM-dd");
//    }
//
//    /**
//     * 格式化日期
//     */
//    public static Date parseTimeMinutes(String date) {
//        return parse(date, "yyyy-MM-dd HH:mm");
//    }
//
//    /**
//     * 格式化日期
//     */
//    public static Date parseTime(String date) {
//        return parse(date, "yyyy-MM-dd HH:mm:ss");
//    }
//
//    /**
//     * 格式化日期
//     */
//    public static Date parse(String date, String pattern) {
//        try {
//            return DateUtils.parseDate(date, pattern);
//        } catch (ParseException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    /**
//     * 格式化日期
//     */
//    public static String format(Date date, String pattern) {
//        return DateFormatUtils.format(date, pattern);
//    }
//
//    /**
//     * 把日期转换为Timestamp
//     */
//    public static Timestamp format(Date date) {
//        return new Timestamp(date.getTime());
//    }
//
//    /**
//     * 校验日期是否合法
//     */
//    public static boolean isValidDate(String s) {
//        return parse(s, "yyyy-MM-dd HH:mm:ss") != null;
//    }
//
//    /**
//     * 校验日期是否合法
//     */
//    public static boolean isValidDate(String s, String pattern) {
//        return parse(s, pattern) != null;
//    }
//
//    public static int getDiffYear(String startTime, String endTime) {
//        DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
//        try {
//            int years = (int) (((fmt.parse(endTime).getTime() - fmt.parse(
//                    startTime).getTime()) / (1000 * 60 * 60 * 24)) / 365);
//            return years;
//        } catch (Exception e) {
//            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
//            return 0;
//        }
//    }
//
//    /**
//     * <li>功能描述：时间相减得到天数
//     */
//    public static long getDaySub(String beginDateStr, String endDateStr) {
//        long day = 0;
//        SimpleDateFormat format = new SimpleDateFormat(
//                "yyyy-MM-dd");
//        Date beginDate = null;
//        Date endDate = null;
//
//        try {
//            beginDate = format.parse(beginDateStr);
//            endDate = format.parse(endDateStr);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        day = (endDate.getTime() - beginDate.getTime()) / (24 * 60 * 60 * 1000);
//        // System.out.println("相隔的天数="+day);
//
//        return day;
//    }
//
//
//    /**
//     * 计算两个时间相差多少天   排除掉周六周日
//     * @throws ParseException
//     */
//    public static int getDaysAndNotWeekend(String beginDateStr, String endDateStr) {
//    	int day = 0;
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//
//        if(ToolUtil.isEmpty(beginDateStr) || ToolUtil.isEmpty(endDateStr)) {
//        	return 0;
//        }
//
//        Date beginDate = null;
//        Date endDate = null;
//        try {
//            beginDate = format.parse(beginDateStr);
//            endDate = format.parse(endDateStr);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        Calendar c1 = Calendar.getInstance();
//        Calendar c2 = Calendar.getInstance();
//        c1.setTime(beginDate);
//        c2.setTime(endDate);
//        while(c1.before(c2)) {
//        	if(Calendar.SATURDAY != c1.get(Calendar.DAY_OF_WEEK) && Calendar.SUNDAY != c1.get(Calendar.DAY_OF_WEEK)) {
//        		day++;
//        	}
//        	c1.add(Calendar.DATE, 1);
//        }
//        return day;
//    }
//
//
//
//
//
//    /**
//     * 得到n天之后的日期
//     */
//    public static String getAfterDayDate(String days) {
//        int daysInt = Integer.parseInt(days);
//
//        Calendar canlendar = Calendar.getInstance(); // java.util包
//        canlendar.add(Calendar.DATE, daysInt); // 日期减 如果不够减会将月变动
//        Date date = canlendar.getTime();
//
//        SimpleDateFormat sdfd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String dateStr = sdfd.format(date);
//
//        return dateStr;
//    }
//
//    /**
//     * 得到n天之后是周几
//     */
//    public static String getAfterDayWeek(String days) {
//        int daysInt = Integer.parseInt(days);
//
//        Calendar canlendar = Calendar.getInstance(); // java.util包
//        canlendar.add(Calendar.DATE, daysInt); // 日期减 如果不够减会将月变动
//        Date date = canlendar.getTime();
//
//        SimpleDateFormat sdf = new SimpleDateFormat("E");
//        String dateStr = sdf.format(date);
//
//        return dateStr;
//    }
//
//    /**
//	 * 时间转换为字符串，时分秒全为0按yyyy-MM-dd格式转换，否则按yyyy-MM-dd HH:mm:ss格式转换
//	 * @param aTs_Datetime
//	 * @return String 时间转换为字符串，时分秒全为0按yyyy-MM-dd格式转换，否则按yyyy-MM-dd HH:mm:ss格式转换
//	 */
//	public static String autoFormat(Date aTs_Datetime) {
//		if (format(aTs_Datetime, C_TIME_PATTON_DEFAULT).substring(11).equals("00:00:00")) {
//			return format(aTs_Datetime, C_DATE_PATTON_DEFAULT);
//		} else {
//			return format(aTs_Datetime, C_TIME_PATTON_DEFAULT);
//		}
//	}
//	/**
//	 * 判断是否是周末
//	 * @return
//	 */
//	public static boolean isWeekEnd() {
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(new Date());
//		if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//
//
//	/**
//     * 得到n天之后的日期
//     */
//    public static String getAfterDayDate(String days, String pattern) {
//        int daysInt = Integer.parseInt(days);
//
//        Calendar canlendar = Calendar.getInstance(); // java.util包
//        canlendar.add(Calendar.DATE, daysInt); // 日期减 如果不够减会将月变动
//        Date date = canlendar.getTime();
//
//        SimpleDateFormat sdfd = new SimpleDateFormat(pattern);
//        String dateStr = sdfd.format(date);
//
//        return dateStr;
//    }
//
//    /**
//     * 得到当前输入时间或当前时间的下一个月日期
//     */
//    public static String getNextMonth(String days, String pattern) {
//
//        Calendar canlendar = Calendar.getInstance(); // java.util包
//        canlendar.setTime(StringUtils.isBlank(days) ? new Date() : DateUtil.parse(days,"yyyyMMdd"));
//        canlendar.add(Calendar.MONTH, 1); //下一月
//
//        SimpleDateFormat sdfd = new SimpleDateFormat(StringUtils.isBlank(pattern) ? "yyyyMMdd" : pattern);
//        String dateStr = sdfd.format(canlendar.getTime());
//
//        return dateStr;
//    }
//
//    /**
//     * 得到当前输入时间或当前时间的上一个月日期
//     */
//    public static String getLastMonth(String days, String pattern) {
//
//        Calendar canlendar = Calendar.getInstance(); // java.util包
//        canlendar.setTime(StringUtils.isBlank(days) ? new Date() : DateUtil.parse(days,"yyyyMMdd"));
//        canlendar.add(Calendar.MONTH, -1); //上一月
//
//        SimpleDateFormat sdfd = new SimpleDateFormat(StringUtils.isBlank(pattern) ? "yyyyMMdd" : pattern);
//        String dateStr = sdfd.format(canlendar.getTime());
//
//        return dateStr;
//    }
//
//    /**
//     * 得到当前输入时间或当前时间的下一个年日期
//     */
//    public static String getNextYear(String days, String pattern) {
//
//        Calendar canlendar = Calendar.getInstance(); // java.util包
//        canlendar.setTime(StringUtils.isBlank(days) ? new Date() : DateUtil.parse(days,pattern));
//        canlendar.add(Calendar.YEAR, 1); //下一年
//
//        SimpleDateFormat sdfd = new SimpleDateFormat(StringUtils.isBlank(pattern) ? "yyyyMMdd" : pattern);
//        String dateStr = sdfd.format(canlendar.getTime());
//
//        return dateStr;
//    }
//
//    /**
//     * 得到当前输入时间或当前时间的上一个年日期
//     */
//    public static String getLastYear(String days, String pattern) {
//
//        Calendar canlendar = Calendar.getInstance(); // java.util包
//        canlendar.setTime(StringUtils.isBlank(days) ? new Date() : DateUtil.parse(days,"yyyyMMdd"));
//        canlendar.add(Calendar.YEAR, -1); //上一年
//
//        SimpleDateFormat sdfd = new SimpleDateFormat(StringUtils.isBlank(pattern) ? "yyyyMMdd" : pattern);
//        String dateStr = sdfd.format(canlendar.getTime());
//
//        return dateStr;
//    }
////    public static void main(String[] args) {
////    	System.out.println(getSpecifiedDayAfter("2022-03-18", 2));
////	}
////    public static void main(String[] args) {
////		System.out.println(getAfterDayDate("-1","yyyy-MM-dd"));
////	}
//
//    public static String fillZero(String date) {
//    	date = date.trim().replace("@", "-");//因为IT安全策略不允许传-，顾转为@后，在此处转回
//    	String flag = "-";
//    	if(date.indexOf("/")>-1) {
//    		flag = "/";
//    	}
//    	String[] dates = date.split(flag);
//		if(Integer.valueOf(dates[1]).intValue()<10 && dates[1].length()==1) {
//			dates[1] = "0"+dates[1];
//		}
//		if(Integer.valueOf(dates[2]).intValue()<10 && dates[2].length()==1) {
//			dates[2] = "0"+dates[2];
//		}
//		return dates[0]+flag+dates[1]+flag+dates[2];
//    }
//
//        /**
//         * 获得指定日期的后一天
//         * @param specifiedDay
//         * @return
//         */
//        public static String getSpecifiedDayAfter(String specifiedDay) {
//            Calendar c = Calendar.getInstance();
//            Date date = null;
//            try {
//                date = new SimpleDateFormat("yy-MM-dd").parse(specifiedDay);
//            } catch (ParseException e) {
//                e.printStackTrace();
//            }
//            c.setTime(date);
//            int day = c.get(Calendar.DATE);
//            c.set(Calendar.DATE, day + 1);
//
//            String dayAfter = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
//            return dayAfter;
//        }
//
//        public static String getSpecifiedDayAfter(String specifiedDay,int days) {
//        	Calendar c = Calendar.getInstance();
//        	Date date = null;
//        	try {
//        		date = new SimpleDateFormat("yy-MM-dd").parse(specifiedDay);
//        	} catch (ParseException e) {
//        		e.printStackTrace();
//        	}
//        	c.setTime(date);
//        	int day = c.get(Calendar.DATE);
//        	c.set(Calendar.DATE, day + days);
//
//        	String dayAfter = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
//        	return dayAfter;
//        }
//
//        /**
//         * 两个时间计算小时差
//         * @param startTime
//         * @param endTime
//         * @param suffix
//         * @param limit
//         * @return
//         */
//        public  static String getDiffHour(String startTime,String endTime,String suffix,int limit){
//    		String str="";
//    		if(startTime == null || "".equals(startTime)){
//    			return  str;
//    		}
//    		Date _startTime = DateUtil.parseTime(startTime);
//    		Date _endTime = DateUtil.parseTime(DateUtil.getTime());
//
//    	    if(endTime != null && !"".equals(endTime)){
//    	  	  _endTime = DateUtil.parseTime(endTime);
//    	    }
//    		double  diff = _endTime.getTime()-_startTime.getTime();
//
//    		if(diff<0){
//    			diff = 0;
//    		}
//    		double c=BigDecimalUtil.div(diff, 3600000.00, 2);
//
//    		if(suffix != null){
//    			str = c+suffix;
//    		}
//    		return str;
//    	}
//
//        /**
//         * 获取指定日期是星期几
//         *
//         * @param date
//         * @return 星期几
//         */
//        public static String getWeekOfDate(Date date) {
//    		String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
//    		Calendar cal = Calendar.getInstance();
//    		cal.setTime(date);
//    		int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
//    		if (w < 0)
//    			w = 0;
//    		return weekDays[w];
//    	}
//
//
//        /**
//         * 获取上个月
//         *
//         * @param date
//         * @return 年月
//         */
//        public static String getYearMonth() {
//        	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
//        	Date date = new Date();
//    		Calendar cal = Calendar.getInstance();
//    		cal.setTime(date);
//    		cal.add(Calendar.MONTH, -1);
//    		return sdf.format(cal.getTime());
//    	}
//
//        // date类型转换为String类型
//        // formatType格式为yyyy-MM-dd HH:mm:ss//yyyy年MM月dd日 HH时mm分ss秒
//        // data Date类型的时间
//        public static String dateToString(Date data, String formatType) {
//        	return new SimpleDateFormat(formatType).format(data);
//        }
//
//        // long类型转换为String类型
//        // currentTime要转换的long类型的时间
//        // formatType要转换的string类型的时间格式
//        public static String longToString(long currentTime, String formatType)throws ParseException {
//	        Date date = longToDate(currentTime, formatType); // long类型转成Date类型
//	        String strTime = dateToString(date, formatType); // date类型转成String
//	        return strTime;
//        }
//
//        // string类型转换为date类型
//        // strTime要转换的string类型的时间，formatType要转换的格式yyyy-MM-dd HH:mm:ss//yyyy年MM月dd日
//        // HH时mm分ss秒，
//        // strTime的时间格式必须要与formatType的时间格式相同
//        public static Date stringToDate(String strTime, String formatType)throws ParseException {
//	        SimpleDateFormat formatter = new SimpleDateFormat(formatType);
//	        Date date = null;
//	        date = formatter.parse(strTime);
//	        return date;
//        }
//
//        // long转换为Date类型
//        // currentTime要转换的long类型的时间
//        // formatType要转换的时间格式yyyy-MM-dd HH:mm:ss//yyyy年MM月dd日 HH时mm分ss秒
//        public static Date longToDate(long currentTime, String formatType)throws ParseException {
//	        Date dateOld = new Date(currentTime); // 根据long类型的毫秒数生命一个date类型的时间
//	        String sDateTime = dateToString(dateOld, formatType); // 把date类型的时间转换为string
//	        Date date = stringToDate(sDateTime, formatType); // 把String类型转换为Date类型
//	        return date;
//	   }
//
//        // string类型转换为long类型
//        // strTime要转换的String类型的时间
//        // formatType时间格式
//        // strTime的时间格式和formatType的时间格式必须相同
//        public static long stringToLong(String strTime, String formatType)throws ParseException {
//	        Date date = stringToDate(strTime, formatType); // String类型转成date类型
//	        if (date == null) {
//	        	return 0;
//	        } else {
//		        long currentTime = dateToLong(date); // date类型转成long类型
//		        return currentTime;
//	        }
//        }
//
//        // date类型转换为long类型
//        // date要转换的date类型的时间
//        public static long dateToLong(Date date) {
//        	return date.getTime();
//        }
//
//        public static Date addDate(Date date, long day) {
//        	long time = date.getTime();
//        	day = day*24*60*60*1000;
//        	time += day;
//        	return new Date(time);
//        }
//
//        /**
//         *
//         * 1 第一季度 2 第二季度 3 第三季度 4 第四季度
//         *
//         * @param date
//         * @return
//         */
//        public static int getSeason(Date date) {
//            int season = 0;
//            Calendar c = Calendar.getInstance();
//            c.setTime(date);
//            int month = c.get(Calendar.MONTH);
//            switch (month) {
//            case Calendar.JANUARY:
//            case Calendar.FEBRUARY:
//            case Calendar.MARCH:
//                season = 1;
//                break;
//            case Calendar.APRIL:
//            case Calendar.MAY:
//            case Calendar.JUNE:
//                season = 2;
//                break;
//            case Calendar.JULY:
//            case Calendar.AUGUST:
//            case Calendar.SEPTEMBER:
//                season = 3;
//                break;
//            case Calendar.OCTOBER:
//            case Calendar.NOVEMBER:
//            case Calendar.DECEMBER:
//                season = 4;
//                break;
//            default:
//                break;
//            }
//            return season;
//        }
//
//        public static Date timePastTenSecond(Integer second,String otime) {
//        	try {
//        		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        		Date dt = sdf.parse(otime);
//        		Calendar newTime = Calendar.getInstance();
//        		newTime.setTime(dt);
//        		newTime.add(Calendar.SECOND, second);
//        		Date dt1 = newTime.getTime();
//        		return dt1;
//        	}catch(Exception ex) {
//        		ex.printStackTrace();
//        		return null;
//        	}
//        }
//
//    /**
//     * 计算相隔天数
//     * @param startTime
//     * @param endTime
//     * @param scale 保留小数位
//     * @return
//     */
//    public static Double getDiffDay(Date startTime, Date endTime, int scale){
//        Double diffDay = null;
//        if(startTime == null || endTime == null){
//            return diffDay;
//        }
//
//        double diff = endTime.getTime() - startTime.getTime();
//
//        if(diff < 0){
//            diff = 0;
//        }
//        diffDay = BigDecimalUtil.div(diff, 1000*60*60*24, scale);
//        return diffDay;
//    }
//
//    /**
//     * 计算相隔分钟数 或者秒钟数
//     * @param startTime
//     * @param endTime
//     * @param type   可传  m  s
//     * @return
//     */
//    public static long getDiffMinute(Date startTime, Date endTime ,String type) {
//        Long diffMinute = null;
//        if (startTime == null || endTime == null) {
//            return diffMinute;
//        }
//
//        long diff = endTime.getTime() - startTime.getTime();
//
//        if (diff < 0) {
//            diff = 0L;
//        }
//        //计算分钟
//        if("m".equals(type)) {
//        	diff = diff / 1000 / 60;
//        }
//        //计算秒钟
//        if("s".equals(type)) {
//        	diff = diff / 1000;
//        }
//        return diff;
//    }
//
//    /**
//     * 计算两个时间差
//     */
//    public static String getDatePoor(Date endDate, Date nowDate) {
//        long nd = 1000 * 24 * 60 * 60;
//        long nh = 1000 * 60 * 60;
//        long nm = 1000 * 60;
//        // long ns = 1000;
//        // 获得两个时间的毫秒时间差异
//        long diff = endDate.getTime() - nowDate.getTime();
//        // 计算差多少天
//        long day = diff / nd;
//        // 计算差多少小时
//        long hour = diff % nd / nh;
//        // 计算差多少分钟
//        long min = diff % nd % nh / nm;
//        // 计算差多少秒//输出结果
//        // long sec = diff % nd % nh % nm / ns;
//        StringBuilder timeStringBuilder = new StringBuilder();
//        if (day > 0) {
//            timeStringBuilder.append(day).append("天");
//        }
//        if (hour > 0) {
//            timeStringBuilder.append(hour).append("小时");
//        }
//        if (min > 0) {
//            timeStringBuilder.append(min).append("分钟");
//        }
//        if (timeStringBuilder.length() == 0) {
//            timeStringBuilder.append(0).append("分钟");
//        }
//        return timeStringBuilder.toString();
//    }
//
//
//    /**
//     * 	根据秒转换成 几天几小时几分钟
//     * @param sec
//     * @return
//     */
//	public static String convertDatePoor(long sec) {
//		long nd = 24 * 60 * 60;
//		long nh = 60 * 60;
//		long nm = 60;
//
//		long day = sec / nd;
//		long hour = sec % nd / nh;
//		long min = sec % nd % nh / nm;
//
//		StringBuilder timeStringBuilder = new StringBuilder();
//		if (day > 0) {
//			timeStringBuilder.append(day).append("天");
//		}
//		if (hour > 0) {
//			timeStringBuilder.append(hour).append("小时");
//		}
//		if (min > 0) {
//			timeStringBuilder.append(min).append("分钟");
//		}
//		if (timeStringBuilder.length() == 0) {
//			timeStringBuilder.append(0).append("分钟");
//		}
//		return timeStringBuilder.toString();
//	}
//
//}