/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Eduardo
 */
public class Ejercicio_6_Intercambio {

    public static void main(String[] args) {

        int a = 5;

        int b = 8;

        System.out.println("Valor inicial de a : " + a + " Valor inicial de b " + b);

        int inter1 = a = b;
        int inter2 = b = a;

        System.out.println("Intercambio 1: " + inter1);
        System.out.println("Intercambio 2: " + inter2);
    }

}
