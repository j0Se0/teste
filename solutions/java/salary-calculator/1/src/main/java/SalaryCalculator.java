public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double salaryMultipleir = (daysSkipped >4) ? 0.85 : 1.0 ;
        return salaryMultipleir;
    }

    public int bonusMultiplier(int productsSold) {
       int bonusMult = productsSold > 19 ? 13 : 10 ;
        return bonusMult;
    }

    public double bonusForProductsSold(int productsSold) {
       double bonusProdut = bonusMultiplier(productsSold) * productsSold;
        return bonusProdut;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        final double salario = 1000.00;
        double rend = salario * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        double salFinal = rend > 2000.0 ? 2000.00 : rend;
        return salFinal;
    } 
}
