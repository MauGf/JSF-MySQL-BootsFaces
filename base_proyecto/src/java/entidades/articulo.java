/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Mau
 */
public class articulo {
    private int ArtCodigo     = 0;
    private String ArtNombre  = "";
    private int ProCodigo     = 0;
    private int CatCodigo     = 0;
    private double ArtPrecio;
    private int ArtStock      = 0;

    /**
     * @return the ArtCodigo
     */
    public int getArtCodigo() {
        return ArtCodigo;
    }

    /**
     * @param ArtCodigo the ArtCodigo to set
     */
    public void setArtCodigo(int ArtCodigo) {
        this.ArtCodigo = ArtCodigo;
    }

    /**
     * @return the ArtNombre
     */
    public String getArtNombre() {
        return ArtNombre;
    }

    /**
     * @param ArtNombre the ArtNombre to set
     */
    public void setArtNombre(String ArtNombre) {
        this.ArtNombre = ArtNombre;
    }

    /**
     * @return the ProCodigo
     */
    public int getProCodigo() {
        return ProCodigo;
    }

    /**
     * @param ProCodigo the ProCodigo to set
     */
    public void setProCodigo(int ProCodigo) {
        this.ProCodigo = ProCodigo;
    }

    /**
     * @return the CatCodigo
     */
    public int getCatCodigo() {
        return CatCodigo;
    }

    /**
     * @param CatCodigo the CatCodigo to set
     */
    public void setCatCodigo(int CatCodigo) {
        this.CatCodigo = CatCodigo;
    }

    /**
     * @return the ArtPrecio
     */
    public double getArtPrecio() {
        return ArtPrecio;
    }

    /**
     * @param ArtPrecio the ArtPrecio to set
     */
    public void setArtPrecio(double ArtPrecio) {
        this.ArtPrecio = ArtPrecio;
    }

    /**
     * @return the ArtStock
     */
    public int getArtStock() {
        return ArtStock;
    }

    /**
     * @param ArtStock the ArtStock to set
     */
    public void setArtStock(int ArtStock) {
        this.ArtStock = ArtStock;
    }     
}
