import java.util.*;
	public class Listqn2 {
		public static void main(String args[]){

		    ArrayList<String> list = new ArrayList<String>();
			System.out.println("Enter first 5 teams");
			Scanner f1 = new Scanner(System.in);
	        String s1 = f1.nextLine();
	        
	        
			Scanner f2 = new Scanner(System.in);
	        String s2 = f2.nextLine();
	        
	        
			Scanner f3 = new Scanner(System.in);
	        String s3 = f3.nextLine();
			
	        
			Scanner f4 = new Scanner(System.in);
	        String s4 = f4.nextLine();
			
			Scanner f5 = new Scanner(System.in);
	        String  s5 = f5.nextLine();
	        
	        
			list.add(s1);
			list.add(s2);
			list.add(s3);
			list.add(s4);
			list.add(s5);
			
			//System.out.println(list);
			System.out.println("Enter position to be swapped ");
			Scanner f6 = new Scanner(System.in);
	        int  n = f5.nextInt();
	        
	        Collections.swap(list,0,n);
	        for( String s:list){
	    		System.out.println(s);
	    		}
	        	
		}
		
	}
