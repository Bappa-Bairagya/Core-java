class whatsappv1
{
	void send(){
	System.out.println("Link,File,Text");
	}
}
class whatsappv2 extends whatsappv1
{
	void send(){
	System.out.println("Link,File,Text,audio");
	}
}

class mainw
{
	public static void main(String[] args) 
	{
		whatsappv2 f = new whatsappv2();
		f.send();
	}
}
