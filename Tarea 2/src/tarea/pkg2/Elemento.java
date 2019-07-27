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
public class Elemento {
    Elemento siguiente;
    Object elemento;
    public Elemento(Object elemento){
        this.elemento = elemento;
    }
    
    Object getValor(){
        return elemento;
    }
    
    String getTipoElemento(){
        System.out.println("Em pidieron el tipo de elemento de: "+elemento.getClass().getTypeName());
        return elemento.getClass().getTypeName();
    }
    
    public void setValor(Object nuevo_valor){
        elemento = nuevo_valor;
    }
    
    public void setSiguiente(Elemento siguiente_elemento){
        siguiente = siguiente_elemento;
    }
    
    Elemento getSiguiente(){
        return siguiente;
    }
}
