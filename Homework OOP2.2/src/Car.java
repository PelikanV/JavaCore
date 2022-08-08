public class Car extends GroundVehicle{
    public String model ;
    Car(String model,int passengers ){
        this.model = model;
        this.passengers = passengers;

    }
    public String getModel(){
        return model;
    }
    public void setModel(int maxSpeed){
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Car  is driving");
    }

    public String toString() {
        return model + " " + passengers;
    }
}
