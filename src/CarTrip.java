public class CarTrip {
    private double myStartOdometer;
    private double myEndOdometer;
    private double myTime;
    private double myGallonsUsed;

    public CarTrip(double myEndOdometer, double myStartOdometer, double myGallonsUsed, double myTime){
        this.myEndOdometer = myEndOdometer;
        this.myStartOdometer = myStartOdometer;
        this.myGallonsUsed = myGallonsUsed;
        this.myTime = myTime;
    }

    public CarTrip(){
        this.myEndOdometer = 0;
        this.myStartOdometer = 0;
        this.myGallonsUsed = 0;
        this.myTime = 0;
    }

    public void getMyEndOdometer(){

    }
}
