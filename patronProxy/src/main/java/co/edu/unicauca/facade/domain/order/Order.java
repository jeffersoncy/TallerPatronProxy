/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.facade.domain.order;
import co.edu.unicauca.facade.domain.order.Customer;
import java.time.LocalDate;
import java.util.List;
/**
 *
 * @author Personal
 */
public class Order {
    private int despatch;
    private Customer customer;
    private LocalDate date;
    private Enum state;
    private List<Item>details;

    public Order(int despatch, Customer customer, LocalDate date, Enum state, List<Item> details) {
        this.despatch = despatch;
        this.customer = customer;
        this.date = date;
        this.state = state;
        this.details = details;
    }

    /**
     * @return the despatch
     */
    public int getDespatch() {
        return despatch;
    }

    /**
     * @param despatch the despatch to set
     */
    public void setDespatch(int despatch) {
        this.despatch = despatch;
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
    public Enum getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(Enum state) {
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
    
    
}
