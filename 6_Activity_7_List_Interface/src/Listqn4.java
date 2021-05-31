import java.util.ArrayList;
import java.util.Scanner;

public class Listqn4 {
	public static void main(String args[]){

	    ArrayList<Integer> list = new ArrayList<Integer>();
	    
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int count=0;
        int count1=0;
        for(i=0;i<n;i++){
        	
        	 Scanner sc1 = new Scanner(System.in);
             int n1 = sc1.nextInt();
        	list.add(n1);
        	if (n1>=50 && n1<100){
        		count=count+1;
        	}
        	if (n1>=100){
        		count1=count1+1;
        	}
        }
        System.out.println(count);
        System.out.println(count1);
        
        
		
}

}