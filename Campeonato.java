/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonato;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Campeonato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner intro = new Scanner(System.in);
        
        int part=1, pts=0, golFav, golCon, res1=0, res2=0, partEm=0, partPer=0, partGan=0, difGol;
        int cont;
        for(cont=1; cont<=10; cont++){
            System.out.println("Partido"+part);
            System.out.println("Ingrese Goles a favor: ");
            golFav = intro.nextInt();
            System.out.println("Ingrese Goles en contra: ");
            golCon = intro.nextInt();
            res1 = res1 + golFav;
            res2 = res2 + golCon;
            
            if(golFav<golCon){
                System.out.println("Perdieron el partido");
                partPer= partPer+1;
            }else if(golFav>golCon){
                System.out.println("Ganaron el Partido");
                pts = pts +3;
                partGan = partGan+1;
            }else{
                System.out.println("Empataron el partido");
                pts = pts +1;
                partEm = partEm+1;
            }
            part = part+1;
        }
        System.out.println("\nDatos del Campeonato \n");
        System.out.println("Goles a Favor: "+res1);
        System.out.println("Goles en Contra: "+res2);
        System.out.println("Puntos: "+pts);
        System.out.println("Partidos Ganados: "+partGan);
        System.out.println("Partidos Perdidos: "+partPer);
        System.out.println("Partidos Empatados: "+partEm);
        difGol = res1 - res2;
        System.out.println("Diferencia de Goles: "+difGol);
        System.out.println("\nClasificación:\n ");
        if(pts<10){
            System.out.println("Liguilla de Promocion");     
        }
        else if(pts<20){
            System.out.println("No Liguilla");
        }
        else{
            System.out.println("Liguilla de Campeonato");
        }
          
    }
    
}
