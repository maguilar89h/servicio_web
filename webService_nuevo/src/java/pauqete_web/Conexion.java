/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pauqete_web;

import com.sun.xml.ws.tx.at.v10.types.PrepareResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Desarrolador1
 */
public class Conexion {

    private final String url = "jdbc:postgresql://localhost:5432/web_service?";
    private final String user = "postgres";
    private final String password = "123456";

    public void getConnection(String id, String nombre) throws SQLException {
        Connection con = null;
        PreparedStatement sentencia = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, user, password);
            //String sql = "INSERT INTO usuario (identificacion,nombre) VALUES id='" + id + "'" + "," + "nombre='" + nombre + "';";
            String sql = "INSERT INTO usuario" + "(identificacion,nombre) VALUES" + "(?,?)";
            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, id);
            sentencia.setString(2, nombre);
            sentencia.executeUpdate();
        } catch (Exception e) {
            e.getMessage();
            System.out.println("error>>>>" + e.getMessage());
            System.out.println("error>>>>" + e.getStackTrace());
        } finally {
            sentencia.close();
            con.close();
        }
    }
}
