/**
 * El paquete vehiculo contiene las clases relacionadas con los vehículos.
 */
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
/**
 * La clase Main contiene el método principal que crea y utiliza un objeto de la
 * clase VehiculoDiazBolanoRuben2223 para realizar operaciones de compra y venta
 * y obtener el stock actual.
 */
public class Main {

    /**
     * El método principal de la clase Main crea un objeto
     * VehiculoDiazBolanoRuben2223 y llama al método
     * operativaVehiculosDiazBolanoRuben2223 para realizar operaciones de compra
     * y venta y obtener el stock actual del vehículo.
     *
     * @param args los argumentos de la línea de comandos (no se utilizan en
     * este caso)
     */
    public static void main(String[] args) {
        // Crear un objeto VehiculoDiazBolanoRuben2223
        VehiculoDiazBolanoRuben2223 miVehiculoDiazBolanoRuben2223;
        // Variable para almacenar el stock actual
        int stockActual;

        miVehiculoDiazBolanoRuben2223 = new VehiculoDiazBolanoRuben2223("Seat", 18000, 100);
        // Llamar al método operativaVehiculosDiazBolanoRuben2223 para realizar operaciones de compra y venta
        stockActual = operativaVehiculosDiazBolanoRuben2223(miVehiculoDiazBolanoRuben2223, 50);
        // Imprimir el stock actual
        System.out.println("El stock actual es" + stockActual);
    }

    /**
     * El método operativaVehiculosDiazBolanoRuben2223 realiza operaciones de
     * compra y venta sobre un objeto de la clase VehiculoDiazBolanoRuben2223 y
     * devuelve el stock actual.
     *
     * @param miVehiculoDiazBolanoRuben2223 el objeto de la clase
     * VehiculoDiazBolanoRuben2223 sobre el que se realizarán las operaciones de
     * compra y venta
     * @param cantidad la cantidad de vehículos que se van a vender
     * @return el stock actual después de realizar las operaciones de compra y
     * venta
     */
    private static int operativaVehiculosDiazBolanoRuben2223(VehiculoDiazBolanoRuben2223 miVehiculoDiazBolanoRuben2223, java.lang.Integer cantidad) {
        int stockActual;
        try {
            System.out.println("Venta de Vehiculos");
            miVehiculoDiazBolanoRuben2223.vender(20);
        } catch (Exception e) {
            System.out.print("Fallo al vender");
        }
        try {
            System.out.println("Compra de Vehiculos");
            miVehiculoDiazBolanoRuben2223.comprar(100);
        } catch (Exception e) {
            System.out.print("Fallo al comprar");
        }
        // Obtener el stock actual
        stockActual = miVehiculoDiazBolanoRuben2223.obtenerStock();
        return stockActual;
    }

}
