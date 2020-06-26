package socialmedia;
public abstract class AdvertisementParentAbstract {
	
	String tagLine,productName;
	private double price;
	
	public AdvertisementParentAbstract(){
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public abstract void marketting();
	

}
