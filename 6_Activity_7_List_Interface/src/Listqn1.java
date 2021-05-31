import java.util.*;
public class Listqn1 {
public static void main(String args[]){

		    ArrayList<String> list = new ArrayList<String>();
			System.out.println("Enter the player details");
			System.out.println("Enter the player name");
			Scanner sc = new Scanner(System.in);
	        String name = sc.nextLine();
	        list.add(name);
	        System.out.println("Enter age");
			Scanner sc1 = new Scanner(System.in);
	        String age = sc1.nextLine();
	        list.add(age);
	        System.out.println("Enter country");
			Scanner sc2 = new Scanner(System.in);
	        String Country = sc2.nextLine();
			list.add(Country);
			for( String s:list){
			System.out.println("player name :"+s);
			}
			
			System.out.println("Enter skill ");
			
			Scanner sc3 = new Scanner(System.in);
	        String  skill = sc3.nextLine();
	        
	        
	        
			System.out.println("Enter the position to add skill");
			
			Scanner sc4 = new Scanner(System.in);
	        int  n = sc4.nextInt();
	        list.add(n,skill);
	        
	        for( String s:list){
	    		System.out.println("player name :"+s);
	    		}
			
	        

			System.out.println("Enter the position to be removed");
			
			Scanner sc5 = new Scanner(System.in);
	        int  m = sc5.nextInt();
	        list.remove(m);
	        
	        for( String s:list){
	    		System.out.println("player name :"+s);
	    		}
		}

	}

