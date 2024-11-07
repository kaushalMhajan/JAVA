package Loans;

final class HomeLoan extends Loan implements Discountable{

    HomeLoan(double amount,int years){
        super(amount, years);
    }

    @Override
    public double getDiscount() {
        return 0.05;
    }

    @Override
    public float getRate() {
        return principle > 2000000 ? 0.11f : 0.10f;
    }
}
