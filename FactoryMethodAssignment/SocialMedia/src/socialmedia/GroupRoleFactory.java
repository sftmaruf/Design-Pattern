package socialmedia;

public class GroupRoleFactory {

	public static GroupRole getRole(String choice) {
		if (choice.toLowerCase().equals("admin")) {
			return new AdminChildGroupRole();
		}else if(choice.toLowerCase().equals("moderator")) {
			return new ModeratorChildGroupRole();
		}else {
			return null;
		}
	}
	
	public static AdminChildGroupRole getAdmin() {
		return new AdminChildGroupRole();
	}

}
