package co.edu.unicauca.facade.domain.order;

import co.edu.unicauca.facade.access.IOrderRepository;
import co.edu.unicauca.proxy.app.IOrderService;

/**
 * Esta clase permite negociar con los subsistemas o conjuntos de clases que son para llevar a cabo un pedido
 *
 * @author Jefferson Eduardo Campo - Hector Esteban Coral
 */
public class OrderFacade implements IOrderService{
    /*
    Atributos de la clase
    */
    private Order order;

    public OrderFacade(){}

    /**
     * @return the order
     */
    public Order getOrder() {
        return order;
    }  
    
    /**
     * Este método se comunica con la clase order ycrea una nueva orden
     * @param customer comprador
     */
    public void createOrder(Customer customer){
        this.order = new Order(customer);
        this.order.setState(State.NEW);
    }
    
    /**
     * Este método se comunica con la clase order y agrega un plato a la lista con su cantidad
     * @param dish plato
     * @param amount cantidad de tipo entero
     */
    public void addDish(Dish dish, int amount){
        order.addDish(dish, amount);
    }
    
//    /**
//     * Método que se comuica con la clase order y modifica el precio de envio
//     * @param despatch valor de envio
//     */
//    public void addDespatch(int despatch){
//        order.setDespatch(despatch);
//    }
    
    /**
     * Método que se comunica con la clase order y cambia el estado de la orden
     * @param state 
     */
    public void changeState(State state){
        order.setState(state);
    }
    
    /**
     * Método especifico que se comunica con la clase order y cambia el estado de orden a cancelado
     */
    public void cancelOrder() {
        order.setState(State.CANCELLED);
    }
    
    /**
     * Método que se comunica con la clase order y obtiene el valor total a pagar
     * @return retorna el valor total que debe pagar el comprador
     */
    public int calculateTotal() {
        return order.calculateTotal();
    }
    
    /**
     * Método que se comunica con la clase order
     * @return retorna el total de platos 
     */
    public int totalDishes() {
        return order.getDetails().size();
    }
    
    /**
     * Método que se comunica con la interfaz de repositorio para posteriormente guardar la orden
     * @param repo repositorio
     */
    @Override
    public void save(IOrderRepository repo){
        repo.createOrder(order);
    }
}
