
package controladores;

import entidades.articulo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import modelos.modelo_articulo;

/**
 *
 * @author Mau
 */
public class man_articulos {
  
    private articulo actual;
    private List<articulo> lista = new ArrayList();
    private String mensaje;
    
    public man_articulos() {
        actual = new articulo();
        modelo_articulo modelo = new modelo_articulo();
        try{
            lista = modelo.obtener_articulos();
        }catch(SQLException ex){
            mensaje = ex.getMessage();               
        }
    }
    
    public void buscar(){
    modelo_articulo  modelo= new modelo_articulo();
    try{
            lista = (modelo.obtener_articulos_nombre(this.actual.getArtNombre()));
    }catch(SQLException ex){
            mensaje = ex.getMessage();  
    } 
    }
    
    /**
     * @return the actual
     */
    public articulo getActual() {
        return actual;
    }

    /**
     * @param actual the actual to set
     */
    public void setActual(articulo actual) {
        this.actual = actual;
    }

    /**
     * @return the lista
     */
    public List<articulo> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<articulo> lista) {
        this.lista = lista;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
