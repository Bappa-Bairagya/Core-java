interface animal{
void sound();
}
class cat implements animal{
public void sound(){

System.out.println("Meow Meow");
}
}
class dog implements animal{
public void sound(){

System.out.println("Bhow Bhow");
}
}
class snack implements animal{
public void sound(){

System.out.println("Hisssss");
}
}
class animall{
public static void main(String []args){
cat c=new cat();
dog d=new dog();
snack s =new snack();
scp.single(c);
scp.single(d);
scp.single(s);
}}
class scp{
public static void single(animal a){
a.sound();
}
}