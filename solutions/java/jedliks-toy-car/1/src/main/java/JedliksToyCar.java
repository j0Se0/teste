public class JedliksToyCar {
    private int distanceDisplay;
    private int batteryDisplay;

    public JedliksToyCar(){
        this.distanceDisplay = 0;
        this.batteryDisplay = 100;
    }
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
       return "Driven "+this.distanceDisplay+" meters";
    }

    public String batteryDisplay() {
       return this.batteryDisplay != 0 ? "Battery at "+batteryDisplay+"%" : "Battery empty";
    }

    public void drive() {
        if(this.batteryDisplay != 0){
            this.batteryDisplay -= 1;
            this.distanceDisplay += 20;
        }else{
            System.out.println("Battery empty");
        }
        
    }
}
