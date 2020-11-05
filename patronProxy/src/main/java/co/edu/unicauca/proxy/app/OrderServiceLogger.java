package co.edu.unicauca.proxy.app;

import co.edu.unicauca.facade.access.IOrderRepository;
import co.edu.unicauca.facade.domain.order.OrderFacade;
import org.slf4j.LoggerFactory;

/**
 * Esta clase es la muestra un logs o logger para cada servicio o pedido
 * @author Jefferson Eduardo Campo - Hector Esteban Coral
 */
public class OrderServiceLogger implements IOrderService{
    
    private OrderFacade orderFacade;
    
    /**
     * Constructor
     * @param orderFacade  
     */
    public OrderServiceLogger(OrderFacade orderFacade){
        this.orderFacade = orderFacade;
    }
    
    /**
     * Función que guarda una orden en el repositorio
     * @param repo 
     */
    @Override
    public void save(IOrderRepository repo) {
        org.slf4j.Logger log = LoggerFactory.getLogger(OrderServiceLogger.class);
        repo.createOrder(orderFacade.getOrder());
        String message = "pedido guardado en la base de datos";
        log.info(message);
    }
    
}
