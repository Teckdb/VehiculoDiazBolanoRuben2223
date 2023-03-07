
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoDiazBolanoRuben2223 miVehiculoDiazBolanoRuben2223;
        int stockActual;
        
        miVehiculoDiazBolanoRuben2223 = new VehiculoDiazBolanoRuben2223("Seat",18000,100);
        stockActual = operativaVehiculosDiazBolanoRuben2223(miVehiculoDiazBolanoRuben2223, 50); 
        System.out.println("El stock actual es"+ stockActual );
    }

    private static int operativaVehiculosDiazBolanoRuben2223(VehiculoDiazBolanoRuben2223 miVehiculoDiazBolanoRuben2223, java.lang.Integer cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoDiazBolanoRuben2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoDiazBolanoRuben2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoDiazBolanoRuben2223.obtenerStock();
        return stockActual;
    }

}
    
