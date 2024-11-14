package app.Employee.Model;

import app.Employee.Data.CounterEntity;

public record Counters(String tablename,int seedvalue,int currentvalue) {
    public static Counters fromCounters(CounterEntity entity){
        return new Counters(entity.getTb_name(), entity.getSeedvalue(), entity.getCurrentvalue());
    }
}