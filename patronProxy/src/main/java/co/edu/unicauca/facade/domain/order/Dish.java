package co.edu.unicauca.facade.domain.order;

/**
 * Clase Plato
 * @author Jeferson Campo - Hector Coral
 */
public class Dish {
    private int id;
    private String name;
    private int price;

    /**
     * Constructor para el plato
     * @param id código del plato
     * @param name nombre
     * @param price precio
     */
    public Dish(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }   
}
