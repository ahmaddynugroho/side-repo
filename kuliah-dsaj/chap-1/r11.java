import java.util.Scanner;

public class r11 {
    public static void main(String[] args){
        inputAllBaseType();
    }

    public static void inputAllBaseType(){
        Scanner key = new Scanner(System.in);

        System.out.println("Input String:");
        key.nextLine();

        System.out.println("Input int:");
        while (!key.hasNextInt()){
            key.nextLine();
            System.out.println("Please input int:");
        }     

        key.nextInt();
    }
}