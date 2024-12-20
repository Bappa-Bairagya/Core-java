class Tea{
public void taste()
{
System.out.println("Watching");
}
}
class Lemon_tea extends Tea
{
public void taste(){
System.out.println("Ufff");
}
}
class Green_tea extends Tea
{
public void taste(){
System.out.println("Best");
}
}
class Black_tea extends Tea
{
public void taste(){
System.out.println("Refresh");
}
}
class stimulator{
public static void taste_tea(Tea t){
t.taste();
}
}
class valo{
public static void main(String []args){
Lemon_tea m= new Lemon_tea();
Green_tea w= new Green_tea();
Black_tea c= new Black_tea();
stimulator.taste_tea(w);
}
}
