/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.facade.domain.order;

/**
 * Clase Customer
 * 
 * @author Jeferson Eduardo Campo - Hector Esteban Coral
 */
public class Customer {
    /*
    Atributos de la clase
    */
    private int id;
    private String name;
    private String address;
    private String mobile;
    private String city; 

    /**
     * Constructor
     * @param id identificación del comprador
     * @param name nombre
     * @param address dirección
     * @param mobile numero celular
     * @param city  ciudad de origen
     */
    public Customer(int id, String name, String address, String mobile, String city) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.city = city;
    }
    
    /**
     * @return el id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id el id para modificar
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return el nombre
     */
    public String getName() {
        return name;
    }


    /**
     * @param name el nombre para modificar
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return la dirección
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address la dirección para modificar
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return el celular
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile el celular para modificar
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return la ciudad
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city la ciudad para modificar
     */
    public void setCity(String city) {
        this.city = city;
    }
    
    
    
}
