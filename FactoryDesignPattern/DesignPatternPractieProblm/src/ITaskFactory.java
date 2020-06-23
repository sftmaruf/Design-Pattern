public class ITaskFactory {
	public static ITask getITask(String choice) {
		if (choice.equals("Admin")) {
			return new Admin();
		}else {
			return null;
		}
	}
	
	public static Admin getAdmin() {
		return new Admin();
	}
}
