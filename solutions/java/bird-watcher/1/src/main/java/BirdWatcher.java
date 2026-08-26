
class BirdWatcher {
    private final int[] birdsPerDay ;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] birdsPerDay = {0,2,5,3,7,8,4};
     return birdsPerDay ;
    }

    public int getToday() {
        return  this.birdsPerDay[this.birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length-1]++; 
    }

    public boolean hasDayWithoutBirds() {
       for(int n : this.birdsPerDay){
           if(n==0){
               return true;
           }
       }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int soma = 0;
        if(numberOfDays <= this.birdsPerDay.length){
            for(int i = 0;i < numberOfDays;i++){
                soma += this.birdsPerDay[i];
            }
             return soma;
        }else{
            for(int i = 0;i < this.birdsPerDay.length;i++){
                soma += this.birdsPerDay[i];
            }
             return soma;
        }
    
    }

    public int getBusyDays() {
        int index= 0;
        for(int i:this.birdsPerDay){
            if(i>=5){
                index++;
            }
        }
        return index;
    }
}
