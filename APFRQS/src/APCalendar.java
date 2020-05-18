
public class APCalendar {
	public static int numberOfLeapYears(int year1, int year2) {
		int count = 0;
		int difference = Math.abs(year1 - year2);
		int earlier;
		int later;
		if(year1 < year2) {
			earlier = year1;
			later = year2;
		}
		else {
			earlier = year2;
			later = year1;
		}
		if(year1 >= 0 && year2 >= 0) {
			for(int i = earlier; i<= later; i++) {
				if(isLeapYear(i))
					count += 1;
			}
			return count;
		}
		return null;
	}
	
	public static int dayOfWeek(int month, int day, int year) {
		int day = dayOfYear(month, day, year);
		return ((day - firstDayofYear(year)%6);
	}
}
