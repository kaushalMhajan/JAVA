package Loans;

public abstract class Loan{
    protected double principle;
    protected int period;

    public Loan(double amount,int years){
        principle = amount;
        period = years;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public void setPrinciple(double principle) {
        this.principle = principle;
    }
    public double getPrinciple() {
        return principle;
    }

    public abstract float getRate();
}