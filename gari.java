class Ola{
public void Ride()
{
System.out.println("Watching");
}
}
class Auto extends Ola
{
public void Ride(){
System.out.println("Ufff");
}
}
class Bike extends Ola
{
public void Ride(){
System.out.println("Best");
}
}
class Car extends Ola
{
public void Ride(){
System.out.println("Refresh");
}
}
class stimulator{
public static void veh_ride(Ola t){
t.Ride();
}
}
class gari{
public static void main(String []args){
Auto m= new Auto();
Bike w= new Bike();
Car c= new Car();
stimulator.veh_ride(w);
}
}
