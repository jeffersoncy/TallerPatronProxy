package co.edu.unicauca.facade.access;

import co.edu.unicauca.facade.domain.order.Order;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase representa la lista de pedidos en la cual se almacenan en dicha lista
 * 
 * @author Jefferson Eduardo Campo, Hector Esteban Coral
 */
public class OrderRepositoryList implements IOrderRepository {

    /**
     * Array List de pedidos
     */
    private static List<Order> orders;
    
    /**
     * Constructor 
     */
    public OrderRepositoryList(){
        orders = new ArrayList<Order>();
    }
    /**
     * método que guarda las ordenes en la lista
     * @param order Orden se agrega a la lista
     */
    @Override
    public void createOrder(Order order) {
        orders.add(order);
    }
    /**
     * Método para obtener la lista de ordenes o pedidos
     * @return retorna la lista.
     */
    @Override
    public List<Order> list() {
        return orders;
    }
    
}
