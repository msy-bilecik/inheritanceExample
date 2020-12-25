/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kalitimornek;

/**
 *
 * @author msy
 */
public class Duck extends Animal {

    public String beakColor = "yellow";

    public void swim() {
        System.out.println("Ördek yüzdü.");
    }

    public void quack() {
        System.out.println("Vak Vak QVak ");
    }
    
    public void ageShow()
    {
        System.out.println(this.age);
    }

}
