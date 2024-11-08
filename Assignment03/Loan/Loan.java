package Loan;

public abstract class Loan 
{ 

  protected double principle;
  protected int period;

  public Loan(double amount, int period )
  {
    this.principle= amount;
    this.period= period;
  }

  public double getPrinciple()
  {
    return principle;
  }

  public void setPrinciple(double amount)
  {
    this.principle=amount;
  }

  public int getPeriod()
  {
    return period;
  }

  public void setPeriod(int period)
  {
    this.period=period;
  }


  public abstract float getRate();
}
