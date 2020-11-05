package co.edu.unicauca.facade.access;

/**
 * Factoria o fabrica que instancia el repositorio de pedidos.
 * 
 * @author Jefferson Eduardo Campo, Hector Esteban Coral
 */
public class Factory {

    private static Factory instance;
    /**
     * Constructor
     */
    private Factory(){}
    
    /**
     * Clase singleton
     *
     * @return retorna la instancia. Donde si se ah creado una vez no permitira que se vuelva a instanciar.
     */
    public static Factory getInstance() {
        if(instance == null){
            instance = new Factory();
        }
        return instance;
    }
    /**
     * Método que crea una instancia concreta de la jerarquia IOrderRepository
     *
     * @param type cadena que indica qué tipo de clase hija debe instanciar
     * @return una clase hija de la abstracción IOrderRepository
     */
    public IOrderRepository getRepository(String type) {
        IOrderRepository resultado = null;
        if (type.equals("default")) {
            resultado = new OrderRepositoryList();
        }
        return resultado;
    }
}
