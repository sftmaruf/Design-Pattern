package socialmedia;

import java.util.ArrayList;

public class GroupParent {
	String groupName;
	String groupAbout;
    private boolean decision;
	private ArrayList<UserParent> array;
	GroupRole group = GroupRoleFactory.getRole("admin");
	AdminChildGroupRole admin = GroupRoleFactory.getAdmin();
	

	public GroupParent() {
		array = new ArrayList<UserParent>();
	}

	public void setDecision() {
		if(group.accessHandle().toLowerCase().equals("accept")) {
			this.decision = true;
		}else if(group.accessHandle().equals("reject")) {
			this.decision = false;
		}
		
	}

	public void joinGroup(UserParent user) {
		setDecision();
		group.notify(user.getUserName());
		
		if (decision == true) {
			array.add(user);
			user.recieveNotificaton(groupName+" accept your request");
		} else if (decision == false) {
			user.recieveNotificaton(groupName+" reject your request");
		}
	}


	public String getGroupName() {
		return groupName;
	}
	
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	public String getGroupAbout() {
		return groupAbout;
	}
	
	public void setGroupAbout(String groupAbout) {
		this.groupAbout = groupAbout;
	}

	public ArrayList getArrayList() {
		return array;
	}
}

