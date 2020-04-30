import java.util.Random;

public class r32 {
    public static int[] nullify(int[] arr) {
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());

        while (!isEmpty(arr)) {
            arr[rand.nextInt(arr.length)] = 0;
        }

        return arr;
    }

    protected static boolean isEmpty(int[] arr) {
        for (int var : arr) {
            if (var != 0) return false;
        }
        return true;
    }

    public static void arrPrint(int[] arr) {
        System.out.println();
        
        for (int var : arr) {
            System.out.print(var);
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,3,4,6,3,2,6,4};

        arrPrint(arr);

        nullify(arr);

        arrPrint(arr);
    }
}