/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uge.pkg4.classes;

/**
 *
 * @author Oii
 */
public class benytPyramide {
    
    public static void main(String[] args) {
        
        System.out.println("Indtast siden på din pyramide, angivet i meter");
        java.util.Scanner side = new java.util.Scanner(System.in);
        double tal = side.nextInt();  
        
        System.out.println("Indtast højden på din pyramide, angivet i meter");
        java.util.Scanner hight = new java.util.Scanner(System.in);
        double tal2 = side.nextInt(); 
        
        Pyramide py1 = new Pyramide (tal, tal2);
        System.out.println("Volumen kan udregnes og er: " + py1.metoden() + " kilo");
        
        
        
    }
    
}
