/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.util.Scanner;

/**
 *
 * @author propietario
 */
public class Tarea1 {
    static int a,m,d;
    static int[] am;
    static int[] abm;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        am = new int[13];
        
        am[0] = 365; // Normal Year
        am[1] = 31; // Enero
        am[2] = 28; // Febrero Normal
        am[3] = 31; // Marzo
        am[4] = 30; // Abril
        am[5] = 31; // Mayo
        am[6] = 30; // Junio
        am[7] = 31; // Julio
        am[8] = 31; // Agosto
        am[9] = 30; // Septiembre
        am[10] = 31; // Octubre
        am[11] = 30; // Noviembre
        am[12] = 31; // Diciembre
        
        abm = new int[13];
        
        am[0] = 366; // Normal Year
        am[1] = 31; // Enero
        am[2] = 29; // Febrero Bisiesto
        am[3] = 31; // Marzo
        am[4] = 30; // Abril
        am[5] = 31; // Mayo
        am[6] = 30; // Junio
        am[7] = 31; // Julio
        am[8] = 31; // Agosto
        am[9] = 30; // Septiembre
        am[10] = 31; // Octubre
        am[11] = 30; // Noviembre
        am[12] = 31; // Diciembre
        
        
        Scanner lector = new Scanner(System.in);
        System.out.println("|| ~ Bienvenido al calculador de dia de la semana            ~");
        System.out.println("|| ~ Debes elegir el dia, mes y a;o pero solo desde 1700     ~");
        System.out.println("|| ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("|| ~ Ingresa el Ano");
        a = lector.nextInt(0);
        
        
    }
    
}
