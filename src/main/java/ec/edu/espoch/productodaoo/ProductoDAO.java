
package ec.edu.espoch.productodaoo;

import java.util.List;

/**
 *
 * @author PERSONAL
 */
public interface ProductoDAO {
    
    
    void agregarProducto(Producto producto);
    Producto obtenerProductoPorId(int id);
    List<Producto> obtenerTodosLosProductos();
    void actualizarProducto(Producto producto);
    void eliminarProducto(int id);

  
}
