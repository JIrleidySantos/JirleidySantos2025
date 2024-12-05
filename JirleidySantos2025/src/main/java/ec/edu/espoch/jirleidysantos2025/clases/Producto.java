/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.jirleidysantos2025.clases;

import ec.edu.espoch.jirleidysantos2025.enumeracion.Categoria;

/**
 *
 * @author mundo
 */
public class Producto {
    
   private String nombreCliente;
   private String nombreProducto;
   private double precioProducto;
   private double precioTotalIva;
   private double precioTotal;
   private Categoria categoria;

    public Producto() {
    }

    public void Imprimir(){
        System.out.println("El nombre del Cliente es: "+this.nombreCliente);
        System.out.println("El nombre del Producto es: "+this.nombreProducto);
    }
    
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public double getPrecioTotalIva() {
        return precioTotalIva;
    }

    public void setPrecioTotalIva(double precioTotalIva) {
        this.precioTotalIva = precioTotalIva;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double precioTotalconIva(){
        return precioTotalIva*0.12 ;
        
    }
    
    public void Imprimir1(){
        System.out.println("El precio del producto sin Iva es: "+this.precioProducto);
        System.out.println("El precio del producto con Iva es: "+this.precioTotalIva);
    }
}
