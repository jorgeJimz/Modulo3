/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modulo3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Modulo3 {

    public static void main(String[] args) {
        System.out.println("Hola este es mi trabajo modulo3");
        
        int numero_1;
        int numero_2;
        int resultado_2;
        
        Scanner constructor=new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        numero_1=constructor.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        numero_2=constructor.nextInt();
        
        
        resultado_2 =numero_1 * numero_2;
        
        
        
        System.out.println(" Multiplicacion es: "+resultado_2);
    } 
    }

