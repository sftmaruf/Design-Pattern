
public class OrganizeTour {
	void organizeBaliTour() {
		BaliTour b1 = new BaliTour();
		b1.bookFlight();
		b1.bookHotel();
		b1.bookSightSeing();
	}
	
	void organizeParoTour()
	{
		ParoTour tour = new ParoTour();
		tour.bookFlight();
		tour.bookHotel();
		tour.bookSightSeing();
	}
}
