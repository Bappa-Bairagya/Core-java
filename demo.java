class demo 
{
	static void sub(int n){
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
			count++;
			}
		}
				if(count==2){
				System.out.println("prime");
				}
				else{
				System.out.println("not");
				}
	}
	public static void main(String[] args) 
	{
		sub(5);
	}
}
