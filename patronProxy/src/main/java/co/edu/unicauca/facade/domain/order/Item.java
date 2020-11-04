/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.facade.domain.order;

import co.edu.unicauca.facade.domain.order.Dish;
/**
 *
 * @author Jeferson Campo - Hector Coral
 */
public class Item {
    private Dish  dish;
    private int amount;

    public Item(Dish dish, int amount) {
        this.dish = dish;
        this.amount = amount;
    }

    /**
     * @return the dish
     */
    public Dish getDish() {
        return dish;
    }

    /**
     * @param dish the dish to set
     */
    public void setDish(Dish dish) {
        this.dish = dish;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
}