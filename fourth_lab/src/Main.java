public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setType("Car");
        vehicle.setColor("Black");

        for (char acceleration = 0; acceleration < 20; acceleration += 2) {
            vehicle.accelerate(acceleration);
        }

        for (char acceleration = 0; acceleration < 20; acceleration += 2) {
            vehicle.decelerate(acceleration);
        }

        char gear = 1;
        vehicle.setCurrentGear(gear);

        vehicle.showDetails();
    }
}