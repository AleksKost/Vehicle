public class Ship extends Vehicle {

    private int passPlaneAmmount;
    private String port;


    public int getPassPlaneAmmount() {
        return passPlaneAmmount;
    }

    public Ship( int passPlaneAmmount, String port) {
        this.passPlaneAmmount = passPlaneAmmount;
        this.port = port;
    }

    public void setPassPlaneAmmount(int passPlaneAmmount) {
        this.passPlaneAmmount = passPlaneAmmount;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "Ship{" + "passPlaneAmmount = " + passPlaneAmmount + ", port = '" + port + '\'' + '}';
    }
}
