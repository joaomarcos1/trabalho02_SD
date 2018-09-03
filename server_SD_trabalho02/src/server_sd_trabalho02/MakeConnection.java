/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_sd_trabalho02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nupasd-ufpi
 */
public class MakeConnection {
      public static Connection getConnection() {
        String db_url = "jdbc:mysql://localhost/sd";
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection(db_url, "root", "root");

        } catch (ClassNotFoundException ex) {
            System.out.println("Driver mysql nao encontrado");
        } catch (SQLException ex) {
            System.out.println("Erro ao tentar conectar ao mysql");
        }
        return con;
}
}
