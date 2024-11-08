package DemoApp;

import Loans.Discountable;
import Loans.Loan;
import Loans.Loaner;
import Loans.Taxable;

public class Program {

    static double getTotalDiscount(Loan... loans) throws Throwable {
        double totaldiscount = 0;
        for (Loan loan : loans) {
            if (loan instanceof Discountable d) {
                totaldiscount = totaldiscount + (loan.getEmi(loan) * (1 - d.getDiscount()))/12;
            }
        }
        return totaldiscount;
    }

    static double getTotalTax(Loan... loans) throws Throwable {
        double totalTax = 0;
        for (Loan loan : loans) {
            if (loan instanceof Taxable t) {
                totalTax = totalTax + (loan.getEmi(loan)* t.getTax())/12;
            }
        }
        return totalTax;
    }


    public static void main(String[] args) throws Throwable {
        Loan jack = Loaner.personalLoanScheme(120000, 10);
        Loan jill = Loaner.personalLoanScheme(2020000, 10);

        Loan john = Loaner.homeLoanScheme(120000, 10);
        Loan steve = Loaner.homeLoanScheme(120000, 10);

        System.out.printf("Jack Personal Loan Emi is : %.2f\n", jack.getEmi(jack));
        System.out.printf("John HomeLoan Loan Emi is : %.2f\n", john.getEmi(john));


        Loan[] loans = new Loan[10];
        loans[0] = jack;
        loans[1] = jill;
        loans[2] = john;
        loans[3] = steve;

        System.out.printf("Total Tax applied is : %.2f\n",getTotalTax(loans));
        System.out.printf("Total Discount applied is : %.2f\n",getTotalDiscount(loans));

    }
}

