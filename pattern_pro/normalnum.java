import java.util.Scanner;

public class normalnum {
    
    void displaynum(int n)
    {
        int count = 1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++ )
            {
                System.out.print(count+ " 4");
                count ++;
            }
            System.out.println();
        }
    }
}
class normalp{
    public static void main(String[] args) {
        normalnum pg  = new normalnum();
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        pg.displaynum(rows);
    }
}
