/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.facade.domain.order;

/**
 *
 * @author Personal
 */
public class OrderFacade {
    private Order order;

    public OrderFacade(){}

    
    /**
     * @return the order
     */
    public Order getOrder() {
        return order;
    }  
    
    public void createOrder(Customer customer){
        this.order = new Order(customer);
    }
    
    public void addDish(Dish dish, int amount){
        order.addDish(dish, amount);
    }
    
    public void changeState(State state){
        order.setState(state);
    }
    
    public void cancelOrder() {
        order.setState(State.CANCELLED);
    }
    
    public int calculateTotal() {
        return order.calculateTotal();
    }
    
    public int totalDishes() {
        return order.getDetails().size();
    }
    
//    public void save(IOrderRepository repo){
//        repo.createrOrder(order);
//    }
}
