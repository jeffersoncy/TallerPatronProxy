package co.edu.unicauca.facade.access;

import co.edu.unicauca.facade.domain.order.Order;
import java.util.List;

/**
 *  Esta interfaz da la firma de lo que debe tener un registro de ordenes
 * 
 * @author Jefferson Eduardo Campo, Hector Esteban Coral
 */
public interface IOrderRepository {
    
    void createOrder(Order order);
    
    List<Order> list();
}
