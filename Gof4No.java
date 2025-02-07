class Gof4No 
{
	public static void main(String[] args) 
	{
		int a=66;
		int b=2;

		int c=3;
		int d=4;
		int large=(a>b)?((c>d)?((a>c)?(a):(c)):((a>d)?(a):(d))):((c>d)?((b>c)?(b):(c)):((b>d)?(b):(d)));
		System.out.println(large);
	}
}
