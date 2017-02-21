/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uge.pkg4.classes;


class Pyramide {
    	private double længde;
	private double højde;

        
        	public Pyramide(double l, double h){
                System.out.println("Classen kører nu og målene er: " + l + " er længden og:  "+ h+ " er højden " );
                
                længde = l;
                højde = h;
                }
                
                public double metoden() {
                double volumen = ((længde*længde*højde)/4);
                return volumen;
                }
}
