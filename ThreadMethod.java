class ThreadMethod 
{
	public static void main(String[] args) throws InterruptedException
	{
		String s="KushSahu";
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
			Thread.sleep(1000);
		}
}
}