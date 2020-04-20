public class r13 {

    public boolean isMultiple(long n, long m){
        if (n > m){
            if (n%m == 0){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (m%n == 0){
                return true;
            }
            else {
                return false;
            }
        }
    }

    public static void main(String[] args){
        r13 exe = new r13();

        boolean multi = exe.isMultiple(6, 3);
        boolean multi2 = exe.isMultiple(3, 9);
        boolean multi3 = exe.isMultiple(4, 9);
        boolean multi4 = exe.isMultiple(9, 4);
        
        System.out.println(multi);
        System.out.println(multi2);
        System.out.println(multi3);
        System.out.println(multi4);
    }
}