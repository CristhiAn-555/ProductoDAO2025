
package ec.edu.espoch.productodaoo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PERSONAL
 */
public class ProductoDAOImpl implements ProductoDAO {
    
    private List<Producto> productos = new ArrayList<>();

    @Override
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public Producto obtenerProductoPorId(int id) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Producto> obtenerTodosLosProductos() {
        return productos;
    }

    @Override
    public void actualizarProducto(Producto producto) {
        Producto p = obtenerProductoPorId(producto.getId());
        if (p != null) {
            p.setNombre(producto.getNombre());
            p.setPrecio(producto.getPrecio());
        }
    }

    @Override
    public void eliminarProducto(int id) {
        productos.removeIf(p -> p.getId() == id);
    }
}
