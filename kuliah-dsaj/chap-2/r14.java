
public class r14 {
    public static void main(String[] args) {
        int[] arr = {0, 1};

        try {
            System.out.println(arr[2]);
        } catch (Exception e) {
            System.out.println("Don't try buffer overflow attacks in Java!!!");
        }
    }
}