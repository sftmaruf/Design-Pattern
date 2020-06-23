
public class TimeSheetFactory {
	
	public static TimeSheet getTimeSheet(String choice) {
		if(choice.equals("inprogress")) {
			return new InProgressTimeSheet();
		}else if(choice.equals("completed")) {
			return new CompletedTimeSheet();
		}else {
			return null;
		}
	}

}
