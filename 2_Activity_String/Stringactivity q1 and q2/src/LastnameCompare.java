import java.util.Scanner;

public class LastnameCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner fobj = new Scanner(System.in);
		System.out.println("Enter First person name");
		String P1= fobj.nextLine();
		System.out.println("Enter Second person");
		Scanner lobj = new Scanner(System.in);
		String P2 = lobj.nextLine();
		fobj.close();
		lobj.close();
		
		

		String[] p1name = P1.split(" ");
		String[] p2name = P2.split(" ");
		//System.out.println(p1name[1].equals(p2name[1]));
		
		if(p1name[1].equals(p2name[1]))
		{
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		
		

		

	}

}
