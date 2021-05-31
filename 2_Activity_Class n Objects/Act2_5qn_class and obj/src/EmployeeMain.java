import java.util.Scanner;

public class EmployeeMain {
	public static void main(String args[]){
        Employee obj = new Employee();

		System.out.println("Enter Name");
		
		Scanner f2 = new Scanner(System.in);
	    String name = f2.nextLine();
	    System.out.println("Enter the address");
	    

	   
	    Scanner f3 = new Scanner(System.in);
	    String address = f3.nextLine();
	    System.out.println("Enter mobile number");
	    Scanner f1 = new Scanner(System.in);
	    String mobile = f3.nextLine();
	   
		 
	    obj.setname(name);
	    obj.setaddress(address);
	    obj.setmobile(mobile);
	    System.out.println("Name:"+ obj.getname());
	    System.out.println("Address:"+ obj.getaddress());
	    System.out.println("Mobile:"+ obj.getmobile());
		
	    
	    System.out.println("Menu");

	    System.out.println(" 1. Update Employee name");

	    System.out.println(" 2. Update Employee Address");

	    System.out.println(" 3. Update Employee mobile");

	    System.out.println(" 4. All information correct/Exit");
	    
	    System.out.println("Enter choice");
	    Scanner f4 = new Scanner(System.in);
	    int n = f4.nextInt();
	    
	    switch (n) {
	      case 1:
	    	System.out.println("Enter  name");
	  		Scanner f5 = new Scanner(System.in);
	  	    String name1 = f5.nextLine();
	  	    obj.setname(name1);
	        break;
	      case 2:
	    	  System.out.println("Enter the address");
	  	     Scanner f31 = new Scanner(System.in);
	  	    String address1 = f31.nextLine();
	  	    obj.setaddress(address1);
	        break;
	      case 3:
	    	  System.out.println("Enter mobile number");
	  	    Scanner f11 = new Scanner(System.in);
	  	    String mobile1 = f11.nextLine();
	  	  obj.setmobile(mobile1);
	      
	      default:
	    	    System.out.println("exit");
	    }
	    
	    
	    System.out.println("Name:"+ obj.getname());
	    System.out.println("Address:"+ obj.getaddress());
	    System.out.println("Mobile:"+ obj.getmobile());
   } 
}
