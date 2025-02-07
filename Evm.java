import java.util.scanner;
class Evm 
{
	public static void main(String[] args) 
	{
		Scanner sc=new scanner(System.in);
		int bjp=0;
        int cng=0;
		int mns=0;
		int ss=0;
		int aap=0;
		int nota=0;
 
		System.out.print("Enter Population :");
		int pop=sc.nextInt();

		for(int i=0;i<pop;i++)
		{
			System.out.println("List of parties");
			System.out.println("BJP");
            System.out.println("Congress");
			System.out.println("Shiv Sena");
			System.out.println("MNS");
			System.out.println("AAP");
			System.out.println("NOTA");


            System.out.print("Enter Your option:");
			int opt=sc.nextInt();


			if(opt==1){
                bjp++;
			}
			if(opt==2){
                cng++;
			}
			if(opt==3){
                  mns++;
		
			}
			if(opt==4){
               ss++;
		
			}
			if(opt==5){
                aap++;
		
			}
			if(opt==6){
                nota++;
			}
			if(opt>6){
				System.out.println("Option is Invalid");
				i--;
			}

 
		}
		if(bjp >=cng && bjp >=ss && bjp >=aap && bjp >=mns && bjp >=nota  ){
		 	System.out.println(" BJP has Won  THE ELECTION BY" + bjp + "Votes");
		}
		
		if(cng >=bjp && cng >=ss && cng>=aap && cng >=mns && cng >=nota  ){
		 	System.out.println(" cng has Won  THE ELECTION BY" + cng + "Votes");
		}
		
		if(ss >=bjp && ss >=cng && ss>=aap && ss >=mns && ss >=nota  ){
		 	System.out.println(" ss has Won  THE ELECTION BY" + ss + "Votes");
		}
		
		if(nota >=bjp && nota>=ss && nota>=aap && nota >=mns && nota >=nota  ){
		 	System.out.println(" cng has Won  THE ELECTION BY" + nota + "Votes");
		}
		if(aap >=bjp && aap >=ss && aap>=cng && aap >=mns && aap >=nota  ){
		 	System.out.println(" cng has Won  THE ELECTION BY" + cng + "Votes");
		}
		if(mns >=bjp && mns >=ss && mns>=aap && mns >=cng && mns >=nota  ){
		 	System.out.println(" cng has Won  THE ELECTION BY" + cng + "Votes");
		}
   }
}