/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.proxy.app;

import co.edu.unicauca.facade.access.IOrderRepository;
import co.edu.unicauca.facade.domain.order.OrderFacade;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Jefferson Eduardo Campo - Hector Esteban Coral
 */
public class OrderServiceLogger implements IOrderService{
    
    private OrderFacade orderFacade;
    
    public OrderServiceLogger(OrderFacade orderFacade){
        this.orderFacade = orderFacade;
    }
    
    @Override
    public void save(IOrderRepository repo) {
        org.slf4j.Logger log = LoggerFactory.getLogger(OrderServiceLogger.class);
        repo.createOrder(orderFacade.getOrder());
        String message = "pedido guardado en la base de datos";
        log.info(message);
    }
    
}
