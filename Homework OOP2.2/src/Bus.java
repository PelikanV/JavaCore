public class Bus extends GroundVehicle{
    public String route ;
    Bus(String route,int passengers ){
        this.route = route;
        this.passengers = passengers;

    }
    public String getRoute(){
        return route;
    }
    public void setRoute(String route){
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("Bus is driving");
    }

    public String toString() {
        return route + " " + passengers;
    }
}
