import java.util.*;
class Calculator 
{
	public static void main(String[] args) 
	{   
		Scanner sc=new Scanner(System.in);
		float op1=sc.nextFloat();
		char opt=sc.next().charAt(0);
		float op2=sc.nextFloat();

		float ans=(opt=='+' || opt=='%' || opt=='-' || opt=='/'|| opt=='*')?((opt=='*')?(op1*op2):((opt=='+')?(op1+op2):((opt=='%')?(op1%op2):(op1-op2)))):(0.000001f);
		System.out.println((ans!=0.000001f)?(ans):(opt));
	}
}
