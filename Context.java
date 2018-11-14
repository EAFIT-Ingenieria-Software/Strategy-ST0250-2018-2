/**
 * Clase que representa el contexto según el cual se eligirá la estrategia a llevar a cabo 
 */
public class Context {
    /**
     * Estrategia que se implementará en la situación
     */
   private Strategy strategy;

   public Context(Strategy strategy){
      this.strategy = strategy;
   }

   /**
    * Método que ejecuta la estrategia 
    * @param base Elementos pertenecientes al contexto que deben ser utlizados en todas las estrategias
    */
   public String executeStrategy(String base){
      return strategy.makeHamburguer(base);
   }
}