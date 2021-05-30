
public class SuiteACRoom extends HotelRoom {

	
	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasWifi, boolean hasTV) {
		super(hotelName, numberOfSqFeet, hasWifi, hasTV);
		// TODO Auto-generated constructor stub
		ratePerSqFeet=15;
	}

int ratePerSqFeet;

public int getRatePerSqFeet() {
	if(hasWifi) 
		return ratePerSqFeet+2;
	else
		return ratePerSqFeet;
	
}
	



}
