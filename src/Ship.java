public class Ship extends Vehicle {

    private int passAmount;;
    private String port;


    public int getPassPlaneAmmount() {
        return passAmount;
    }

    public Ship( int passAmount, String port) {
        this.passAmount = passAmount;
        this.port = port;
    }

    public void setpassAmount(int passAmount) {
        this.passAmount = passAmount;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "Ship {" + "passAmount = " + passAmount + ", port = '" + port + '\'' + '}';
    }
}
