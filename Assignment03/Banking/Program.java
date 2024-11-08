package Banking;

import Loan.HomeLoan;
import Loan.Loan;
import Loan.PersonalLoan;

public class Program {

    static double getEmi(Loan l) throws Throwable{

        if(l instanceof HomeLoan){
            return l.getPrinciple() * (1 + l.getRate() * l.getPeriod() / 100)/(12 * l.getPeriod());
        }else if(l instanceof PersonalLoan){
            return l.getPrinciple() * (1 + l.getRate() * l.getPeriod() / 100)/(12 * l.getPeriod());
        }else{
            throw new Exception();
        }
    }

    public static void main(String[] args) throws Throwable{
        Loan pl = new PersonalLoan(1020000, 5);
        Loan hl = new HomeLoan(1020000, 5);

        System.out.printf("Emi of PersonalLoan is : %.2f \n",getEmi(pl));
        System.out.printf("Emi of HomeLoan is : %.2f \n",getEmi(hl));
    }
}
