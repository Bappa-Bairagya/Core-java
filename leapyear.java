class leapyear 
{
	static void operation(int no){
		if((no%4==0 && no%100!=0)|| (no%400==0)){
			System.out.println("Leap Year");
		}
			else{
				System.out.println("Not Leap Year");
			}
	}
	public static void main(String[] args) 
	{
		operation(2011);
	}
}