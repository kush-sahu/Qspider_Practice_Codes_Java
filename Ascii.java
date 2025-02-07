class Ascii 
{
	public static void main(String[] args) 
	{
         System.out.println("-------------- ASCII VALUES----------" );
		for(int i=0;i<=127;i++){
           System.out.print(i +" : "+ ((char)i));
		}

        System.out.println();
		System.out.println("-------------a to z----------------");
		for(char c='a';c<='z';c++){
			System.out.print(c +" ");
		}
		System.out.println();


		System.out.println("-------------A to Z-------------");
		for(char c='A';c<='Z';c++){
			System.out.print(c +" ");
		}
		System.out.println();

      System.out.println("-------------Z to A--------------------");
		for(char c='Z';c>='A';c--){
			System.out.print(c +" ");
		}System.out.println();
		 
		 System.out.println("-------------0 to 9--------------");
		 for(char c='0';c<='9';c++){
			System.out.print(c +" ");
		}

	}
}
