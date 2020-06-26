package socialmedia;
public class LuxChildAdvertisement extends AdvertisementParentAbstract{
	
	public LuxChildAdvertisement() {
		productName = "Lux";
		tagLine = "Not Just Soap Its Skin Care";
		setPrice(45.0);
	}

	@Override
	public void marketting() {
		System.out.println("ProductName :"+productName);
		System.out.println("ProductName :"+tagLine);
		System.out.println("ProductName :"+getPrice()+" TK");
		System.out.println("Grab it from any grocery store");
	}

}
