/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LVL.proyecto1.controllers;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Zodiaco implements Futuro{
    private ArrayList<Signo> signos;
    
    public Zodiaco(){
    signos=new ArrayList<Signo>(12);
    Signo virgo=new Signo("virgo","Se te pasara tu vuelo cuando viajes");
    Signo aries=new Signo("aries","Te orinara un perro saliendo de la escuela");
    Signo cancer=new Signo("cancer","Se te caera el helado a la primera provada");
    Signo escorpion=new Signo("escorpion","Se te manchara de mole la camisa");
    Signo geminis=new Signo("geminis","Tu novia te saldra con un domingo 7");
    Signo piscis=new Signo("piscis","Se te pegara una goma de mascar en el pantalon");
    Signo tauro=new Signo("tauro","Te pasaras de tu estacion del metro");
    Signo libra=new Signo("libra","Taparas el baño de los papas de tu novi@");
    Signo acuario=new Signo("acuario","te caera popo de paloma");
    Signo leo=new Signo("leo","se perdera tu memoria donde tienes tu tarea");
    Signo sagitario=new Signo("sagitario","te entrar tierra en los ojos");
    Signo capricornio=new Signo("capricornio","La salsa te picara mucho");
    
    signos.add(virgo);
    signos.add(aries);
    signos.add(cancer);
    signos.add(escorpion);
    signos.add(geminis);
    signos.add(piscis);
    signos.add(tauro);
    signos.add(libra);
    signos.add(acuario);
    signos.add(leo);
    signos.add(sagitario);
    signos.add(capricornio);

            }
    public String leerfuturo(String parametro) {
      String tuFuturo="Tu signo no está disponible :(";
      for(Signo s:signos){
      if(parametro.equalsIgnoreCase(s.getNombre())){
          tuFuturo=s.getPrediccion();
                }
          
          }
        return tuFuturo;
    }
    
}
