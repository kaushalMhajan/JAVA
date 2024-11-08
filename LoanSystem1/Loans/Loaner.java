package Loans;

public class Loaner {
    
        public static Loan personalLoanScheme(double pr,int p){
            var sc = new PersonalLoan(pr, p);
            sc.setPrinciple(pr);
            sc.setPeriod(p);
            return sc;
        } 
    
        public static Loan homeLoanScheme(double pr,int p){
            var sc = new HomeLoan(pr,p);
            sc.setPrinciple(pr);
            sc.setPeriod(p);
            return sc;
        }

} 
