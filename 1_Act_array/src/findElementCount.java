import java.util.Scanner;
public class findElementCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, ele, count = 0, i = 0;
        Scanner s = new Scanner(System.in);
       
        n = s.nextInt();
        int a[] = new int[20];
      
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
       
        ele = s.nextInt();
        for(i = 0; i < n; i++)
        {
            if(a[i] == ele)
            {
                count++;
                
            }
         
             }
        
        System.out.println(count);
      
       
    }
	}