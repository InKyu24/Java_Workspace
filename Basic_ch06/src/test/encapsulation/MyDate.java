package test.encapsulation;

public class MyDate {
	private int year; 
	private int month;
	private int day;
	
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public void setYear(int year) { 
		if(year>0 && year<2022) {
			this.year=year;
			
		}else {
			System.out.println("Invalid year");
		}
	}

	public void setMonth(int month) {
		if(month>0 && month<13) {
			this.month = month;			
		}else {
			System.out.println("Invalid month");
		}
	}

	public void setDay(int day) {
		if(month==1||month==3||month==5||month==7||month==9||month==12) {
			if(day>0 && day<32) {
				this.day = day;
			}
		}else if(month==4||month==6||month==9||month==11) {
			if(day>0 && day<31) {
				this.day = day;
			}
		}else if(month==2) {
			if(day>0 && day<29) {
				this.day = day;
			}
		}else
			System.out.println("Invalid day");
		}	
}


