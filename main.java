class amazon{
public void watch()
{
System.out.println("Watching");
}
}
class movies extends amazon
{
public void watch(){
System.out.println("movies");
}
}
class webseries extends amazon
{
public void watch(){
System.out.println("webseries");
}
}
class cricket extends amazon
{
public void watch(){
System.out.println("cricket");
}
}
class scp{
public static void single(amazon a){
a.watch();
}
}
class main{
public static void main(String []args){
movies m= new movies();
webseries w= new webseries();
cricket c= new cricket();
scp.single(w);
}
}
