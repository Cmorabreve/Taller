/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simce;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class SIMCE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner simce = new Scanner(System.in);
        int cantCol;
        int contCol;
        int contColInsuf = 0;
        int contColBueno = 0;
        int contColSuf = 0;
        int ptje = 0;
        int ptjeCol = 0;
        int contEst;
        int cantEst;
        int promPtjeCol;
        int contMalo = 0, contBueno = 0, contSuf = 0;
        int mejorPtje = 0, peorPtje = 600;
        int mejorCol = 0, peorCol = 0;
        
        System.out.println("Ingrese la cantidad de colegios");
        cantCol = simce.nextInt();
        for (contCol = 1; contCol < cantCol; contCol++) {

                System.out.println("Ingrese cantidad de estudiantes");
                cantEst = simce.nextInt();

            for (contEst = 1; contEst <cantEst; contEst++) {
                
                do{
                    System.out.println("Ingrese Puntaje Estudiante "+contEst+" colegio "+contCol);
                    ptje = simce.nextInt();
                }while(ptje>=0 && ptje<=600);
                ptjeCol = ptjeCol + ptje;
                if(ptje<300){
                    contMalo += contMalo;
                }else{
                    if(ptje<500){
                        contSuf += contSuf;
                    }else{
                        contBueno += contBueno;
                    }
                }
                contEst += contEst;
            }
            promPtjeCol = ptjeCol/cantEst;
            if(contMalo>=0.7*cantEst){
                System.out.println("El Colegio "+contCol+" es Insuficiente");
                contColInsuf += contColInsuf;
            }else{
                if(contBueno>0.7*cantEst){
                    System.out.println("El Colegio "+contCol+" es Bueno");
                    contColBueno += contColBueno;
                }else{
                    System.out.println("El Colegio "+contCol+" es Suficiente");
                    contColSuf += contColSuf;
                }
            }
            if(promPtjeCol>mejorPtje){
                mejorCol = contCol;
                mejorPtje = promPtjeCol;			
            }
            if(promPtjeCol<peorPtje){
                peorCol = contCol;
                peorPtje = promPtjeCol;			
            }
            contCol += contCol;
        }
	System.out.println("Insuficiente: "+contColInsuf);
	System.out.println("Suficiente: "+contColSuf);
        System.out.println("Bueno: "+contColBueno);
        System.out.println("El Mejor Colegio: "+mejorCol);
        System.out.println("El peor colegio: "+peorCol);
    }
        
}
