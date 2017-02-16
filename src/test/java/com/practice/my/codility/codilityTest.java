package com.practice.my.codility;

public class codilityTest {
	
	private static final int ENTRANCE_FEE = 2;
	private static final int COST_FIRST_FULL_OR_PARTIAL_HOUR = 3;
	private static final int COST_SUCCESSIVE_FULL_OR_PARTIAL_HOUR = 4;

	public int solution(String E, String L) {
		String[] timeE = E.split(":");
		int hourE = Integer.valueOf(timeE[0]);
		int minuteE = Integer.valueOf(timeE[1]);
		
		String[] timeL = L.split(":");
		int hourL = Integer.valueOf(timeL[0]);
		int minuteL = Integer.valueOf(timeL[1]);
		
		int minusHour = hourL - hourE;
		int minusMinute = minuteL - minuteE;
		
		System.out.println(minusMinute);
		
		int totalCost = 0;
		
		if (minusHour == 0) {
			if(minusMinute > 0) {
				totalCost = ENTRANCE_FEE + COST_FIRST_FULL_OR_PARTIAL_HOUR;
			}
		} else if (minusHour > 0){
			totalCost = ENTRANCE_FEE + COST_FIRST_FULL_OR_PARTIAL_HOUR;
			int minusHourToOne = minusHour - 1;
			if(minusHourToOne - 1 >= 0) {
				totalCost = totalCost + (minusHourToOne * COST_SUCCESSIVE_FULL_OR_PARTIAL_HOUR);
				if(minusMinute > 0) {
					totalCost = totalCost + COST_SUCCESSIVE_FULL_OR_PARTIAL_HOUR;
				}
				
			}
		}
		
		return totalCost;
	}
	
	public static void main(String[] args) {
		String time1 = "09:30";
		String time2 = "12:29";
		codilityTest codility = new codilityTest();
		System.out.println(codility.solution(time1, time2));
	}
}
