package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToUserDB {

   private static Connection connection ;

        static{
            final String dburl = "jdbc:mysql://localhost:3306/userdb";
            final String dbusername = "root";
            final String dbpassword = "123456";
            final String dbdriver = "com.mysql.cj.jdbc.Driver";
            try {
                Class.forName(dbdriver);
                connection = DriverManager.getConnection(dburl, dbusername, dbpassword);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Failed to init db connection", e);
            }
        }


    static Connection getRegisterConnection() {

        return connection;

    }
}