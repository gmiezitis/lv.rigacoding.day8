/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day8;

/**
 *
 * @author oscar
 */
public class ShopItem {

    private double price;

    private String name;

    public ShopItem(String name, double price) {
        this.price = price;
        this.name = name;

    }

    public double getPrice() {
        return this.price;
    }
    public String getName(){
        return this.name;
    

    }
}
