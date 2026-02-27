package store;
import java.util.ArrayList;

public class Tienda {
    private String nombre;
    private Inventario inventario;
    private ArrayList<Cliente> clientes;
    private ArrayList<Venta> ventas;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.inventario = new Inventario();
        this.clientes = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente buscarCliente(String id) {
        for (Cliente c : clientes) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void registrarVenta(Venta venta) {
        ventas.add(venta);
    }

    public void mostrarVentas() {
        for (Venta v : ventas) {
            v.mostrarDetalle();
            System.out.println("=====================");
        }
    }
}
