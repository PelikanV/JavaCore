public class Boat extends WaterVehicle {
    public int volume;

    Boat(int volume, int passengers) {
        this.volume = volume;
        this.passengers = passengers;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int floors) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        System.out.println("Boat is sailing");
    }

    @Override
    public String toString() {
        return volume + " " + passengers;
    }
}