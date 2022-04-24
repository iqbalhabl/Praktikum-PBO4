/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

import java.sql.DriverManager;
/**
 *
 * @author iqbal
 */
public class koneksi {
    private static java.sql.Connection hubung;
    public static java.sql.Connection getHubung(){
        if(hubung==null){
            try{
                String url = "jdbc:mysql://localhost:3306/tugasjdbc";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                hubung = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi Terhubung");
            }catch (Exception e){
                System.out.println("Koneksi Gagal Terhubung");
            }
        }return hubung;
    }
    
    public static void main(String[] args){
        getHubung();
    }
}
