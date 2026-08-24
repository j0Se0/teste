public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        int minutos = 40;
        return minutos;
    };
    
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minPassado){
        int tempo = expectedMinutesInOven() - minPassado;
        return tempo ;
    };
    
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int camadas){
        int tempo = 2 * camadas ;
        return tempo ;
    };
    
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int camadas,int minForno){
        int soma = preparationTimeInMinutes(camadas) + minForno ;
        return soma ;
    };
    
}
