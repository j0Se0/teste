public class ExperimentalRemoteControlCar implements RemoteControlCar{
    private int vel;

    public ExperimentalRemoteControlCar(){
        this.vel = 0;
    }

    public void drive() {
        this.vel += 20;
    }

    public int getDistanceTravelled() {
        return this.vel;
    }
}

