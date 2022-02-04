package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToUserDB {
    private static final String dburl = "jdbc:mysql://localhost:3306/userdb";
    private static final String dbusername = "root";
    private static final String dbpassword = "123456";
    private static final String dbdriver = "com.mysql.cj.jdbc.Driver";

    public static final void loadDriver(){
        try {
            Class.forName(dbdriver);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }
    public static Connection getRegisterConnection() {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dburl, dbusername,dbpassword);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return connection;

    }
}