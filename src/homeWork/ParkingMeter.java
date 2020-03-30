package homeWork;

    public class ParkingMeter{

        int timeLeft = 0;
        int maxTime;

        public ParkingMeter(int maxTime){
            this.maxTime = maxTime;
        }

        public boolean add(int timeLeft){
            if(timeLeft==25){
                timeLeft+=30;
                return true;
            }else{
                timeLeft = timeLeft;
                return false;
            }
        }

    }