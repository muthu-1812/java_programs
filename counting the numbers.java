import java.util.Scanner;

public class Main
{
	
public static void main(String[] args) {
		
Scanner s = new Scanner(System.in);

int n = s.nextInt();	

int a[] = new int[n];

System.out.println("Enter the Key");

int k = s.nextInt();

int c = 0;
	    
for(int i = 0;i<n;i++){
	        
a[i] = s.nextInt();
	       
	    
}
	    
for(int i = 0;i<n;i++){
	        
if(k == a[i]){
	            
c++;
	        
}

}
System.out.println("Count of the number" + c);	 
	
}

}
