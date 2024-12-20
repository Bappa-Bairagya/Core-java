class pallindrum 
{
	static int operation (int n){
		int rev =0;
		while(n!=0){
			int rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		int n=372;
		int x= operation(n);
		if(x==n){
			System.out.println("Pallindrum Number");
		}
		else{
		System.out.println("Not Pallindrum");
		}
	}
}
