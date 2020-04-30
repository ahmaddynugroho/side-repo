
public class r18 {
    public int vowelCount(String sentence) {
        int vowels = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a') {
                vowels += 1;
            }
            else if (sentence.charAt(i) == 'i') {
                vowels += 1;
            }
            else if (sentence.charAt(i) == 'u') {
                vowels += 1;
            }
            else if (sentence.charAt(i) == 'e') {
                vowels += 1;
            }
            else if (sentence.charAt(i) == 'o') {
                vowels += 1;
            }
        }

        return vowels;
    }

    public static void main(String[] args) {
        r18 run = new r18();

        System.out.println(run.vowelCount("ashiiap"));
    }
}