class  Narrowing4
{
	public static void main(String[] args) 
	{
		long a=-57;
		
		
		int d=(int)a;
		short e=(short)a;
		byte f=(byte)a;
        char g=(char)a;
		System.out.println(a);//-57
		System.out.println(d);//-57
		System.out.println(e);//-57
		System.out.println(f);//-57
		System.out.println(g);// ?
	}
}
