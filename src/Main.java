public class Main {
    public static void main(String[] args) {

            Vehicle veh = new Vehicle(200, 260, 2017);
            System.out.println(veh);

        Car car1 = new Car(150,80,2014);
        System.out.println(car1);

        Ship ship = new Ship(52, "Odessa");
        System.out.println(ship);

        Plane plane = new Plane(1100, 78);
        System.out.println(plane);
    }
}
