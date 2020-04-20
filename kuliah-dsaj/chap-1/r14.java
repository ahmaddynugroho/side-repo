public class r14 {

    public boolean isEven(int i){
        while (i > 1){
            i -= 2;
        }

        if (i == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args){
        r14 run = new r14();

        boolean ev1 = run.isEven(4);
        boolean ev2 = run.isEven(5);

        System.out.println(ev1);
        System.out.println(ev2);
    }
}