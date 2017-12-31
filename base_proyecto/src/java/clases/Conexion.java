
package clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Mau
 */
public class Conexion {
    
    private Connection  con = null;
    private String url;
    private String usuario;
    private String contrasena;
    
    public Connection conectar(){
        
        try{
            Class.forName ("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.err.println("Error no se puede encontrar la clase mysql");
        }
        try{
            url       = "jdbc:mysql://localhost:3306/produccion";
            usuario   = "root";
            contrasena= "your password";
            con       = DriverManager.getConnection(url,usuario,contrasena);
        
        }catch(Exception e){
        
            System.out.println("Error al crear la conexion:" + e.getMessage());
        }
            System.out.println("getConnection");
            return con;
    }
    
}
