import java.util.Scanner;
	public class CompanyMain {
		public static void main(String args[]) 
		{ 
			Company obj = new Company();
			
			
			System.out.println("Enter company name");
			
			Scanner o2 = new Scanner(System.in);
		    String name = o2.nextLine();
		    System.out.println("Enter the employees");
		    
	

		   
		    Scanner o3 = new Scanner(System.in);
		    String employees = o3.nextLine();
		    System.out.println("Enter TeamLead");
		    Scanner o1 = new Scanner(System.in);
		    String Team = o3.nextLine();
		   
			 
		    obj.setName(name);
		    obj.setEmployees(employees);
		    obj.setTeamlead(Team);
			
			
		  String details= name+","+employees+","+Team;
		  System.out.println(details);
		  String [] s=details.split(",");
		  System.out.println("Name:"+s[0]);
		  System.out.println("employees:"+s[1]);
		  System.out.println("TeamLead:"+s[2]);
		}
	}
