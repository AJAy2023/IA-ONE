class overloadex{
	overloadex(){
		System.out.println("welcome");
	}
	overloadex(String name){
		System.out.println("welcome " +name);
	}
	public void add(int a,int b) {
		System.out.println("sum of "+ a +" + "+ b + " = " +(a+b));
	}
	public void add(double a,double b) {
		
		System.out.printf("sum of %.2f + %.2f = %.2f\n", a,b,(a+b));
	}
}
public class Methodoverloading6 {
	public static void main(String[] args) {
		overloadex p1=new overloadex();
		overloadex p2=new overloadex("Mahesh");
		p1.add(5,6);
		p2.add(5.2,6.4);
	}
}
