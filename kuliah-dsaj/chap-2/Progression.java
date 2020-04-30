public class Progression {
    protected long current;

    public Progression() {
        this(0);
    }
    
    public Progression(long start) {
        this.current = start;
    }

    public long nextValue() {
        long answer = current;
        advance();
        return answer;
    }

    protected void advance() {
        current++;
    }

    public void printProgression(int n) {
        System.out.println(nextValue());
        for(int i = 1; i < n; i++) System.out.println(" " + nextValue());
        System.out.println();
    }
}