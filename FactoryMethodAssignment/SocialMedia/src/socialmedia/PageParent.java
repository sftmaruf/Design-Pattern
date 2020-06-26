package socialmedia;

import java.util.ArrayList;

public class PageParent {
	private String pageName;
	private int pageLike;
	private ArrayList<UserParent> array;
	
	
	public PageParent() {
		pageLike = 0;
		array = new ArrayList<UserParent>();
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public int getPageLike() {
		return array.size();
	}

	public void setPageLike(int pageLike) {
		this.pageLike = pageLike;
	}
	
	public void updatePageLike(UserParent user){
		array.add(user);
		notify(user.getUserName());
		user.recieveNotificaton("You Like "+pageName+" page");
		pageLike++;
	}
	
	public void notify(String name) {
		System.out.println(name+" Like your page");
	}
	
}
