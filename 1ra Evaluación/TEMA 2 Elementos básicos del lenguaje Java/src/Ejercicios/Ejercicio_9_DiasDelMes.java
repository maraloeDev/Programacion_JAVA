/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Ejercicio_9_DiasDelMes {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un dia del mes ");
        
        int mes=teclado.nextInt();
        
        int Enero=31;
        int Febrero=28;
        int Marzo=31;
        int Abril=30;
        int Mayo=30;
        int Junio=30;
        int Julio=30;
        int Agosto=30;
        int Septiembre=30;
        int Octubre=31;
        int Noviembre=30;
        int Diciembre=31;
        
        double resultado = 
                
                (mes==1) ? Enero :
                (mes==2) ? Febrero :
                (mes==3) ? Marzo :
                (mes==4) ? Abril :
                (mes==5) ? Mayo :
                (mes==6) ? Junio :
                (mes==7) ? Julio :
                (mes==8) ? Agosto :
                (mes==9) ? Septiembre :
                (mes==10) ? Octubre :
                (mes==11) ? Noviembre :
                (mes==12) ? Diciembre : 0 ;
        
        System.out.println("El mes elegido es " + mes);
                
    }
    
}
