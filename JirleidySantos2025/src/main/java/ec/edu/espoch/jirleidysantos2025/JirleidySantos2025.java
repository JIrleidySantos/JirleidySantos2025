/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.jirleidysantos2025;

import ec.edu.espoch.jirleidysantos2025.clases.Producto;
import ec.edu.espoch.jirleidysantos2025.enumeracion.Categoria;

/**
 *
 * @author mundo
 */
public class JirleidySantos2025 {

    public static void main(String[] args) {
        
      Producto objProducto = new Producto();
      
      objProducto.setNombreCliente("Jirleidy Santos");
      objProducto.setNombreProducto("Leche");
      objProducto.setCategoria(Categoria.BEBIDA);
      objProducto.setPrecioProducto(1.50);
      objProducto.getPrecioTotalIva();
      
      objProducto.Imprimir();
      objProducto.Imprimir1();
    }


}
