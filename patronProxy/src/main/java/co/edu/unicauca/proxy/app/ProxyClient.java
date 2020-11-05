package co.edu.unicauca.proxy.app;

import co.edu.unicauca.facade.access.Factory;
import co.edu.unicauca.facade.access.IOrderRepository;

/**
 * Lleva logs o loggers de llamados al sujeto real
 * @author Jefferson Eduardo Campo - Hector Esteban Coral
 */
public class ProxyClient {
    
    private IOrderService orderService;
    /**
     * Constructor
     * @param orderService sujeto
     */
    public ProxyClient(IOrderService orderService) {
        this.orderService = orderService;
    }
    
    /**
     * Crea una instancia del repositorio y posteriormente la guarda
     */
    public void createOrder() {
        IOrderRepository repo = Factory.getInstance().getRepository("default");
        orderService.save(repo);
    }
}
