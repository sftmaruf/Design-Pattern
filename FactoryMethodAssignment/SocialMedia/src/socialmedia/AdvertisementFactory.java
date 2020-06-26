package socialmedia;
public class AdvertisementFactory {
	
	public static AdvertisementParentAbstract getAdvertisement(String choice) {
		if(choice.toLowerCase().equals("lux")) {
			return new LuxChildAdvertisement();
		}else if(choice.toLowerCase().equals("walton")) {
			return new WaltonChildAdvertisement();
		}else {
			return null;
		}
	}
}
