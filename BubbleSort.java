class BubbleSort 
{
	public static void main(String[] args) 
	{

		int arr[]={1,2,4,2,3,22,0};
		int n=arr.length;

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<=n-1-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
