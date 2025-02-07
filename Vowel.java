import java.util.*;
class Vowel
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Char:");
		int c=sc.next().charAt(0);
    System.out.println((c=='a'||c=='e'||c=='i'||c=='u')?("entered char is vowel"):("entered char is not vowel"));
	}
}
 

