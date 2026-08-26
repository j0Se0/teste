public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if(speed > 0 && speed < 5){
            double carroHora = speed * 221;
            double perc = 1;
            return carroHora * perc;
        }else if(speed > 4 && speed < 9){
            double carroHora = (double)speed * 221;
            double perc = 0.9;
            return carroHora * perc;
        }else if(speed == 9){
            double carroHora = (double)speed * 221;
            double perc = 0.8;
            return carroHora * perc;
        }else if(speed == 10){
            double carroHora = (double)speed * 221;
            double perc = 0.77;
            return carroHora * perc;
        }else{
            System.out.println("Velocidade Invalida");
            return 0;
        }
     
    }

    public int workingItemsPerMinute(int speed) {
        int valor = (int)productionRatePerHour(speed) / 60;
        return valor;
    }
}
