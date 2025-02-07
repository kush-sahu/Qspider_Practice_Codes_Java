import java.util.*;
class Upper 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Char:");
		int n=sc.nextInt();
     System.out.println((n%2==0 && n%5==0)?("hi two hi five"):((n%2==0)?(" hi two"):((n%5==0)?("hi five"):("Blank"))));
		
	}
}
 

