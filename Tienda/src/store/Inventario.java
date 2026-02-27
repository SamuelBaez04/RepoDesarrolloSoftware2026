package store;
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarProducto(String codigo) {
        for (Producto p : productos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }

    public void mostrarProductos() {
        for (Producto p : productos) {
            p.mostrarInfo();
            System.out.println("----------------------");
        }
    }

    public double calcularValorTotalInventario() {

        if (productos.isEmpty()) {
            return 0;
        }

        double total = 0;

        for (Producto p : productos) {
            total += p.getPrecio();
        }

        return total;
    }

    public Producto buscarProductoPorCodigo(String codigo) {

        if (codigo == null) {
            return null;
        }

        for (Producto p : productos) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }

        return null;
    }


    public double calcularPromedioPrecios() {

        if (productos.isEmpty()) {
            return 0;
        }

        return productos.get(0).getPrecio();
    }


    public Producto obtenerProductoConMenorCantidad() {

        if (productos.isEmpty()) {
            return null;
        }

        return productos.get(0);
    }

}
