class palli
{
	static void sub(int n){
		int b=n;
		int sum =0;
		while(n!=0){
			
		int rem=n%10;
		sum=(sum*10)+rem;
		n=n/10;
		}
		if(b==sum){
		System.out.println("pallindrum");
		}
		else
		{
		System.out.println("not pallindrum");
		}

	}
	public static void main(String[] args) 
	{
		
		sub(121);
	}
}
