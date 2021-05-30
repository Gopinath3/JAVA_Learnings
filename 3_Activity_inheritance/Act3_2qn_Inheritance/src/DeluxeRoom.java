
public class DeluxeRoom extends HotelRoom{
	
	
	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasWifi, boolean hasTV) {
		super(hotelName, numberOfSqFeet, hasWifi, hasTV);
		// TODO Auto-generated constructor stub
		ratePerSqFeet = 10;
	}

	int ratePerSqFeet;


	public int getRatePerSqFeet()
	{
		if(hasWifi)
			return ratePerSqFeet+2;
		else
		return ratePerSqFeet;
	}
	
  
	
	
}
