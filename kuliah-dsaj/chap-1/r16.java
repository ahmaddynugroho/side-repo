
public class r16 {
    public int sumOdd(int n) {
        if (n % 2 != 0) {
            return (1 + (n-2)/2)*(1 + n)/2;
        }
        else {
            return n + ((1 + (n - 1 -2)/2)*(1 + n - 1 )/2);
        }
    }

    public static void main(String[] args) {
        r16 run = new r16();

        System.out.println(run.sumOdd(5));
        System.out.println(run.sumOdd(6));
    }
}