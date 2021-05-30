public class TwoWheeler extends Vehicle {

	public TwoWheeler(String m,String n,String t,int fc,int cc,boolean k)
	{
		super(m,n,t,fc,cc);
		kickStartAvailable=k;
	}





	boolean kickStartAvailable;
	
	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}

	
	
	public void displayDetailInfo()
	{
		System.out.println("---Detail Information---");
		if(kickStartAvailable==true)
		{
		System.out.println("Kick Start Available:YES");
		}
		else
		{
			System.out.println("Kick Start Available:NO");
		}
	}
	
}
