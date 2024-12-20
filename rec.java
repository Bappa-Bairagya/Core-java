class rec
{
	int res;
	rec(int w,int h){
	int res=w*h;
	this.res=res;
	}
	public static void main(String[] args) 
	{
		rec r=new rec(5,7);
		System.out.println(r.res);
	}
}
