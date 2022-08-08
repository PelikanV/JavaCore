public class Liner extends WaterVehicle {
    public int floors ;

    Liner(int floors,int passengers){
        this.floors = floors;
        this.passengers = passengers;
    }
    public int getFloors(){
        return floors;
    }
    public void setFloors(int floors){
        this.floors = floors;
    }
    @Override
    public void isSailing() {
        System.out.println("Liner is sailing");
    }


    @Override
    public String toString() {
        return floors + " " + passengers;
    }
}
