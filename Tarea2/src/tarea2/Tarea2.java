/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import java.util.Scanner;

/**
 *
 * @author propietario
 */
public class Tarea2 {
    static Scanner lector;
    static int a;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        lector = new Scanner(System.in);
        
        System.out.println("|| ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("|| ~ Bienvenido al calculador de numeros primos              ~");
        System.out.println("|| ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("");
        System.out.println("~ Ingresa un numero entero positivo: ");
        a = Integer.parseInt(lector.nextLine());
        
        System.out.println("Numeros primos entre 0 y "+a+" :");
        for(int b=1;b<=a;b++){
            int c=0;
            for(int o=1;o<b;o++){
                if(b%o==0){
                    c++;
                }
            }
            if(c<2){
                System.out.println("Encontre un numero primo, es: "+b);
                c=0;
            }
        }
        
    }
    
}
