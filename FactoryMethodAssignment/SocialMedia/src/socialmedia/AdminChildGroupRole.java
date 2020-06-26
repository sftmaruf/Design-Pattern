package socialmedia;

import java.util.ArrayList;

public class AdminChildGroupRole extends GroupRole {
	private String decision;
	ArrayList<UserParent> array;
	
	public AdminChildGroupRole() {
	}
	
	public void removeUser(GroupParent group , UserParent user) {
		array = group.getArrayList();
		array.remove(user);
		user.recieveNotificaton(user.getUserName()+" removed from "+group.groupName+" group");
	}


}
