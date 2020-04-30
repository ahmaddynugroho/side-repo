class Flower {
    private String name;
    private int petal;
    private float price;

    Flower() {
        this.name = "NotSet";
        this.petal = 0;
        this.price = 0;
    }

    Flower(String name, int petal, float price) {
        this.name = name;
        this.petal = petal;
        this.price = price;
    }

    protected void setName(String name) {
        if (name == null) return;
        if (name.equals("")) return;
        if (name.length() <= 100) this.name = name;
    }

    protected void setPetal(int petal) {
        if (petal >= 0) this.petal = petal;
    }

    protected void setPrice(int price) {
        if (price >= 0) this.price = price;
    }

    protected String getName() {
        return this.name;
    }

    protected int getPetal() {
        return this.petal;
    }

    protected float getPrice() {
        return this.price;
    }
}
public class r110 {
    public static void main(String[] args) {
        Flower run = new Flower("tes", 5, 500);

        run.setName("");
        run.setPetal(10);
        run.setPrice(100000);       

        System.out.println(run.getName());
        System.out.println(run.getPetal());
        System.out.println(run.getPrice());
    }
}