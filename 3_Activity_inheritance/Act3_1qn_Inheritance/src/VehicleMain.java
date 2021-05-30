import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class VehicleMain {

	public static void main(String[] args)throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String ft2="Diesel";
		boolean k2=false;
		System.out.println("1.Four Wheeler");
		System.out.println("2.Two Wheeler");
		System.out.println("Enter Vehicle Type:");
		int t=Integer.parseInt(br.readLine());
		if(t==1)
		{
			System.out.println("Vehicle Make:");
			String m=br.readLine();
			System.out.println("Vehicle Number:");
			String n=br.readLine();
			System.out.println("Fuel Type:");
			System.out.println("1.Petrol");
			System.out.println("2.Diesel");
			int ft1=Integer.parseInt(br.readLine());
			if(ft1==1)
				ft2 = "Petrol";
			System.out.println("Fuel Capacity:");
			int fc=Integer.parseInt(br.readLine());
			System.out.println("Engine CC:");
			int cc=Integer.parseInt(br.readLine());
			System.out.println("Audio System:");
			String a=br.readLine();
			System.out.println("Number of Doors:");
			int d=Integer.parseInt(br.readLine());
			FourWheeler v1=new FourWheeler(m,n,ft2,fc,cc,a,d);
			v1.displayMake();
			v1.displayBasicInfo();
			v1.displayDetailInfo();
		}
		if(t==2)
		{
			System.out.println("Vehicle Make:");
			String m=br.readLine();
			System.out.println("Vehicle Number:");
			String n=br.readLine();
			System.out.println("Fuel Type:");
			System.out.println("1.Petrol");
			System.out.println("2.Diesel");
			int ft1=Integer.parseInt(br.readLine());
			if(ft1==1)
				ft2 = "Petrol";
			else
				ft2="Diesel";
			System.out.println("Fuel Capacity:");
			int fc=Integer.parseInt(br.readLine());
			System.out.println("Engine CC:");
			int cc=Integer.parseInt(br.readLine());
			System.out.println("Kick Start Available(yes/no):");
			String k1=br.readLine();
			if(k1.equals("yes"))
				k2=true;
			TwoWheeler v2=new TwoWheeler(m,n,ft2,fc,cc,k2);
			v2.displayMake();
			v2.displayBasicInfo();
			v2.displayDetailInfo();
		}
			
			
			
			
			
		

	}

}
