
package ec.edu.espoch.productodaoo;
import java.util.List;
/**
 *
 * @author PERSONAL
 */
public class ProductoService {

    private ProductoDAO productoDAO;

    public ProductoService(ProductoDAO productoDAO) {
        this.productoDAO = productoDAO;
    }
    
 public void crearProducto(int id, String nombre, double precio) {
        Producto producto = new Producto(id, nombre, precio);
        productoDAO.agregarProducto(producto);
    }

    public Producto obtenerProducto(int id) {
        return productoDAO.obtenerProductoPorId(id);
    }

    public List<Producto> listarProductos() {
        return productoDAO.obtenerTodosLosProductos();
    }

    public void actualizarProducto(int id, String nombre, double precio) {
        Producto producto = new Producto(id, nombre, precio);
        productoDAO.actualizarProducto(producto);
    }

    public void eliminarProducto(int id) {
        productoDAO.eliminarProducto(id);
    }    
}
