package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class userDao {

    public boolean registerUser(String username, String password, String roles){

            String sql = "INSERT INTO users (username, password, roles, status) VALUES (?, ?, ?, 'PENDING')";

            try(Connection conn =DatabaseConnection.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)){

             pstmt.setString(1, username);
             pstmt.setString(2, password);
             pstmt.setString(3, roles.toUpperCase());
             pstmt.execute();
             System.out.println("-> Successful Registration, Waiting For Approval!");
             return true;
            }catch (SQLException e){
                System.err.println("Failed: " + e.getMessage());
                return false;
            }

    }
}
