
public class r19 {
    public String noPunc(String sentence) {
        StringBuilder tempS = new StringBuilder(sentence);

        for (int i = 0; i < tempS.length(); i++) {
            char x = tempS.charAt(i);
            if (x=='a' ||
                x=='b' ||
                x=='c' ||
                x=='d' ||
                x=='e' ||
                x=='f' ||
                x=='g' ||
                x=='h' ||
                x=='i' ||
                x=='j' ||
                x=='k' ||
                x=='l' ||
                x=='m' ||
                x=='n' ||
                x=='o' ||
                x=='p' ||
                x=='q' ||
                x=='r' ||
                x=='s' ||
                x=='t' ||
                x=='u' ||
                x=='v' ||
                x=='w' ||
                x=='x' ||
                x=='y' ||
                x=='z') {
                    continue;
                } 
            else {
                tempS.deleteCharAt(i);
                return tempS.toString();
            }
        }
        return tempS.toString();
    }

    public String delPunc(String sentence) {
        String temp = sentence;
        for (int i = 0; i < sentence.length(); i++) {
            temp = noPunc(temp);
        }
        return temp;
    }

    public static void main(String[] args) {
        r19 run = new r19();

        System.out.println(run.delPunc("ashiap!!!!bos@"));
    }
}