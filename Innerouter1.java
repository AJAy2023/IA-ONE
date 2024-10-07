class outer
{
void outerMethod()
{
 System.out.println("inside outer method");
	class inner
        {
           void innerMethod()
	{
              System.out.println("inside inner method");
}
}

inner y = new inner();
     y.innerMethod();
}
}
 class Innerouter1
{
 public static void main(String args[])
{
  outer x = new outer();
    x.outerMethod();
}
}