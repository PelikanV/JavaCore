public class Plane extends FlyingVehicle{

        public int maxDistance;

        Plane(int maxDistance, int passengers) {
            this.maxDistance = maxDistance;
            this.passengers = passengers;
        }

        public int getMaxDistance() {
            return maxDistance;
        }

        public void setMaxDistance(int floors) {
            this.maxDistance = maxDistance;
        }

        @Override
        public void fly() {
            System.out.println("Plane is flying");
        }
        @Override
        public void land(){
            System.out.println("Plane is landed");
        }

        @Override
        public String toString() {
            return maxDistance + " " + passengers;
        }
    }

