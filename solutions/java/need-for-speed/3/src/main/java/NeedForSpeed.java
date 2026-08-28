class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int metros;
    private int bateria;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed=speed;
        this.batteryDrain=batteryDrain;
        this.metros=0;
        this.bateria=100;
    }

    public boolean batteryDrained() {
        return batteryDrain > bateria;
    }

    public int distanceDriven() {
        return this.metros;
    }

    public void drive() {
        if(batteryDrain <= bateria){
            this.metros += this.speed ;
            this.bateria -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
       return new NeedForSpeed(50,4) ;
    }

    public int getSpeed(){
        return this.speed;
    }

     public int getBateria(){
        return this.bateria;
    }

     public int getBatteryDrain(){
        return this.batteryDrain;
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
      this.distance=distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {

        int b = car.getBateria()/car.getBatteryDrain();
        int metros = b * car.getSpeed();
        
        return metros >= this.distance;
    }
}
