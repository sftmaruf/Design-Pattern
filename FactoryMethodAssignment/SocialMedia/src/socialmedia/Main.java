package socialmedia;

public class Main {
	
	public static void main(String[] ags) {
		
		//advertisement parent
		AdvertisementParentAbstract adv = AdvertisementFactory.getAdvertisement("lux");
		AdvertisementParentAbstract adv1 = AdvertisementFactory.getAdvertisement("walton");
		
		
		//User Parent
		UserParent user = UserFactory.getUser("verified", "Shafat", "shafayet35-2530@diu.edu.bd");
		UserParent user1 = UserFactory.getUser("Unverified","Maruf","maruf@gmail.com");
		UserParent user2 = UserFactory.getUser("Unverified","Khalid","Khalid@gmail.com");
		System.out.println("User Name : "+user.getUserName());
		System.out.println("User Mail : "+user.getUserMail());
		
		System.out.println();
		
		adv.marketting();
		
		System.out.println();
		
		//Page(hero) Parent
		PageParent page = PageFactory.getPage("hero");
		System.out.println("Page Name : "+page.getPageName());
		page.updatePageLike(user);
		page.updatePageLike(user1);
		System.out.println("Page Like : "+page.getPageLike());
		
		System.out.println();
		
		//Page(barister) Parent
		PageParent page1 = PageFactory.getPage("barister");
		page1.updatePageLike(user);
		page1.updatePageLike(user1);
		page1.updatePageLike(user2);
		System.out.println("Page Like : "+page1.getPageLike());
		
		System.out.println();
		
		//Group Parent
		GroupParent group = GroupFactory.getGroup("Boipoka");
		System.out.println("Group Name : "+group.groupName);
		System.out.println("About : "+group.groupAbout);
		group.joinGroup(user);
		
		//using admin child class through group parent class
		group.admin.removeUser(group, user);
		
		System.out.println();
		
		adv1.marketting();
			
	}

}
