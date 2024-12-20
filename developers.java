interface qspider{
void login();
void signup();
}
class developers implements qspider{
public void login(){
System.out.println("login setup");
}
public void signup(){
System.out.println("signup setup");
}
public static void main(String []args){
developers d=new developers();
d.signup();
d.login();
}
}