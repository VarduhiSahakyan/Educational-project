package dao;


import model.Member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {


    public String insert (Member member){
        ConnectionToUserDB.loadDriver();
        Connection connection = ConnectionToUserDB.getRegisterConnection();
        System.out.println("ConnectionToUserDB is " + connection);
        String result = "User was registered";
        String sql = "insert into userdb.member values(?,?,?,?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, member.getUsername());
            ps.setString(2, member.getPassword());
            ps.setString(3, member.getEmail());
            ps.setString(4, member.getPhone());
            ps.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
            result = "Data not entered";
        }
        return result;


    }
}

