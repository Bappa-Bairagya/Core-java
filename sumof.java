class sumof 
{
	static void sub (int n){
	int sum=0;
	while(n!=0){
	int rem=n%10;
	sum=sum+rem;
	n=n/10;
	}
System.out.println("Sum of digit is"+sum);
	}
	public static void main(String[] args) 
	{
		
		sub(121);
	}
}
