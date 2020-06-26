package socialmedia;

public class UserParent {
	private String userName, userMail;
	HeroAlamChildPage hero  = PageFactory.getHero();
	BaristerSumonChildPage barister = PageFactory.getBarister();

	public UserParent(String userName, String userMail) {
		this.userName = userName;
		this.userMail = userMail;
	}

	public void updateStatus(String status) {
		System.out.println(status);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {

		this.userMail = userMail;
	}
	
  public void recieveNotificaton(String notification) {
	  System.out.println(notification);
  }


}
