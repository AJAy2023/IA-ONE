
class outer{
    void outerMethod()
{
System.out.println("inside outerMethod");
class Inner{
void innerMethod()
{
System.out.println("Inside innermethod");
}
}
Inner y =  new Inner();
y.innerMethod();
}
}
class Innerouter
{
public static void main(String args[])
{
outer x = new outer();
x.outerMethod();
}
}
