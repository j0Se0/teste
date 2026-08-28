class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter{
    
    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if(!fighter.isVulnerable()){
             return 6;
        }else{
             return 10;
        } 
    }
    
}

class Wizard extends Fighter{
    public boolean antecedencia = false;

    public boolean prepareSpell(){
        antecedencia = true;
        return antecedencia;
    }
    
    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }

    @Override
    boolean isVulnerable() {
        return this.antecedencia ? false : true;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if(!antecedencia){
             return 3;
        }else{
             return 12;
        } 
    }
}