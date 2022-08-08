public class Helicopter extends FlyingVehicle {
    public int weight;
    public int maxHeight;

    Helicopter(int weight,int maxHeight, int passengers) {
        this.weight = weight;
        this.maxHeight = maxHeight;
        this.passengers = passengers;
    }

    @Override
    public  void land(){
        System.out.println("Helicopter is landed");
    }
    @Override
    public void fly() {
        System.out.println("Helicopter is flying");
    }

    @Override
    public String toString() {
        return weight + " " +maxHeight + "" + passengers;
    }
}
