import java.util.ArrayList;
import java.util.Scanner;

public class listqn3 {
	
	public static void main(String args[]){

	    ArrayList<String> list1 = new ArrayList<String>();
		System.out.println("Enter first 5 players of season13");
		Scanner sc1 = new Scanner(System.in);
        String s1 = sc1.nextLine();
        
        
		Scanner sc2 = new Scanner(System.in);
        String s2 = sc2.nextLine();
        
        
		Scanner sc3 = new Scanner(System.in);
        String s3 = sc3.nextLine();
		
        
		Scanner sc4 = new Scanner(System.in);
        String s4 = sc4.nextLine();
		
		Scanner sc5 = new Scanner(System.in);
        String  s5 = sc5.nextLine();
        
        
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(s4);
		list1.add(s5);
		
		

	    ArrayList<String> list2 = new ArrayList<String>();
		System.out.println("Enter first 5 players of season12");
		Scanner sc6 = new Scanner(System.in);
        String st1 = sc6.nextLine();
        
        
		Scanner sc7 = new Scanner(System.in);
        String st2 = sc7.nextLine();
        
        
		Scanner sc8 = new Scanner(System.in);
        String st3 = sc8.nextLine();
		
        
		Scanner sc9 = new Scanner(System.in);
        String st4 = sc9.nextLine();
		
		Scanner sc10 = new Scanner(System.in);
        String  st5 = sc10.nextLine();
        
        
		list2.add(st1);
		list2.add(st2);
		list2.add(st3);
		list2.add(st4);
		list2.add(st5);
		
		
		System.out.println("Consistent run scorers ");
		 list1.retainAll( list2 );
		 
		for( String s:list1){
    		System.out.println(s);
    		}

}
}