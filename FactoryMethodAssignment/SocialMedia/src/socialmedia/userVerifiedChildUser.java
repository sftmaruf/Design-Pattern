package socialmedia;

public class userVerifiedChildUser extends UserParent {
	
    private boolean verifiedBatch = false;
	
	userVerifiedChildUser(String userName , String userMail){
		super(userName , userMail);
		verifiedBatch = true;
	}

	public String getverifiedBatch() {
		if(verifiedBatch == true) {
		  return "verified";
		}else {
			return "Unverified";
		}
	}
}
