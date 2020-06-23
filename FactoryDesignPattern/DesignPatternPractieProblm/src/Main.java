
public class Main {

	public static void main(String[] args) {
		
		//work
		Work work = workFactory.getWork();
		work.setStatus("On going");
		
		
		//TimeSheet
		TimeSheet time = TimeSheetFactory.getTimeSheet("inprogress");
		time.checkCurrentWork(work);
		
		//admin
		Admin me = ITaskFactory.getAdmin();
		me.setSerial(342);
		me.checkWorkProcess(work);
	
		//ITask
		ITask task = ITaskFactory.getITask("Admin");
		task.checkWorkProcess(work);
		
		//admins
		work.setStatus("Not Good");
		Admins admin = AdminsFactory.getAdmins("Junior");
		admin.chceckWorkingWay(work);

	}

}
