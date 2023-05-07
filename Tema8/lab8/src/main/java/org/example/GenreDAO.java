package org.example;

import java.sql.*;
import java.util.Random;

public class GenreDAO {
    public void create(String name) throws SQLException {
        Connection con = Database.getConnection();
        Random rand=new Random();
        int id= rand.nextInt(1,50);
        try (PreparedStatement pstmt = con.prepareStatement(
                "insert into genres (id, name) values (?, ?)")) {
            pstmt.setInt(1,id );
            pstmt.setString(2, name);

            pstmt.executeUpdate();
        }
    }
    public Integer findByName(String name) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(
                     "select id from genres where name='" + name + "'")) {
            return rs.next() ? rs.getInt(1) : null;
        }
    }
    public String findById(int id) throws SQLException {
        Connection con = Database.getConnection();
        try(Statement stmt=con.createStatement();
            ResultSet resultSet=stmt.executeQuery("select name from genres where id=" + id)) {
            return resultSet.next() ? resultSet.getString(1) : null;
        }
    }
}
