/**
 * Clase que representa los elementos que caracterizan una GrillBurguer 
 */
public class GrillBurguer implements Strategy{
    /**
     * Método que agrega a la base los elementos propios de una GrillBurguer
     * @param base Elementos base de una hamburguesa
     */
   @Override
   public String makeHamburguer(String base) {
       String total = base+", tocineta asada, doble carne";
      return total;
   }
}