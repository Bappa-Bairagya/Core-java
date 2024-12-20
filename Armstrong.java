class Armstrong 
{
	static void operation(int n){
		int copy=n;
		int sum=0;
		while(n!=0){
			int rem= n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(sum==copy){
			System.out.println("Armstrong Number");
		}
		else{
			System.out.println("Not Armstrong Number");
		}
	}
	public static void main(String[] args) 
	{
		operation(372);
	}
}
