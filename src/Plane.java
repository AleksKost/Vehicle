public class Plane extends Vehicle {

    private int height;
    private int passPlaneAmmount;

    public Plane(int height, int passPlaneAmmount) {
        this.height = height;
        this.passPlaneAmmount = passPlaneAmmount;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getpassPlaneAmmount() {
        return passPlaneAmmount;
    }

    public void passPlaneAmmount(int passPlaneAmmount) {
        this.passPlaneAmmount = passPlaneAmmount;
    }

    @Override
    public String toString() {
        return "Plane {" + "height = " + height + ", passPlaneAmmount = " + passPlaneAmmount + '}';
    }
}
