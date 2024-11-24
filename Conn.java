package electricity.billing.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection c;
    Statement s;
    Conn(){
        // step 1 :- register the driver class(Add jar sql connector)
        // step 2 :- creating the connection
        // step 3 :- statement creation
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs", "root", "Abhi@123");
            s = c.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
