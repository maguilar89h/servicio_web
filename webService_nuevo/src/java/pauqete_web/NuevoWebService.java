/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pauqete_web;

import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Manuel Aguilar
 */
@WebService(serviceName = "NuevoWebService")
public class NuevoWebService {

    public static String encriptar(String palabra) {
        String pal = "";
        int n = 9;
        if (false) {
            System.out.println("Error intente con otro número menor");
        } else {

            String[] vector_defecto = {"0","1","2","3","4","5","6","7","8","9","a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
            char[] vector_defecto3 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y','z','0','1','2','3','4','5','6','7','8','9'};
            String[] vector_nuevo = new String[vector_defecto.length];
            String[] vector_rest = new String[n];
            int[] pos_palabra = new int[palabra.length()];
            for (int i = n; i <= vector_defecto.length; i++) {
                for (int j = 0; j < vector_defecto.length - n; j++, i++) {
                    vector_nuevo[j] = vector_defecto[i];
                }
            }
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= vector_rest.length - 1; j++, i++) {
                    vector_rest[j] = vector_defecto[i];
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                for (int j = vector_defecto.length - 1; i >= 0; j--, i--) {
                    vector_nuevo[j] = vector_rest[i];
                }
            }

            for (int i = 0; i <= vector_defecto3.length - 1; i++) {
                for (int j = 0; j < palabra.length(); j++) {
                    //System.out.println("letras>>"+palabra.length());
                    char r = palabra.charAt(j);
                    if (vector_defecto3[i] == r) {
                        pos_palabra[j] = i;
                    }
                }
            }
            String[] palabra_codificada = new String[pos_palabra.length];

            for (int i = 0; i < vector_nuevo.length - 1; i++) {
                for (int j = 0; j < pos_palabra.length; j++) {
                    palabra_codificada[j] = vector_nuevo[pos_palabra[j]];
                }
            }

            for (int i = 0; i <= palabra_codificada.length - 1; i++) {
                pal = pal + palabra_codificada[i];

            }
        }
        return pal;
    }

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "setNombrePersona")
    public void setNombrePersona(@WebParam(name = "id") final String id, @WebParam(name = "nombre") final String nombre) throws SQLException {
        Conexion con = new Conexion();
        con.getConnection(id, nombre);

    }

}
