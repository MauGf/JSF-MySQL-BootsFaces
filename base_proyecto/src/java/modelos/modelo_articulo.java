/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import clases.Conexion;
import entidades.articulo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mau
 */
public class modelo_articulo {
    public List<articulo> obtener_articulos() throws SQLException
    {
         Conexion           con = new Conexion();
         Connection    conectar = con.conectar();
         String             sql = "select * from articulo";
         PreparedStatement  cmd = conectar.prepareStatement(sql);
         ResultSet           rs = cmd.executeQuery();
         List<articulo>   lista = new ArrayList<articulo>();
         while(rs.next())
         {
             articulo entidad = new articulo();
             entidad.setArtCodigo(rs.getInt("ArtCodigo"));
             entidad.setArtNombre(rs.getString("ArtNombre"));
             entidad.setArtPrecio(rs.getDouble("ArtPrecio"));
             entidad.setArtStock(rs.getInt("ArtStock"));
             entidad.setCatCodigo(rs.getInt("CatCodigo"));
             entidad.setProCodigo(rs.getInt("ProCodigo"));
             lista.add(entidad);
         }
         rs.close();
         conectar.close();
         return lista;
    }
     public List<articulo> obtener_articulos_nombre(String nombre) throws SQLException
    {
         Conexion con = new Conexion();
         Connection  conectar = con.conectar();
         String sql = "select * from articulo where ArtNombre LIKE ?";
         PreparedStatement cmd = conectar.prepareStatement(sql);
         cmd.setString(1,'%'+nombre+'%');
         ResultSet rs = cmd.executeQuery();
         List<articulo> lista = new ArrayList<articulo>();
         while(rs.next())
         {
             articulo entidad = new articulo();
             entidad.setArtCodigo(rs.getInt("ArtCodigo"));
             entidad.setArtNombre(rs.getString("ArtNombre"));
             entidad.setArtPrecio(rs.getDouble("ArtPrecio"));
             entidad.setArtStock(rs.getInt("ArtStock"));
             entidad.setCatCodigo(rs.getInt("CatCodigo"));
             entidad.setProCodigo(rs.getInt("ProCodigo"));
             lista.add(entidad);
         }
         rs.close();
         conectar.close();
         return lista;
    }   
}
