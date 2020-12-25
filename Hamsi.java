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
public class Hamsi extends Fish {

    public int boy = 0;

    public Hamsi() {
        super(true);
        System.out.println("bir hamsi doğdu");
    }

    @Override
    public String toString() {
        return super.toString() + " - Hamsi.";
    }

    /**
     *
     * @param s
     
    @Override
   */
 public void bilgi(String s) {

        System.out.println("Hamsi " + s + " cm boyda.");
    }
}
