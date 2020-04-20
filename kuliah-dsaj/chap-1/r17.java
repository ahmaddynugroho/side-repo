
public class r17 {
    public double sumPow(double a, double b) {
        if (a == (b - 1)) {
            return Math.pow(a, 2) + Math.pow(b, 2);
        }
        else {
            return Math.pow(a, 2) + sumPow(a + 1, b);
        }   
    }

    public static void main(String[] args) {
        r17 run = new r17();

        System.out.println(run.sumPow(1, 5));
    }
}