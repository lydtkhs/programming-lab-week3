
package week3;

public class Car {

    String plateNumber;
    String model;
    int mileage;
    double fuelLevel;
    double tankCapacity;

    public Car(String plateNumber, String model, double fuelLevel, double tankCapacity) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.mileage = 0; 
        this.fuelLevel = fuelLevel;
        this.tankCapacity = tankCapacity;
    }

    public void drive(int mileage) {
        double fuelNeeded = mileage / 10.0;
        if (this.fuelLevel - fuelNeeded < 0) {
            System.out.println("Not enough fuel for this trip!");
        } else {
            this.fuelLevel -= fuelNeeded;
            this.mileage += mileage;
            System.out.println("You drove " + mileage + " km.");
        }
    }

    public void refuel(double amount) {
        if (this.fuelLevel + amount <= this.tankCapacity) {
            this.fuelLevel += amount;
            System.out.println("Your new fuel level is " + this.fuelLevel);
        } else {
            this.fuelLevel = this.tankCapacity;
            System.out.println("Tank is full, extra fuel discarded.");
        }
    }

    public void checkStatus() {
        System.out.println("Car model: " + this.model);
        System.out.println("Car plate: " + this.plateNumber);
        System.out.println("Current mileage: " + this.mileage);
        System.out.println("Current fuel: " + this.fuelLevel);

        if (this.fuelLevel < this.tankCapacity * 0.10) {
            System.out.println("Low fuel warning!");
        }
    }
}

