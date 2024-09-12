public class Car{
    private String carName;
    private double milesDriven;
    private double gallonsUsed;
    
    public Car(){
        carName = "";
        milesDriven = 0.0;
        gallonsUsed = 0.0;
    }
    
    public Car(String name, double miles, double gallons){
        carName = name;
        milesDriven = miles;
        gallonsUsed = gallons;
    }
    
    public String getName(){
        return carName;
    }
    
    public double getMiles(){
        return milesDriven;
    }
    
    public double getGallons(){
        return gallonsUsed;
    }
    
    public void setName(String newName){
        carName = newName;
    }
    
    public void setMiles(double newMiles){
        milesDriven = newMiles;
    }
    
    public void setGallons(double newGallons){
        gallonsUsed = newGallons;
    }
    
    public double calculateAverage(){
        double average = milesDriven / gallonsUsed;
        average = average * 10;
        average = Math.round(average);
        average = average / 10;
        return average;
    }
    
    public String toString(){
        return "\n" + carName + " averaged " + calculateAverage() + " m/g";
    }
}

