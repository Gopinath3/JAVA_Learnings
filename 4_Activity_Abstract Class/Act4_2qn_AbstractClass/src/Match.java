
public abstract class Match {
  private int currentscore;
  private float currentover;
  private int target;
  
  


public int getCurrentscore() {
	return currentscore;
}
public void setCurrentscore(int currentscore) {
	this.currentscore = currentscore;
}
public float getCurrentover() {
	return currentover;
}
public void setCurrentover(float currentover) {
	this.currentover = currentover;
}
public int getTarget() {
	return target;
}
public void setTarget(int target) {
	this.target = target;
}
abstract float calculateRunRate();
abstract int calculateBalls();



/* public void display(double reqRunRate,int balls){	
	System.out.println("Requirements:");
	System.out.println("Need " +(target - currentscore)+(balls > 1 ? " Runs" : " Run" )+" in "+balls+(balls > 1 ? " balls" : " ball" ));		
System.out.format("Required Runrate - %.2f\n",reqRunRate);
}  */

abstract void display(double reqRunRate,int balls);

}
