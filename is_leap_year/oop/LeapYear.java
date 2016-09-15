class LeapYear{
	private int year;
	Year(int year){
		this.year = year;	
	}
	boolean isLeapYear(){
		boolean isLeapYear = (year % 4 == 0);
		isLeapYear = isLeapYear && (year % 100 != 0);
		isLeapYear = isLeapYear || (year % 400 == 0);
		return isLeapYear;
	}
	void print(){
		if (isLeapYear()) 
			System.out.println(year+" is a leap year");
		else
			System.out.println(year+" is not a leap year");
	}
}
	
