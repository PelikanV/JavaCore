public class Motorcycle extends GroundVehicle{
        public int maxSpeed ;
    Motorcycle(int maxSpeed,int passengers ){
            this.maxSpeed = maxSpeed;
            this.passengers = passengers;

        }
        public int getMaxSpeed(){
            return maxSpeed;
        }
        public void setMaxSpeed(int maxSpeed){
            this.maxSpeed = maxSpeed;
        }

        @Override
        public void drive() {
            System.out.println("Motorcycle  is driving");
        }

        public String toString() {
            return maxSpeed + " " + passengers;
        }


}
