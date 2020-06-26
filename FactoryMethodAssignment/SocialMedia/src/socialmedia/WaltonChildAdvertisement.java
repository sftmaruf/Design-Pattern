package socialmedia;
public class WaltonChildAdvertisement extends AdvertisementParentAbstract {

	WaltonChildAdvertisement(){
		productName = "Primo H9";
		tagLine = "It's our product";
		setPrice(8699.0);
	}
	
	@Override
	public void marketting() {
		System.out.println("ProductName :"+productName);
		System.out.println("ProductName :"+tagLine);
		System.out.println("ProductName :"+getPrice()+" TK");
		System.out.println("Grab it from our outlate");
	}

}
