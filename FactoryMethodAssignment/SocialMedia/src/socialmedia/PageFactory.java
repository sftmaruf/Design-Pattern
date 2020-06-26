package socialmedia;

public class PageFactory {
	
	public static PageParent getPage(String choice) {
		if(choice.toLowerCase().equals("hero")) {
			return new HeroAlamChildPage();
		}else if(choice.toLowerCase().equals("barister")) {
			return new BaristerSumonChildPage();
		}else {
			return null;
		}
	}
	
	public static HeroAlamChildPage getHero() {
		return new HeroAlamChildPage();
	}
	
   public static BaristerSumonChildPage getBarister() {
	   return new BaristerSumonChildPage();
   }

}
