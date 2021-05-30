
public class DeluxeACRoom extends DeluxeRoom {
       public DeluxeACRoom(String hotelName, int numberOfSqFeet, boolean hasWifi, boolean hasTV) {
		super(hotelName, numberOfSqFeet, hasWifi, hasTV);
		ratePerSqFeet =12;
		// TODO Auto-generated constructor stub
	}

	int ratePerSqFeet;
	
	public int getRatePerSqFeet() {
		return ratePerSqFeet;
	}



	
	
	

}
