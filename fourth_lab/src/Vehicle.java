// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Vehicle {
    private String type;
    private String color;
    private double currentSpeed = 0;
    private final short maxSpeed = 200;
    private char currentGear = 0;
    private char nrOfGears = 6;


    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
        System.out.printf("Changed the type to: %s\n", type);
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.printf("Changed the color to: %s\n", color);
    }

    public char getCurrentGear() {
        return this.currentGear;
    }

    public void setCurrentGear(char gear) {
        this.currentGear = gear;
        System.out.printf("Changed the gear to: %d\n", (int) gear);
    }

    private void changeGear() {
            if (this.currentSpeed > 0 && this.currentSpeed <= 10) {
                this.currentGear = 1;
            } else if (this.currentSpeed > 10 && this.currentSpeed <= 20) {
                this.currentGear = 2;
            } else if (this.currentSpeed > 20 && this.currentSpeed <= 30) {
                this.currentGear = 3;
            } else if (this.currentSpeed > 30 && this.currentSpeed <= 40) {
                this.currentGear = 4;
            } else if (this.currentSpeed > 40) {
                this.currentGear = 5;
            } else {
                this.currentGear = 0;
        }
            System.out.printf("The gear is now: %d\n", (int) this.currentGear);
    }

    public void accelerate(char acceleration) {
        this.currentSpeed += acceleration;
        this.currentSpeed = (this.currentSpeed > this.maxSpeed)? this.maxSpeed: this.currentSpeed;
        System.out.printf("The speed increased to: %f\n", this.currentSpeed);
        this.changeGear();
    }

    public void decelerate(char acceleration) {
        this.currentSpeed -= acceleration;
        this.currentSpeed = (this.currentSpeed < 0)? 0: this.currentSpeed;
        System.out.printf("The speed decreased to: %f\n", this.currentSpeed);
        this.changeGear();
    }

    public void showDetails() {
        System.out.printf("The type is: %s\n", this.type);
        System.out.printf("The color is: %s\n", this.color);
        System.out.printf("The max speed is: %d\n", (int) this.maxSpeed);
        System.out.printf("The current speed is: %f\n", this.currentSpeed);
        System.out.printf("The total number of gears is: %d\n", (int) this.nrOfGears);
        System.out.printf("The current gear is: %d\n", (int) this.currentGear);
    }

}
