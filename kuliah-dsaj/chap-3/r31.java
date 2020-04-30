import java.util.Random;

// next = (a * cur + b) % n
public class r31 {
    public static void main(String[] args) {
        Random rand = new Random();

        rand.setSeed(System.currentTimeMillis());

        for (int i = 0; i < 5; i++) {
            System.out.println(rand.nextInt(100));
        }
    }
}