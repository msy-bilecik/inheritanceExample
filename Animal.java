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
public class Animal {

    /**
     *
     */
    protected  int age;

    public Animal() {
        System.out.println("bir hayvan oluşturuldu. ");
    }
  
    
    public String gender;
    
    public boolean isMammal(){
        
        return true;
    }
    public void mate()
    {
        System.out.println("mate fonksiyonu");
    }
    public void agePlus()
    {
        this.age++;
    }
    
    @Override
    public String toString(){
    
        return "Hayvan";
    }
    
    public void bilgi(String s){
    
        System.out.println("Hayvan "+s+" adet bacaklı.");
    }
}
