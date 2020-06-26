package socialmedia;

public class GroupFactory {
	
	public static GroupParent getGroup(String choice) {
		if(choice.toLowerCase().equals("boipoka")) {
			return new BoipokaChildGroup();
		}else if(choice.toLowerCase().equals("traveller")) {
			return new TravellersChildGroup();
		}else {
			return null;
		}
	}

}
