/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Formula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner duits = new Scanner(System.in);
        
        int comp;
        int vueltas;
        int tiempo;
        int clasif = 0;
        
        System.out.println("Ingrese cuantos competidores participaran en la carrera");
        comp = duits.nextInt();
        for (int i = 0; i < comp; i++) {
            System.out.println("Ingrese cuantas vueltas tendra la carrera");
            vueltas = duits.nextInt();
            for (int j = 0; j < vueltas; j++) {
                
                System.out.println("Ingrese el tiempo de la vuelta en milisegundos");
                tiempo = duits.nextInt();
                
                if(tiempo<=90500){
                    System.out.println("Felicidades clasifico");
                    clasif += 1;
                }
                
            }
        }
        
    }
    
}
