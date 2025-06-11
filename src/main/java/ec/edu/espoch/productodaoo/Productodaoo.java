

package ec.edu.espoch.productodaoo;

/**
 *
 * @author PERSONAL
 */
public class Productodaoo {

    public static void main(String[] args) {
          ProductoDAO productoDAO = new ProductoDAOImpl();
        ProductoService productoService = new ProductoService(productoDAO);

        productoService.crearProducto(1, "Laptop", 1000.0);
        productoService.crearProducto(2, "teclado", 10.0);

        System.out.println("Lista de productos:");
        for (Producto p : productoService.listarProductos()) {
            System.out.println(p.getId() + " - " + p.getNombre() + " : $" + p.getPrecio());
        }

        productoService.actualizarProducto(2, "teclado", 10.0);

        Producto producto = productoService.obtenerProducto(2);
        System.out.println("Producto actualizado: " + producto.getNombre() + " - $" + producto.getPrecio());

        productoService.eliminarProducto(1);

        System.out.println("Lista tras eliminación:");
        for (Producto p : productoService.listarProductos()) {
            System.out.println(p.getId() + " - " + p.getNombre() + " : $" + p.getPrecio());
        }
    }
    
}
