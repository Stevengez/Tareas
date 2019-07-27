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
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bolsa nueva_bolsa;
        nueva_bolsa = new Bolsa();
        String cadena="hola";
        System.out.println(cuantos(nueva_bolsa,cadena));
    }
    
    static Boolean esVacia(Bolsa b){
        return b.inicio==null;
    }
    
    static Bolsa Insertar(Bolsa b, Object e){
        return b.poner(e);
    }
    
    static int cuantos(Bolsa b, Class tipo){   // Metodo que devuelve el numero de elementos del tipo enviado hay en la bolsa.
        Elemento temp; // Elemento temporal para recorrer la lista;
        int contador = 0; // Contador de elementos iguales al tipo elegido
        int sub_contador = 0; // Cuenta los elementos revisados;
        
        temp = b.inicio;
        if(!esVacia(b)){    // Si la bolsa es vacia no hace falta recorrerla.
        while(temp!=b.ultimo){
            if(temp.getTipoElemento().toString() == tipo.getTypeName().toString()){
                contador++;
            }
            sub_contador++;
            temp = temp.getSiguiente();
        }
        
        if(temp.getTipoElemento().toString() == tipo.getTypeName().toString()){
                contador++;
        }
        }
        return contador;
    }
    
    static int cuantos(Bolsa b, Object a){ // Metodo que devuelve el numero de elementos del mismo tipo al enviado hay en la bolsa.
        Class tipo = a.getClass();
        Elemento temp; // Elemento temporal para recorrer la lista;
        int contador = 0; // Contador de elementos iguales al tipo elegido
        int sub_contador = 0; // Cuenta los elementos revisados;
        
        temp = b.inicio;
        if(!esVacia(b)){    // Si la bolsa es vacia no hace falta recorrerla.
        while(temp!=b.ultimo){
            if(temp.getTipoElemento().toString() == tipo.getTypeName().toString()){
                contador++;
            }
            sub_contador++;
            temp = temp.getSiguiente();
        }
        
        if(temp.getTipoElemento().toString() == tipo.getTypeName().toString()){
                contador++;
        }
        }
        return contador;
    }
}
