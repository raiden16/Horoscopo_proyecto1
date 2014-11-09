/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LVL.proyecto1.controllers;

/**
 *
 * @author USUARIO
 */
public class Pitonisa {
    Futuro futuro;

    public Pitonisa() {
    }

    public Pitonisa(Futuro futuro) {
        this.futuro = futuro;
    }
    
    public String obtenerfuturo(String parametro){
        return futuro.leerfuturo(parametro);
    }
}
