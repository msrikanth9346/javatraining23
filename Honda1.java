class Bike3
{
final void run()
{
System.out.println("running...");
}
}
class Honda1 extends Bike3
{
public static void main(String args[])
{
new Honda1().run();
}
}