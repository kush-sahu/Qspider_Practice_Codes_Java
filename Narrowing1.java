class  Narrowing1
{
	public static void main(String[] args) 
	{
		double a=57.89;
		float b=(float)a;
		long c=(long)a;
		int d=(int)a;
		short e=(short)a;
		byte f=(byte)a;
        char g=(char)a;
		System.out.println(a);//57.89
		System.out.println(b);//57.89
		System.out.println(c);//57
		System.out.println(d);//57
		System.out.println(e);//57
		System.out.println(f);//57
		System.out.println(g);//'9'
	}
}
