class SelectionSort 
{
	public static void main(String[] args) 
	{
		int arr[]={1,4,2,6,3,5};

		for(int i=0;i<arr.length;i++){
            int minele=arr[i];
			int ind=i;
			for(int j=i+1;j<arr.length;j++){
			   if(minele>arr[j]){
				   minele=arr[j];
				   ind=j;
			   }
			   int temp=arr[i];
			   arr[i]=arr[ind];
			   arr[ind]=temp;
			}
		}

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] +" ");
		}
	}
}
