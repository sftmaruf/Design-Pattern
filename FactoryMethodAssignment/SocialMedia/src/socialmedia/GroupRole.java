package socialmedia;

import java.util.Scanner;

public class GroupRole implements Role {
	private String decision;
	private Scanner input;
	
	public GroupRole(){
		//input = new Scanner(System.in);
	}

	@Override
	public String accessHandle() {
		decision = "accept";
		return decision;
	}

	public String getDecision() {
		return decision;
	}

	public void setDecision(String decision) {
		this.decision = decision;
	}
	
	public void notify(String name) {
		System.out.println(name+" want to add in your group");
	}
	

}
