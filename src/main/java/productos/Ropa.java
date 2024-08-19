package productos;

public class Ropa extends ProductoBase {
    String talle;
    String marca;

    public Ropa(int id, String nombre, double precio, String talle, String marca) {
        super(id, nombre, precio);
        this.talle = talle;
        this.marca = marca;
    }

    public String getTalle() { return talle; }
    public void setTalle(String talle) { this.talle = talle; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    @Override
    public String toString() {
        return "Ropa{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", talle='" + talle + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}

