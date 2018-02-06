/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class ShopCart {
    private ArrayList<ShopItem> items;
    
    public ShopCart(){
        items = new ArrayList();
        items.add(new ShopItem("Dators", 900));
        items.add(new ShopItem("Bikses", 50));
        items.add(new ShopItem("Auto", 10000));
        items.add(new ShopItem("Mobilais", 200));
        items.add(new ShopItem("TV", 550));
        items.add(new ShopItem("Koferis", 100));
        items.add(new ShopItem("Cimdi", 20));
        items.add(new ShopItem("Cepure", 10));
        
        // 1. izvadit visas pieejamas preces + cenu
        System.out.println("Pieejamās precces: ");
        for(ShopItem item : items){
            System.out.println(item.getName() + "=" + item.getPrice() + "$");
        }
        //2. paprasīt lietotājam ievadīt preci
        Scanner input = new Scanner(System.in);
        int sum = 0;
        String text = "";
        do
        {
            System.out.print("Ievadi preces nosaukumu: ");
            text = input.next();
            // ja ievade == "0" tad pārtauc apstrādi un izvada summu
            for(ShopItem item : items){
                if(item.getName().equalsIgnoreCase(text)){
                    sum += item.getPrice(); 
                    break;
                }
                
            }
        }
          
        while (!text.equals("0"));
            
           System.out.println("Kopsumma " + sum + "$"); 
       
        //2.1 ja ievade != "0", tad pieskaiti preci kopsummai
        
       
            
        
        
            
    }
    
}
