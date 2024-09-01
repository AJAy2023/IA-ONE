import java.util.Scanner;

/**
 * numberTriangle
 */
public class numberTriangle {

    void displayTry(int n){
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.err.print(j+" ");
            }
            System.out.println();
        }
    }
}

/**
 * InnernumberTriangle
 */
 class InnernumberTriangle {
public static void main(String[] args) {
    numberTriangle pg = new numberTriangle();
    Scanner sc  = new Scanner(System.in);
    // sc.close();
    System.out.println("Enter the number of rows");
    int rows = sc.nextInt();
    pg.displayTry(rows);
}
    
}