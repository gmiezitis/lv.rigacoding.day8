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
public class Diamond {
    public static void draw(int n){
        //atstarpju loops
        for(int row = 1;row <=n; row++){
            
            for(int spaces = 1; spaces <= n - row; spaces++){
                
                System.out.print(" ");
                
            }
             //zvaigniisu loops
             for(int stars = 1;stars <= 2*row-1; stars++){
                 System.out.print("*");
                 
             }
            System.out.println();
        }
        for(int row = n - 1; row>= - 1; row--){
            
            for(int spaces = 1; spaces <= n - row; spaces++){
                
                System.out.print(" ");
                
            }
             //zvaigniisu loops
             for(int stars = 1;stars <= 2*row-1; stars++){
                 System.out.print("*");
                 
             }
            System.out.println();
        }
    }
}
