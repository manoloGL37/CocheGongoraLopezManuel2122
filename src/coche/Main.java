
package coche;

/**
 *
 * @author Fran
 */
public class Main {
    
      public static void main(String[] args) {
        Coche miCoche;
        int stockActual;
        
        miCoche = new Coche("Opel",12000,500);
        operatoriaVentaGongoraLopezManuel2122(miCoche);
        
        operatoriaCompraGongoraLopezManuel2122(miCoche);
        stockActual = miCoche.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    public static void operatoriaCompraGongoraLopezManuel2122(Coche miCoche) {
        try
        {
            System.out.println("Compra de Coches");
            miCoche.comprar(500);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
    }

    public static void operatoriaVentaGongoraLopezManuel2122(Coche miCoche) {
        try
        {
            System.out.println("Venta de Coches");
            miCoche.vender(300);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
    }

}
    
