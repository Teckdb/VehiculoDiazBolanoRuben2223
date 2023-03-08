package vehiculo;

/**
 * La clase VehiculoDiazBolanoRuben2223 representa un vehículo que puede ser
 * comprado y vendido.
 *
 * @author IES Aguadulce
 */
public class VehiculoDiazBolanoRuben2223 {

    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;

    /**
     * Constructor por defecto de la clase VehiculoDiazBolanoRuben2223.
     */
    public VehiculoDiazBolanoRuben2223() {
    }

    /**
     * Constructor de la clase VehiculoDiazBolanoRuben2223 que inicializa todas
     * las propiedades de la clase.
     *
     * @param nom el nombre del vehículo.
     * @param precio el precio del vehículo.
     * @param stock la cantidad de vehículos disponibles en el stock.
     */
    public VehiculoDiazBolanoRuben2223(String nom, double precio, int stock) {
        this.nombre = nom;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Método que asigna el nombre del vehículo.
     *
     * @param nom el nombre del vehículo.
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Método que devuelve el nombre del vehículo.
     *
     * @return el nombre del vehículo.
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Método que devuelve el stock de vehículos disponibles en cada momento.
     *
     * @return el stock de vehículos.
     */
    public int obtenerStock() {
        return getStock();
    }

    /**
     * Método que permite comprar vehículos. Modifica el stock.
     *
     * @param cantidad la cantidad de vehículos a comprar.
     * @throws Exception si la cantidad es negativa.
     */
    public void comprar(int cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        }
        setStock(getStock() + cantidad);
    }

    /**
     * Método que permite vender vehículos. Modifica el stock.
     *
     * @param cantidad la cantidad de vehículos a vender.
     * @throws Exception si la cantidad es negativa o si no hay suficientes
     * vehículos para vender.
     */
    public void vender(int cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede vender una cantidad negativa de vehiculos");
        }
        if (obtenerStock() < cantidad) {
            throw new Exception("No se hay suficientes vehiculos para vender");
        }
        setStock(getStock() - cantidad);
    }

    /**
     * Método que devuelve el nombre del vehículo.
     *
     * @return el nombre del vehículo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre del vehículo.
     *
     * @param nombre el nombre del vehículo.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el precio del vehículo.
     *
     * @return el precio del vehículo.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método que establece el precio del vehículo.
     *
     * @param precio del vehículo.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método que devuelve el precio del IVA.
     *
     * @return precioIVA.
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * Método que establece el precio del IVA.
     *
     * @param precioIVA
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * Método que devuelve el stock de vehiculos.
     *
     * @return stock actual de vehiculos.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Método que establece el stock de vehiculos.
     *
     * @param stock.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

}
