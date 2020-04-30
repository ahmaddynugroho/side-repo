public class FiboProg extends Progression{
    protected long prev;

    public FiboProg() {
        this(0, 1);
    }

    public FiboProg(long first, long second) {
        super(first);
        this.prev = second - first;
    }

    protected void advance() {
        long temp = this.prev;
        prev = current;
        current += temp;
    }
}