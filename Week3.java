package week3;

public class Week3 {

    public static void main(String[] args) {
    
        Car car1 = new Car("38 YEZ 21", "Toyota", 60, 100);

        System.out.println("Driving 150 km...");
        car1.drive(150);
        car1.checkStatus();

        System.out.println("--------------------");

        
        System.out.println("Refueling 20 liters...");
        car1.refuel(20);
        car1.checkStatus();

        System.out.println("--------------------");

        
        car1.refuel(50);
        car1.checkStatus();

        System.out.println("--------------------");

        System.out.println("Driving 920 km ...");
        car1.drive(920);
        car1.checkStatus();
        
        System.out.println("--------------------"); 
        
        System.out.println("Driving 1100 km ...");
        car1.drive(1100);
        car1.checkStatus();
        
    }
    
}
