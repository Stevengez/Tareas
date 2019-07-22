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
    static Scanner lector;
    static boolean b;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        am = new int[13];
        b = false;
        
        am[0] = 0; // Normal Year
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
        
        abm[0] = 0; // bisiest Year
        abm[1] = 31; // Enero
        abm[2] = 29; // Febrero Bisiesto
        abm[3] = 31; // Marzo
        abm[4] = 30; // Abril
        abm[5] = 31; // Mayo
        abm[6] = 30; // Junio
        abm[7] = 31; // Julio
        abm[8] = 31; // Agosto
        abm[9] = 30; // Septiembre
        abm[10] = 31; // Octubre
        abm[11] = 30; // Noviembre
        abm[12] = 31; // Diciembre
        
        lector = new Scanner(System.in);
        
        System.out.println("|| ~ Bienvenido al calculador de dia de la semana            ~");
        System.out.println("|| ~ Debes elegir el dia, mes y a;o pero solo desde 1700     ~");
        System.out.println("|| ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        LeerY();
        LeerM();
        LeerD();
        
        int anos_totales;
        int dias_normales;
        int dias_bisiestos;
        int dias_totales;
        
        if(a<=1700){
            anos_totales = 0;
        }else{
            anos_totales = a-1700; // los anos menos el actual.
        }
        
        System.out.println("Son "+ anos_totales +" anos.");
        dias_normales = anos_totales*365; //  los dias sin considerar bisiestos desde 1700 al ano anterior.
        System.out.println("Son "+ dias_normales +" dias.");
        
        if(anos_totales <4){
            dias_bisiestos = 0;
        }else{
            dias_bisiestos = ((anos_totales)/4); // los dias bisiestos adicionales de los anos desde 1700 al ano anterior.
            System.out.println("La Division da: "+(dias_bisiestos));
            if(b==true){
                dias_bisiestos = dias_bisiestos-1;
            }
            System.out.println("Son "+ dias_bisiestos +" dias bisiestos.");
        }
        
        dias_totales = dias_normales + dias_bisiestos;
        
        int dias;
        dias = dias_totales;
        
        if(m > 1 ){
            for(int r=1;r<(m);r++){
                if(b == true){
                    System.out.println("Tengo "+dias+" y le sume: "+abm[r]);
                    dias = dias + abm[r];
                }else{
                    System.out.println("Tengo "+dias+" y le sume: "+am[r]);
                    dias = dias + am[r];
                }
            }
        }
        
        System.out.println("Tengo "+dias+" y le sume: "+d);
        dias = dias + d;
        
        System.out.println("En un total de: "+dias+" dias.");
        
        int c = dias%7;
        
        System.out.println("Quedan "+c);
        
        if(dias < 8 ){
            switch(dias){
            case 1:
                System.out.println("El "+d+" / "+m+" / "+a+ " es: ");
                System.out.println("Es Viernes");
                break;
            case 2:
                System.out.println("El "+d+" / "+m+" / "+a+ " es: ");
                System.out.println("Es Sabado");
                break;
            case 3:
                System.out.println("El "+d+" / "+m+" / "+a+ " es: ");
                System.out.println("Es Domingo");
                break;
            case 4:
                System.out.println("El "+d+" / "+m+" / "+a+ " es: ");
                System.out.println("Es Lunes");
                break;
            case 5:
                System.out.println("El "+d+" / "+m+" / "+a+ " es: ");
                System.out.println("Es Martes");
                break;
            case 6:
                System.out.println("El "+d+" / "+m+" / "+a+ " es: ");
                System.out.println("Es Miercoles");
                break;
            case 7:   
                System.out.println("El "+d+" / "+m+" / "+a+ " es: ");
                System.out.println("Es Jueves");
                break;
            default:
                System.out.println("Es Viernes tal vez: "+ dias);
            }
            
        }else{
            switch(c){
            case 1:
                System.out.println("El "+d+" / "+m+" / "+a+ " es: ");
                System.out.println("Es Viernes");
                break;
            case 2:
                System.out.println("El "+d+" / "+m+" / "+a+ " es: ");
                System.out.println("Es Sabado");
                break;
            case 3:
                System.out.println("El "+d+" / "+m+" / "+a+ " es: ");
                System.out.println("Es Domingo");
                break;
            case 4:
                System.out.println("El "+d+" / "+m+" / "+a+ " es: ");
                System.out.println("Es Lunes");
                break;
            case 5:
                System.out.println("El "+d+" / "+m+" / "+a+ " es: ");
                System.out.println("Es Martes");
                break;
            case 6:
                System.out.println("El "+d+" / "+m+" / "+a+ " es: ");
                System.out.println("Es Miercoles");
                break;
            default:   
                System.out.println("El "+d+" / "+m+" / "+a+ " es: ");
                System.out.println("Es Jueves");
                break;
            }
        }
    }
    
    public static void LeerY(){
        System.out.println("|| ~  Ingresa el Ano");
        a = Integer.parseInt(lector.nextLine());
        if(a<1700){
            System.out.println("Ingresaste un ano invalido.");
            LeerY();
        }else{
            if(a % 4 == 0){
                b = true;
                System.out.println("Elegiste un ano bisiesto (366 dias).");
            }else{
                b = false;
                System.out.println("Elegiste un ano normal (365 dias).");
            }
            if(a==1700){
                b =false;
            }
        }
    }
    
    public static void LeerM(){
        System.out.println("|| ~  Ingresa el Mes");
        System.out.println("|| ~  1 - Enero     2 - Febrero     3 - Marzo");
        System.out.println("|| ~  4 - Abril     5 - Mayo        6 - Junio");
        System.out.println("|| ~  7 - Julio     8 - Agosto      9 - Septiembre");
        System.out.println("|| ~ 10 - Octubre  11 - Noviembre  12 - Diciembre");
        m = Integer.parseInt(lector.nextLine());
        if(m<1 || m>12){
            System.out.println("Ingresaste un Mes invalido.");
            LeerM();
        }
    }
    
    public static void LeerD(){
        System.out.println("|| ~  Ingresa el Dia");
        d = Integer.parseInt(lector.nextLine());
        if(b ==true){
            if( d <1 || d>abm[m] ){
                System.out.println("Ingresaste un dia invalido. "+d+"mayor que "+abm[m]);
                LeerD();
            }
        }else{
            if(d <1 || d > am[m]){
                System.out.println("Ingresaste un dia invalido. "+d+"mayor que "+abm[m]);
                LeerD();
            }
        }
    }
}
