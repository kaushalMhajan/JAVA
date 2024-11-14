package app.component;

public class InterestBean {
    private double principle;

    private int period;

    private double rate;

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getPeriod() {
        return period;
    }

    public void setPrinciple(double principle) {
        this.principle = principle;
    }
    
    public double getPrinciple() {
        return principle;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public double getSimpleInterest(){
        return principle*rate*period/100;
    }
}
