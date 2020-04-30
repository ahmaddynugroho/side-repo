
public class ArithProg extends Progression{
    protected long increment;

    public ArithProg() {
        this(1, 0);
    }
    
    public ArithProg(long stepSize) {
        this(stepSize, 0);
    }

    public ArithProg(long stepSize, long start) {
        super(start);
        this.increment = stepSize;
    }

    protected void advance() {
        current += this.increment;
    }

    public long printProgression() {
        long prev = super.current;
        long i = 1;
        while (super.current <= Integer.MAX_VALUE) {
            prev = super.current;
            this.advance();
            i += 1;
        }
        return i;
    }
}