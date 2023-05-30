/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Lab Informatika
 */
public class connector {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/perpustakaan";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "";
    private Connection connection;
    
    public connector() {
    try{
        connection = DriverManager.getConnection(DB_URL,DB_USERNAME, DB_PASSWORD);
        }catch(SQLException e){
            System.err.println("Gagal mengkoneksikan ke database;"+ e.getMessage());
        }
    }
    
    public ResultSet executeQuery(String query){
        ResultSet resultset = null;
        try{
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
        }catch(SQLException e){
            System.err.println("Gagal mengkoneksikan ke database;" + e.getMessage());
        }
        return null;
    }
    
    public int executeUpdate(String query){
        int rowsAffected = 0;
        try{
            PreparedStatement statement = connection.prepareStatement(query);
            rowsAffected = statement.executeUpdate();
        }catch(SQLException e){
            System.err.println("Gagal mengkoneksikan ke database;" + e.getMessage());
        }
     
        return rowsAffected;
        
    }
    
    public void close(){
        try{
            //mnenutup koneksi ke database
                if(connection!=null){
                    connection.close();
                }
        }catch(SQLException e){
                System.err.println("Gagal mengkoneksikan ke database;" + e.getMessage());
            }
        }
    
    public Connection getConnection(){
        return connection;
    }
    
}



