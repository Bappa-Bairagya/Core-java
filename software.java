interface qspider2{
void login();
void signup();
}
abstract class sachinsir implements qspider2{
public void login(){
System.out.println("Login setup");
}
}
class shuvamsir extends sachinsir{
public void signup(){
System.out.println("signup setup");
}
}
class software{
public static void main(String []args){
shuvamsir s=new shuvamsir();
s.login();
s.signup();
}
}