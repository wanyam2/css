package enumeration;

import java.util.Calendar;

public class EnumWeek {
	
	public enum Week {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};
	
	public static void main(String[] args) {
	
//		Week today = Week.TUESDAY;
//		
//		System.out.println(today);
//		
//		System.out.println(today.ordinal());
//		
//		String name = today.name();
//		System.out.println(name);
		
		Week today = null;
		
		Calendar calendar = Calendar.getInstance();
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		
		switch (week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		}
		
		System.out.println(week);
		
		if (today == Week.TUESDAY) {
			System.out.println("화요일에는 야구 봐야댐");
		}
		
	}

}
