import java.util.Random;

class ExpectedValueSimulator {
    public static void main(String[] args) {
        String sideUp;

        Random rand = new Random();

        int i = rand.nextInt(2);

        if (i == 0)
        {
            sideUp = "heads";
        }
        else
        {
            sideUp = "tails";
        }

        System.out.println(sideUp); // Display the string.
    }
}