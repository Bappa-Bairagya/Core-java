class star3 
{
	public static void main(String[] args) 
	{
		int n=5;
		int space=n-1;
		int star=1;
		for(int i=1;i<=n;i++){
		for(int j=1;j<=space;j++){
		System.out.print("  ");
		}
		for(int k=1;k<=star;k++){
		System.out.print("*");
		}
		
		star++;
		space--;
		System.out.println(" ");
		}
		
	}
}
