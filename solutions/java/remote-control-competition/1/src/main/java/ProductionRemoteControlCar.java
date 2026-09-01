class ProductionRemoteControlCar implements RemoteControlCar , Comparable<ProductionRemoteControlCar> {
    private int vel;
    private int numberOfVictories;

    public ProductionRemoteControlCar(){
        this.vel = 0;
        this.numberOfVictories = numberOfVictories;
    }

    public void drive() {
        this.vel += 10;
    }

    public int getDistanceTravelled() {
        return this.vel;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other){
        return Integer.compare(other.getNumberOfVictories(),this.numberOfVictories);
    }
}
