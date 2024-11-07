package Loans;

final class PersonalLoan extends Loan implements Taxable{
    PersonalLoan(double amount,int years){
        super(amount, years);
    }

    @Override
    public double getTax() {
        return 0.10;
    }

    @Override
    public float getRate() {
        return principle > 500000 ? 0.16f : 0.15f;
    }
}
