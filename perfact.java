class perfact 
{
	static void sub(int n){
	int copy=n;
	int sum=0;
	for(int i =1;i<n;i++){
	if(n%i==0){
	sum=sum+i;
	}
	}
	
	if(sum==copy){
	System.out.println("perfect");
	}
	else{
	System.out.println("not perfect");
	}
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		sub(28);
	}
}
