/**
 * Clase que representa los elementos que caracterizan una Cheeseburguer 
 */
public class CheeseBurguer implements Strategy{
    /**
     * Método que agrega a la base los elementos propios de una Cheeseburguer
     * @param base Elementos base de una hamburguesa
     */
   @Override
   public String makeHamburguer(String base) {
       String total = base+", carne rellena de queso, extra queso";
      return total;
   }
}