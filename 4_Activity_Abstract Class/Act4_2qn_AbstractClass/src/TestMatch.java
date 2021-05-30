
public class TestMatch extends Match {
   int overs=90;
	@Override
	float calculateRunRate() {
		int run =getTarget()-getCurrentscore();
		float rr =(float)run/((float)overs-getCurrentover());
		// TODO Auto-generated method stub
		return rr;
	}

	@Override
	int calculateBalls() {
		// TODO Auto-generated method stub
		int bals = (int)(6*(overs-getCurrentover()));
		return bals;
	}

	@Override
	void display(double reqRunRate, int balls) {
		// TODO Auto-generated method stub
		
		System.out.println("Requirements:");
		System.out.println("Need " +(getTarget()-getCurrentscore())+(balls > 1 ? " Runs" : " Run" )+" in "+balls+(balls > 1 ? " balls" : " ball" ));		
		System.out.format("Required Run Rate - %.2f\n",reqRunRate);
		
	}



}
