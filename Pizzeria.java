/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Pizzeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner pizza = new Scanner(System.in);
        int basePizza = 0, queso = 0, tomate = 0, jamon = 0, champ = 0;
        double cantBasePizza, cantKgQueso, cantKgTomate, cantKgJamon, cantKgChamp;
        double venta = 0, ventaDia, cantPizza = 0, montoDia, Pizza;
        int tipoPizza;
        int precio=0;
        int opc;
        int costosT2;
        int otraPizza;
        double montoVenta;
        double comBase = 0, comQueso = 0, comTomate = 0, comJamon = 0, comChamp = 0;
        System.out.println("Ingredientes: \n -Base de Pizza \n -Queso \n -Jamón \n -Tomate \n -Champiñones \n Presione 1 para continuar.");
        opc = pizza.nextInt();
        
        switch(opc){
            case 1:
                System.out.println("Ingrese la cantidad de bases de Pizza");
                basePizza = pizza.nextInt();
            case 2:
                System.out.println("Ingrese la cantidad de Kg. de Queso");
                queso = pizza.nextInt();
            case 3:
                System.out.println("Ingrese la cantidad de Kg. de Jamón");
                jamon = pizza.nextInt();
            case 4:
                System.out.println("Ingrese la cantidad de Kg. de Tomate");
                tomate = pizza.nextInt();
            case 5: 
                System.out.println("Ingrese la cantidad de Kg. de Champiñones");
                champ = pizza.nextInt();
        }
        cantBasePizza = basePizza*500;
        cantKgQueso = queso*5000;
        cantKgJamon = jamon*2500;
        cantKgTomate = tomate*900;
        cantKgChamp = champ*3500;
        do{
        System.out.println("");
        System.out.println("Pizzas: \n 1.- Pizza 1: -Queso \n              -Tomate \n              -Jamon \n "
                + "2.- Pizza 2: -Queso \n              -Tomate \n              -Champiñones \n "
                + "3.- Pizza 3: -Queso \n              -Jamón \n              -Champiñones \n "
                + "4.- Salir.");
        System.out.println("Ingrese que pizza desea");
        tipoPizza = pizza.nextInt();
        
        System.out.println("Ingrese cuantas pizzas desea comprar");
        Pizza = pizza.nextInt();
        
        System.out.println("Si desea otro tipo de pizza aprete cualquier numero mayor que 0, si no aprete 0");
        otraPizza = pizza.nextInt();
        switch(tipoPizza){
            case 1:
                comBase = basePizza - (1*Pizza);
                comQueso = queso - (0.1*Pizza);
                comTomate = tomate - (0.2*Pizza);
                comJamon = jamon - (0.1*Pizza);
                precio = precio + 2500;
                venta = precio*Pizza;
                break;
            case 2:
                comBase = basePizza - (1*Pizza);
                comQueso = queso - (0.2*Pizza);
                comTomate = tomate - (0.2*Pizza);
                comChamp = champ - (0.1*Pizza);
                precio = precio + 3000;
                venta = precio*Pizza;
                break;
            case 3:
                comJamon = jamon - (0.2*Pizza);
                comQueso = queso - (0.2*Pizza);
                comBase = basePizza - (1*Pizza);
                comChamp = champ - (0.2*Pizza);
                precio = precio +3500;
                venta = precio*Pizza;
                System.out.println("");
                break;
        }
        Pizza += Pizza;
        venta++;        
        }while(!(otraPizza==0));
        
        costosT2 = basePizza+queso+jamon+tomate+champ;
        System.out.println("Ingredientes sobrantes: \n -Base Pizza: "+comBase+"\n -Queso: "+comQueso+"Kg"+"\n -Jamon: "+comJamon+"Kg"+"\n -Tomates: "+comTomate+"Kg"+"\n -Champiñones: "+comChamp+"Kg");
        System.out.println("El Costo de su pedido es: $"+venta);
        System.out.println("Venta total de pizzas en el dia: "+Pizza);
        System.out.println("Venta total del dia: $"+venta);
        System.out.println("Cantidad de pizzas pedidas : "+Pizza);
        
        montoDia = venta - (cantBasePizza + cantKgQueso + cantKgJamon + cantKgTomate + cantKgChamp);
        System.out.println("Utilidad final del dia: $"+montoDia);
                
        
    }
    
}