package productos;

public class Electrodomestico extends ProductoBase{

    private int garantinaEnMeses;

    public Electrodomestico(int id, String nombre, double precio, int garantinaEnMeses) {
        super(id, nombre, precio);
        this.garantinaEnMeses = garantinaEnMeses;
    }


}
