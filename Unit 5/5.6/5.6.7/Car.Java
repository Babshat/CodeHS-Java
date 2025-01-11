public class Car {

    // Start here
    private double efficiency;
    private double gas;
    private double tankCapacity;
    private double totalMilesDriven;
    
    public Car(double carEfficency, double carTankCapacity){
        this.efficiency = carEfficency;
        this.tankCapacity = carTankCapacity;
        this.gas=0;
        this.totalMilesDriven = 0;
    }
    
    public void addGas(){
        System.out.println("Filling up ...");
        this.gas = tankCapacity;
    }
    public void addGas(double amount){
        System.out.println("Adding gas ...");
        this.gas+=amount;
        if(this.gas>this.tankCapacity){
            this.gas=this.tankCapacity;
        }
    }
    public double getTotalMilesDriven(){
        return totalMilesDriven;
    }
    public void drive(double distance){
        if (canDrive(distance)){
            System.out.println("Driving " + distance);
            totalMilesDriven+=distance;
            gas-=distance/efficiency;
        }
        else{
        System.out.println("Can't drive " + distance + ". That's too far!");
    }
    }
    public boolean canDrive(double distance){
        return gas >= distance/efficiency;
    }
    public double milesAvailable(){
        return efficiency*gas;
    }
    public double getGas(){
        return gas;
    }
    
    
    
    
}
