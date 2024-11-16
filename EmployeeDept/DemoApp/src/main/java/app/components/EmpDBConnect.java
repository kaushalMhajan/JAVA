package app.components;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class EmpDBConnect {
    
    public static HikariDataSource pool = new HikariDataSource(new HikariConfig("Empl.properties"));

    public static Connection connect() throws SQLException{
        return pool.getConnection();
    }
}
