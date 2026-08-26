public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if(speed > 0 && speed < 5){
            System.out.println("taxa de sucesso 100% não se perde carro");
            double carroHora = speed * 221;
            double perc = 1;
            return carroHora * perc;
        }else if(speed > 4 && speed < 9){
            System.out.println("taxa de sucesso 90% perdeu-se 10% dos carros");
            double carroHora = (double)speed * 221;
            double perc = 0.9;
            return carroHora * perc;
        }else if(speed == 9){
            System.out.println("taxa de sucesso 80% perdeu-se 20% dos carros");
            double carroHora = (double)speed * 221;
            double perc = 0.8;
            return carroHora * perc;
        }else if(speed == 10){
            System.out.println("taxa de sucesso 77% perdeu-se 23% dos carros");
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
