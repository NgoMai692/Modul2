package baitap;

public class NextDayCalculator {
    public static String findNextDay(int day, int month, int year) {
        boolean isMonthHas31Day = month == 1 || month == 5 || month == 7 || month == 8 || month == 10;
        boolean isMonthOfEndDay31 = day == 31 && isMonthHas31Day;
        boolean isMonthHas30Day = month == 4 || month == 6 || month == 9 || month == 11;
        boolean isMonthOfEndDay30 = day == 30 && isMonthHas30Day;
        boolean isFebOfEndDay = (month == 2 && day == 29 && isLeapYear(year)) || month == 2 && day == 28 && !isLeapYear(year);
        boolean isDecOfEndDay = (day == 31 && month == 12);

        if (day < 0 || (day > 30 && isMonthHas30Day) || (day > 31 && isMonthHas31Day) || (day > 29 && month == 2 && isLeapYear(year)) || (day > 28 && month == 2 && !isLeapYear(year))) {
            return "out of range!!!";
        } else {
            if (isMonthOfEndDay31 || isMonthOfEndDay30 || isFebOfEndDay) {
                return 1 + "/" + (month + 1) + "/" + year;
            } else {
                if (isDecOfEndDay) {
                    return 1 + "/" + 1 + "/" + (year + 1);
                } else
                    return day + 1 + "/" + month + "/" + year;
            }
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
            } else return true;
        }
        return false;
    }
}
