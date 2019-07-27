/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg2;

/**
 *
 * @author propietario
 */
public class Bolsa {
    Elemento inicio,ultimo;
    int cantidad_elementos;
    
    public Bolsa(){
        inicio = null;
        cantidad_elementos = 0;
    }
    
    public void poner(Object nuevo_elemento){
        Elemento nuevo;
        nuevo = new Elemento(nuevo_elemento);
        if(inicio==null){
            inicio = nuevo;
            ultimo = nuevo;
            ultimo.setSiguiente(inicio);
        }else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            ultimo.setSiguiente(inicio);
        }
    }
    
}
