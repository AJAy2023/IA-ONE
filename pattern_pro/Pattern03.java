import java.util.Scanner;

public class Pattern03 {
    
    void displayPattern(int n) {
        for(int i = 0; i < n; i++) { 
            int number = 1; 
            for(int j = 0; j <= i; j++) { 
                System.out.print(number + " "); 
                number = number * (i - j) / (j + 1); 
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern03 pg = new Pattern03(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        pg.displayPattern(rows);
        sc.close();
    }
}
