package socialmedia;

public class UserFactory {
	
	public static UserParent getUser(String choice , String userName , String userMail) {
		
		if(choice.toLowerCase().equals("verified")) {
			return new userVerifiedChildUser(userName , userMail);
		}else if(choice.toLowerCase().equals("unverified")) {
			return new userUnverifiedChildUser(userName , userMail);
		}else {
			return null;
		}
	}
	
	public static userVerifiedChildUser getVerified(String userName , String userMail) {
		return new userVerifiedChildUser(userName , userMail);
	}

}
