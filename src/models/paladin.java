/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Random;

public class paladin extends Personaje {

    static public final int gillotineataque = 5;
    public static final int ataquepaladinBase = 20;
    
    public paladin(String nombre) {
        super(Personaje.vidaMax, ataquepaladinBase, nombre);
    }

    public paladin(int pt_vida, int pt_ataque, String nombre) {
        super(pt_vida, pt_ataque, nombre);
    }
    
    @Override
    public void atacar(Personaje objetivo) {
        if (objetivo != null && !objetivo.equals(this) && objetivo instanceof Aldeano) {

            Random rand = new Random();
            int randomNum = rand.nextInt((5 - 1) + 1) + 1;
            if (randomNum == gillotineataque) {
                objetivo.setPt_vida(0);
            } else {
                super.atacar(objetivo);
            }
        }

    }

}
