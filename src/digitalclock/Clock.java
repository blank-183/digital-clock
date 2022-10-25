package digitalclock;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock extends Thread {
	
	Main mainClock;
	
	public Clock(Main mainClock) {
		this.mainClock = mainClock;
		start();
	}
	
	@Override
	public void run() {
		while(true) {
			Date date = new Date();
			SimpleDateFormat currentDate = new SimpleDateFormat("yyyy MMMM dd");
			SimpleDateFormat currentDay = new SimpleDateFormat("EEEE");
			SimpleDateFormat currentHour = new SimpleDateFormat("HH");
			SimpleDateFormat currentMinute = new SimpleDateFormat("mm");
			SimpleDateFormat currentSecond = new SimpleDateFormat("ss");
			
			mainClock.dateTextField.setText(currentDate.format(date));
			mainClock.dayTextField.setText(currentDay.format(date));
			mainClock.hourTextField.setText(currentHour.format(date));
			mainClock.minuteTextField.setText(currentMinute.format(date));
			mainClock.secondTextField.setText(currentSecond.format(date));
		}
		
	}
}

