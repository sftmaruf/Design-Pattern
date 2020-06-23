
public class AdminsFactory {
	
	public static Admins getAdmins(String choice) {
		if(choice.equals("Senior")) {
			return new SeniorAdmins();
		}else if(choice.equals("Junior")) {
			return new JuniorAdmins();
		}else {
			return null;
		}
	}
}
