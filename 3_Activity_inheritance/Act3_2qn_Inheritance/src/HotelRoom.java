
public class HotelRoom {
	protected String hotelName;
	protected int numberOfSqFeet;
	protected boolean hasWifi;
	protected boolean hasTV;
	
	
	public boolean isHasTV() {
		return hasTV;
	}

	public void setHasTV(boolean hasTV) {
		this.hasTV = hasTV;
	}

	public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasWifi,boolean hasTV) {
		super();
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasWifi = hasWifi;
		this.hasTV = hasTV;
	}
	
	public int calculateTariff()
	{
		int rate = getRatePerSqFeet();
		int finalcost= numberOfSqFeet*rate;
		return finalcost;
	}
	
	public int getRatePerSqFeet()
	{
		return 0;
	}

	
	
	
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getNumberOfSqFeet() {
		return numberOfSqFeet;
	}
	public void setNumberOfSqFeet(int numberOfSqFeet) {
		this.numberOfSqFeet = numberOfSqFeet;
	}
	public boolean isHasWifi() {
		return hasWifi;
	}
	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}

}
