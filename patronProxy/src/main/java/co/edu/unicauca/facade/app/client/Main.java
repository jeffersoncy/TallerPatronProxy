package co.edu.unicauca.facade.app.client;

import co.edu.unicauca.facade.domain.order.Customer;
import co.edu.unicauca.facade.domain.order.Dish;
import co.edu.unicauca.facade.domain.order.OrderFacade;
import co.edu.unicauca.facade.domain.order.State;
import co.edu.unicauca.proxy.app.IOrderService;
import co.edu.unicauca.proxy.app.OrderServiceLogger;
import co.edu.unicauca.proxy.app.ProxyClient;

/**
 *
 * @author Jefferson Eduardo Campo Yule, Hector Esteban Coral
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //sujeto real.
    OrderFacade facade = new OrderFacade();
    
    //objeto proxy
    IOrderService orderProxy = new OrderServiceLogger(facade);
    
    //operaciones normales con el objeto
    facade.createOrder(new Customer(1, "Carlos Sanchez", "Calle 12 No. 12-12 BarrioCaldas", "3115677899", "Popayán"));
    facade.addDish(new Dish(1, "Hamburguesa vegetariana", 5000), 2);
    facade.addDish(new Dish(2, "Hamburguesa sencilla", 4000), 3);   
    facade.addDish(new Dish(3, "Jugo hit", 1000), 2);
    facade.addDespatch(1500);
    System.out.println("Pedido creado");
    facade.changeState(State.CONFIRMED);
    System.out.println("Se cambio el estado a " + facade.getOrder().getState());
    facade.changeState(State.DISPACHED);
    System.out.println("Se cambio el estado a " + facade.getOrder().getState());
    facade.changeState(State.FINALIZED);
    System.out.println("Se cambio el estado a " + facade.getOrder().getState());
    System.out.println("El valor total del pedido es: " + facade.calculateTotal());
    System.out.println("Total de platos pedidos: " + facade.totalDishes());
    
    //se ejecuta el cliente proxy y se le pasa el sujeto que debe utilizar.
    ProxyClient client = new ProxyClient (orderProxy);
    client.createOrder();
    }
}
