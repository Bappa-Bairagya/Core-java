class arms{
public static int counting(int n){
int count=0;
while(n!=0){
count++;
n=n/10;
}
return count;
}
public static void main(String[]args){
int n=153;
int temp=n;
counting(n);
int sum=0;
while(n!=0){
int rem=n%10;
sum=sum+(int(Math.pow(rem, count));
n=n/10;
}
if(sum==temp){
System.out.println("Armstrong");
}
else{
System.out.println("not");
}
}
}