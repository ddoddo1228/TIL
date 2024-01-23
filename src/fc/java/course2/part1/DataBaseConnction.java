package fc.java.course2.part1;
import fc.java.model2.Connection;
import fc.java.model2.OracleDriver;
public class DataBaseConnction {
    public static void main(String[] args) {
        //oracle DB접속
        Connection conn = new OracleDriver();
        conn.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system", "manage");

        //mysql DB접속
        conn = new OracleDriver();
        conn.getConnection("jdbc:mysql://localhost:3306/test","root", "1234");

        //mssql DB접속
        conn = new OracleDriver();
        conn.getConnection("jdbc:sqlserver://localhost:1433;DatebaseName=mem","sa", "12345");
    }

}
