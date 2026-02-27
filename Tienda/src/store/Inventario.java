package store;
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
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
        double total = 0;

        for (Producto p : productos) {
            total += p.getPrecio() * p.getCantidad();
        }

        return total;
    }

    public Producto buscarProductoPorCodigo(String codigo) {

        for (Producto p : productos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }

        return null;
    }


    public double calcularPromedioPrecios() {

        double suma = 0;

        for (Producto p : productos) {
            suma += p.getPrecio();
        }

        return suma / productos.size();
    }


    public Producto obtenerProductoConMenorCantidad() {

        Producto menor = productos.get(0);

        for (Producto p : productos) {
            if (p.getCantidad() < menor.getCantidad()) {
                menor = p;
            }
        }

        return menor;
    }

}
