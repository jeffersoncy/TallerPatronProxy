package co.edu.unicauca.facade.domain.order;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 * Clase orden o pedido
 * @author Jefferson Eduardo Campo - Hector Esteban Coral
 */
public class Order {
    /*
    Atributos de la clase
    */
    private int despatch;
    private Customer customer;
    private LocalDate date;
    private State state;
    private List<Item> details;
    /**
     * Constructor
     * @param customer comprador
     */
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
    
    /**
     * Este método un nuevo item a la lista details
     * @param dish plato
     * @param amount cantidad
     */
    public void addDish(Dish dish,int amount){
        if(this.details == null)
        {
            this.details = new ArrayList<>();
        }
        details.add(new Item(dish,amount));
    }
    
    /**
     * Metodo que calcula el total a pagar segun el numero de platos y su precio
     * @return valor total de tipo entero
     */
    public int calculateTotal(){
        int costo = 0;
        int total = 0;
        for (Item I : this.details) {
            costo = I.getDish().getPrice() * I.getAmount();
            total += costo;
        }
        return total + this.getDespatch();
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
    
}
