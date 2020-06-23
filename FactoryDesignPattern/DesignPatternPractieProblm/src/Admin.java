public class Admin implements ITask  {
	
	int serial;
	
	public void setSerial(int s) {
		serial = s;
	}

	@Override
	public void checkWorkProcess(Work w) {
		if(serial == 342) {
			w.setStatus("In progress");
			System.out.println("In progress");
		}
		
	}

}
