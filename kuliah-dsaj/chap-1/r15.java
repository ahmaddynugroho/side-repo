public class r15 {
    public int sumOfN(int n){
        return n*(n+1)/2;
    }

    public static void main(String[] args){
        r15 run = new r15();

        System.out.println(run.sumOfN(10));
    }
}