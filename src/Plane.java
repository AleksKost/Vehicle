public class Plane extends Vehicle {

    private int height;
    private int passAmount;

    public Plane(int height, int passAmount) {
        this.height = height;
        this.passAmount = passAmount;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPassAmount() {
        return passAmount;
    }

    public void setPassAmount(int passAmount) {
        this.passAmount = passAmount;
    }

    @Override
    public String toString() {
        return "Plane{" + "height=" + height + ", passAmount=" + passAmount + '}';
    }
}
