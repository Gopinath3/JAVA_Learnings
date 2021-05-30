
public class FourWheeler extends Vehicle {

	
	public FourWheeler(String m,String n,String t,int fc,int cc,String as,int d)
	{
		super(m,n,t,fc,cc);
		audioSystem=as;
		numberOfDoors=d;
	}
	


	private String audioSystem;
	private int numberOfDoors;
	
	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public String getAudioSystem() {
		return audioSystem;
	}

	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}



public void displayDetailInfo() {
	System.out.println("---Detail Information---");
	System.out.println("AudioSystem: "+ audioSystem);
	System.out.println("getNumberOfDoors "+ numberOfDoors);
	
}

}
