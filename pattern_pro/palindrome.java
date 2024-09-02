import java.util.*;

class palindrome
{
  void checkpalindrome(int num)
  {	
	int rev , sum=0, temp;
	temp = num;
	while(num>0)
	{
		rev = num %10;
		sum = (sum*10)+rev;
		num = num/10;
       }
		if(temp == sum)
		System.out.println("Enter number is a palindrome");
		else
		System.out.println("Enter number is not a palindrome");
}
}
class palidromeEx 
{
	public static void main(String args[])
{
	palindrome pal = new palindrome();
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the number to check if it is palindrome or not");
	int original = in.nextInt();
	pal.checkpalindrome(original);
    in.close();
}
}	
 
