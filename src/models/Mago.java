/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


public class Mago extends Personaje{

    private int healpower;
    
    public Mago(int pt_vida, int pt_ataque, String nombre, int healpower) {
        super(pt_vida, pt_ataque, nombre);
        this.healpower=healpower;
    }

    public int getHealpower() {
        return healpower;
    }

    public void setHealpower(int healpower) {
        this.healpower = healpower;
    }
    
    
    public void heal (Personaje objetivo){
        if(objetivo!=null && objetivo.getPt_vida() > 0
                && objetivo.getPt_vida() < Personaje.vidaMax){
            objetivo.setPt_vida(objetivo.getPt_vida() + this.healpower);
    
    }
    
    
}
}