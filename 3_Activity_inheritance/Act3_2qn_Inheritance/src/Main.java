import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		boolean t2=false;
		boolean w2=false;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(isr);
		System.out.println("Hotel Tariff Calculator");
		System.out.println("1. Deluxe Room");
		System.out.println("2. Deluxe AC Room");
		System.out.println("3. Suite AC Room");
		System.out.println("Select Room Type:");
        
		int n = Integer.parseInt(br.readLine());
		if(n==1)
		{
		System.out.println("Hotel Name:");
		String name=br.readLine();
		System.out.println("Room Square Feet Area:");
		int rsf = Integer.parseInt(br.readLine());
		System.out.println("Room has TV (yes/no):");
		String t1=br.readLine();
		if(t1.equals("yes"))
			t2=true;
		System.out.println("Room has Wifi (yes/no):");
		String w1=br.readLine();
		if(w1.equals("yes"))
			w2=true;
		
		DeluxeRoom dr = new DeluxeRoom(name,rsf,t2,w2);
		int trfperday = dr.calculateTariff();	
		System.out.println("Room Tariff per day is:"+trfperday);
		}

		if(n==2)
		{
			System.out.println("Hotel Name:");
			String name=br.readLine();
			System.out.println("Room Square Feet Area:");
			int rsf=Integer.parseInt(br.readLine());
			System.out.println("Room has TV (yes/no):");
			String t1=br.readLine();
			if(t1.equals("yes"))
				t2=true;
			System.out.println("Room has Wifi (yes/no):");
			String w1=br.readLine();
			if(w1.equals("yes"))
				w2=true;
			DeluxeACRoom dac = new DeluxeACRoom(name,rsf,t2,w2);
			int trfperday = dac.calculateTariff();
			System.out.println("Room Tariff per day is:"+trfperday);
		}
		if(n==3)
		{
			System.out.println("Hotel Name:");
			String name=br.readLine();
			System.out.println("Room Square Feet Area:");
			int rsf=Integer.parseInt(br.readLine());
			System.out.println("Room has TV (yes/no):");
			String t1=br.readLine();
			if(t1.equals("yes"))
				t2=true;
			System.out.println("Room has Wifi (yes/no):");
			String w1=br.readLine();
			if(w1.equals("yes"))
				w2=true;
			SuiteACRoom dr=new SuiteACRoom(name,rsf,t2,w2);
			int trfperday=dr.calculateTariff();
			System.out.println("Room Tariff per day is:"+trfperday);
		}
		
		}
	}

