class err{
double Re;
err(double pi,int r){
Re=pi*r*r;
}
public static void main(String []args){
err d=new err(3.14,4);
System.out.println(d.Re);
}
}