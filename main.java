import java.util.Random;
import java.util.Scanner;

class ExpectedValueSimulator {
    public static void main(String[] args) {
        int headsCount = 0;
        int tailsCount = 0;

        Random rand = new Random();

        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter a number of coinflips: ");
        int n= sc.nextInt();              //reads string

        for(int i = 0; i < n; i++)
        {
            int side = rand.nextInt(2);

            if (side == 0)
            {
                headsCount++;
            }
            else
            {
                tailsCount++;
            }
        }

        System.out.println("total heads = " + headsCount + " total tails = " + tailsCount);
    }
}