class EvenOddSum 
{
	public static void main(String[] args) 
	{
		 int n=7264;
		 int even=0;
		 int odd=0;

		 while(n!=0){
			 int rem=n%10;
			 if(rem%2==0){
				 even+=rem;
			 }else{
				 odd+=rem;
			 }
			 n=n/10;
		 }
		 System.out.println("Even Sum =" +even);
         System.out.println("odd Sum =" +odd);
	}
}
