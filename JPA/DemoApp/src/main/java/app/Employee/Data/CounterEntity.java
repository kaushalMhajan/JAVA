package app.Employee.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Counters")
public class CounterEntity {
    
    @Id
    @Column
    private String tb_name;

    @Column(name = "seed_value")
    private int seedvalue;

    @Column(name = "cur_value")
    private int currentvalue;
    
    public void setCurrentvalue(int currentvalue) {
        this.currentvalue = currentvalue;
    }

    public int getCurrentvalue() {
        return currentvalue;
    }

    public void setSeedvalue(int seedvalue) {
        this.seedvalue = seedvalue;
    }

    public int getSeedvalue() {
        return seedvalue;
    }

    public String getTb_name() {
        return tb_name;
    }

}
