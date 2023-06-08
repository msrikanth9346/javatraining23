class Operation1
{
int square(int n){
return n*n;
}
}
class Circle
{
Operation1 op;
double pi=3.14;
double area(int radius)
{
op=new Operation1();
int rsquare=op.square(radius);
return pi*rsquare;
}
public static void main(String args[])
{
Circle c=new Circle();
double result=c.area(5);
System.out.println(result);
}
}