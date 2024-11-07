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
    
        public static double getEmI(Loan l) throws Throwable{
            if(l instanceof HomeLoan){
                return l.getPrinciple() * (1 + l.getRate() * l.getPeriod()/100) / (12 * l.getPeriod());
            }else if(l instanceof PersonalLoan){
                return l.getPrinciple() * (1 + l.getRate() * l.getPeriod()/100) / (12 * l.getPeriod());
            }else{
                throw new Exception();
            }
    }

}

// public static double GetDiscountedEmi(Loan hl){
//     if(hl is HomeLoan){
//         IDisscountable h = hl as IDisscountable;

//         double d = h.GetDiscount(); 
//         return GetEmI(hl)-(GetEmI(hl)* d);
//     }
//     return 0;
// }

// public static double GetTaxedEmi(Loan hl){
//     if(hl is PersonalLoan){
//         ITaxable h = hl as ITaxable;

//         double d = h.GetTax(); 
//         return GetEmI(hl)+(GetEmI(hl)* d);
//     }
//     return 0;
// }   
