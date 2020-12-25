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
public class Fish extends Animal {

    private int sizeInFt;
    private boolean canEat;

    public Fish() {
        System.out.println("Balık oluştu");
    }

    public Fish(boolean canEat) {
        this.canEat = canEat;
        System.out.println("yenilebilir mi alınarak bir Balık oluştu");
    }

    private void swim() {
        System.out.println("Balık yüzüyor.");
    }

    @Override
    public void agePlus() {
        super.agePlus(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {

        return super.toString() + " - Balık";
    }

    @Override
    public  void bilgi(String s) {
        
        System.out.println("Balık "+s+" adet yüzgeçli.");
    }
}

