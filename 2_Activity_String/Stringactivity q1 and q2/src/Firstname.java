import java.util.Scanner;
public class Firstname {
	public static void main(String[] args) {
	
//String stringF="viraT";
//String stringL="kohlI";
Scanner obj = new Scanner(System.in);
System.out.println("Enter Firstname");
String stringF= obj.nextLine();
System.out.println("Enter Lastname");
String stringL = obj.nextLine();
obj.close();

String result = stringF.substring(0,1).toUpperCase() + stringF.substring(1).toLowerCase();
String resultt = stringL.toUpperCase();

System.out.println(result +" "+ resultt);

}
}
