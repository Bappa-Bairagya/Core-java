class strong 
{
	static void operation(int no){
		int copy= no;
		int sum=0;
		while (no!=0)
		{
			int rem=no%10;
			int fact=1;
			for(int i=rem;i>=1;i--){
				fact=fact*i;
			}
			sum=sum+fact;
			no=no/10;
		}
		if(sum==copy){
			System.out.println("Storng Numberes");
		}
		else{
			System.out.println("Not Storng Numberes");
		}
	}
	public static void main(String[] args) 
	{
		operation(45);
	}
}
