/**
 * Clase principal que llama a las clases involucradas en el patrón de Estrategia
 */
public class StrategyPatternDemo {
   public static void main(String[] args) {
       //Pedido de una Cheeseburguer
      Context context = new Context(new CheeseBurguer());		
      // Se llama al metodo estrategia con una base predeterminada y un contexto ya dado
      System.out.println("CheeseBurguer Ingredientes: " + context.executeStrategy("Pan, salsas"));

       //Pedido de una GrillBurguer
      context = new Context(new GrillBurguer());		
      // Se llama al metodo estrategia con una base predeterminada y un contexto ya dado
      System.out.println("GrillBurguer Ingredientes: " + context.executeStrategy("Pan, salsas"));

       //Pedido de una Vegan Burguer
      context = new Context(new VeganBurguer());		
      // Se llama al metodo estrategia con una base predeterminada y un contexto ya dado
      System.out.println("VeganBurguer Ingredientes: " + context.executeStrategy("Pan, salsas"));
   }
}