
/**
 * Clase que representa los elementos que caracterizan una VeganBurguer
 */
public class VeganBurguer implements Strategy{
   /**
     * Método que agrega a la base los elementos propios de una VeganBurguer
     * @param base Elementos base de una hamburguesa
     */ 
   @Override
   public String makeHamburguer(String base) {
       String total = base+", vegetales, carne de lentejas";
      return total;
   }
}