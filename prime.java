class prime 
{
	static void operation(int n){
	int count=0;
	for(int i=1;i<=n;i++){
	if(n%i==0){
	count++;
	}
	}
	if(count==2){
	System.out.println("Prime Number");
	}
	else{
	System.out.println("Not Prime Number");
	}
	}
	public static void main(String[] args) 
	{
		operation(10);
	}
}
