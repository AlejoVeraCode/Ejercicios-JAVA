import java.util.List;

public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    public Producto() {
    }

    public Producto(int id, String nombre, double precio, int cantidadEnStock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }
    //Getter y Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    public static Producto buscarProducto(List<Producto> lista, String nombre) {
        for (Producto producto : lista) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public static List<Producto> buscarPorRango(List<Producto> lista, double precio, double precio2) {
        List<Producto>temp = null;
        for (Producto producto : lista) {
            if (producto.getPrecio()>precio &&  producto.getPrecio() < precio2) {
                temp.add(producto);
            }
        } return temp;

}}
