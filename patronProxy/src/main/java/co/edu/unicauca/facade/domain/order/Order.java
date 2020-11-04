/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.facade.domain.order;
import java.time.LocalDate;
import java.util.List;
/**
 *
 * @author Personal
 */
public class Order {
    public int despatch;
    private Customer customer;
    private LocalDate date;
    private State state;
    private List<Item>details;

    public Order(Customer customer) {
        this.customer = customer;
    }
    
    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * @return the state
     */
    public State getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * @return the details
     */
    public List<Item> getDetails() {
        return details;
    }

    /**
     * @param details the details to set
     */
    public void setDetails(List<Item> details) {
        this.details = details;
    }
    
    public void addDish(Dish dish,int amount){
        
    }
    
    public int calculateTotal(){
        return 1;
    }
}
