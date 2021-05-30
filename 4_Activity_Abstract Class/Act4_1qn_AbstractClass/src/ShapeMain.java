import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ShapeMain {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Choose Shape");
		Scanner scan =new Scanner(System.in);
		System.out.println("Circle");
		System.out.println("Square");
		System.out.println("Enter the shape");
		String s=scan.nextLine();
	
    	if(s.equals("Square")){
        
        System.out.println("Enter the Side");
        int side = scan.nextInt();
        Square sq = new Square();
        double Areasquare = sq.calculateArea(side);
        
             DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.printf("Area of Square is"+ df.format(Areasquare));
     
        scan.close();
        }
    	else if(s.equals("Circle")) {
    		 System.out.println("Enter the Radius");
    	        int side = scan.nextInt();
    	        Circle c = new Circle();
    	        double Areacircle= c.calculateArea(side);
    	        DecimalFormat df = new DecimalFormat("#.##");
    	        df.setRoundingMode(RoundingMode.CEILING);

    	        System.out.printf("Area of Circle is "+ df.format(Areacircle));
    	     
    	        scan.close();
    		
    	}

}
	}
