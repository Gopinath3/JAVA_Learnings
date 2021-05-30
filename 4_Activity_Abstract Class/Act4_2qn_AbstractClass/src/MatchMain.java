import java.io.*;
public class MatchMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(isr);
		//int n = Integer.parseInt(br.readLine());
		System.out.println("Enter the Cricket Format");
		System.out.println("1.ODI");
		System.out.println("2.T20");
		System.out.println("3.Test");
		int n = Integer.parseInt(br.readLine());
		switch(n){
		case 1:
			ODIMatch o = new ODIMatch();
			System.out.println("Enter the Current Score");
			 o.setCurrentscore(Integer.parseInt(br.readLine()));
		     System.out.println("Enter the Current Over");
		     o.setCurrentover(Float.parseFloat(br.readLine()));
		//     currentOver=Float.parseFloat(s.nextLine());
		     System.out.println("Enter the Target Score");
		     o.setTarget(Integer.parseInt(br.readLine()));
		   //  target=Integer.parseInt(s.nextLine())
			o.display(o.calculateRunRate(),o.calculateBalls());
			break;
			
		case 2:
			
			T20Match t = new T20Match();
			System.out.println("Enter the Current Score");
			 t.setCurrentscore(Integer.parseInt(br.readLine()));
		     System.out.println("Enter the Current Over");
		     t.setCurrentover(Float.parseFloat(br.readLine()));
		//     currentOver=Float.parseFloat(s.nextLine());
		     System.out.println("Enter the Target Score");
		     t.setTarget(Integer.parseInt(br.readLine()));
		   //  target=Integer.parseInt(s.nextLine())
			t.display(t.calculateRunRate(),t.calculateBalls());
			break;
			
			

			
		case 3:
			
			TestMatch tt = new TestMatch();
			System.out.println("Enter the Current Score");
			 tt.setCurrentscore(Integer.parseInt(br.readLine()));
		     System.out.println("Enter the Current Over");
		     tt.setCurrentover(Float.parseFloat(br.readLine()));
		     System.out.println("Enter the Target Score");
		     tt.setTarget(Integer.parseInt(br.readLine()));
		   //  target=Integer.parseInt(s.nextLine())
			tt.display(tt.calculateRunRate(),tt.calculateBalls());
			break;
		
		default : 
			System.out.println("Invalid Format type");
			System.exit(0);
		}

		
		
		
	}

}
