
import java.util.Random;

class NumberGenerator extends Thread {

    
    public static int number = 0;

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            number = random.nextInt(100); // Generate a random number between 0 and 99
            System.out.println("Generated Number: " + number);
            try {
                Thread.sleep(1000); // wait for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}