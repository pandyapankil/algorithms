public class LeapYear{
	static boolean isLeapYear(int year){
		boolean isLeapYear;
		isLeapYear = (year % 4 == 0);
		isLeapYear = isLeapYear && (year % 100 != 0);
		isLeapYear = isLeapYear || (year % 400 == 0);
		return isLeapYear;
	}
}
