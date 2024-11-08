package Loan;

public class PersonalLoan extends Loan implements Taxable
{
    public PersonalLoan(double amount, int period)
    {
        super(amount, period);
    }

    @Override
    public double getTax()
    {
        return 0.10;
    }

    @Override
    public float getRate() 
    {
        return principle > 500000 ? 0.16f : 0.15f;
    }
    
}
