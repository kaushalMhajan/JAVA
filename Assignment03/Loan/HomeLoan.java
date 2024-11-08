package Loan;

public class HomeLoan extends Loan implements Discountable
{
    public HomeLoan(double amount, int period)
    {
        super(amount, period);
    }

    @Override
    public double getDiscount()
    {
        return 0.05;
    }

    @Override
    public float getRate() 
    {
        return principle > 2000000 ? 0.11f : 0.10f;
    }
    
}
