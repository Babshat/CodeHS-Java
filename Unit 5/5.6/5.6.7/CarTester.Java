public class CarTester {

    public static void main(String[] args) {
        //Create a car that gets 20 mpg and has a 15 gallon tank
        Car toyota = new Car(20,15);
        //Fill up the gas tank
        toyota.addGas();
        //Check the miles available
        System.out.println("Miles available: " + toyota.milesAvailable());
        //Drive 100 miles
        toyota.drive(100);
        //Check the miles available
        System.out.println("Miles available: " + toyota.milesAvailable());
        //Add 2 gallons to the gas tank
        toyota.addGas(2);
        //Check the miles available
        System.out.println("Miles available: " + toyota.milesAvailable());
        //Try driving more miles than available by driving 1000 miles
        toyota.drive(1000);
        //Drive 200 miles
        toyota.drive(200);
        //Check how much gas you have left
        System.out.println("Gas remaining: " + toyota.getGas());
        //Print total miles driven
        System.out.println("Total Miles Driven: " + toyota.getTotalMilesDriven());
    }
}
