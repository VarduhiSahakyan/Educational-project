package dao;


import model.Member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {

    static String result;

    public String insert(Member member) {
        Connection connection = ConnectionToUserDB.getRegisterConnection();
        System.out.println("ConnectionToUserDB is " + connection);
        result = "User was registered";
        String sql = "insert into userdb.member values(?,?,?,?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, member.getUsername());
            ps.setString(2, member.getEmail());
            ps.setString(3, member.getPhone());
            ps.setString(4, member.getPassword());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            result = "User wos not registered";
        }
        return result;


    }
}

